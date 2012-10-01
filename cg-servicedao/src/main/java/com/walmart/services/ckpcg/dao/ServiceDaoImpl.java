package com.walmart.services.ckpcg.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import me.prettyprint.cassandra.serializers.LongSerializer;
import me.prettyprint.cassandra.serializers.StringSerializer;
import me.prettyprint.cassandra.service.CassandraHostConfigurator;
import me.prettyprint.cassandra.service.ColumnSliceIterator;
import me.prettyprint.cassandra.service.template.ColumnFamilyResult;
import me.prettyprint.cassandra.service.template.ColumnFamilyTemplate;
import me.prettyprint.cassandra.service.template.ColumnFamilyUpdater;
import me.prettyprint.cassandra.service.template.ThriftColumnFamilyTemplate;
import me.prettyprint.hector.api.Cluster;
import me.prettyprint.hector.api.Keyspace;
import me.prettyprint.hector.api.beans.HColumn;
import me.prettyprint.hector.api.exceptions.HectorException;
import me.prettyprint.hector.api.factory.HFactory;
import me.prettyprint.hector.api.mutation.MutationResult;
import me.prettyprint.hector.api.mutation.Mutator;
import me.prettyprint.hector.api.query.SliceQuery;
import me.prettyprint.hom.EntityManagerImpl;

import com.walmart.services.ckpcg.auth.model.AppGroupRoles;
import com.walmart.services.ckpcg.auth.model.UserGroupInfo;
import com.walmart.services.ckpcg.dao.model.CARData;
import com.walmart.services.ckpcg.dao.model.PIIData;
import com.walmart.services.ckpcg.dao.model.SearchCriteria;
import com.walmart.services.ckpcg.dao.model.TxResult;

public class ServiceDaoImpl implements ServiceDao 
{
	EntityManagerImpl entityManager = null;
	Keyspace keySpace = null;
	public ServiceDaoImpl(){
		final Cluster cluster = HFactory.getOrCreateCluster("Customer", new CassandraHostConfigurator("cerl400038:9160"));
		keySpace = HFactory.createKeyspace("CustomerKnowledge", cluster);
        entityManager = new EntityManagerImpl(keySpace, "com.walmart");       		
	}
	
	@Override
	public Collection<PIIData> getPIIDataByCUID(String cuid) {
		PIIData piiData = entityManager.find(PIIData.class, cuid);
        System.out.println("the name is: " + piiData.getFirstName());
        Collection<PIIData> myCol = new ArrayList<PIIData>();
        myCol.add(piiData);
		return myCol;
	}

	@Override
	public Collection<PIIData> insertPIIData(PIIData piiData) {
		PIIData myPIIData = entityManager.persist(piiData);
        System.out.println(myPIIData.getFirstName());
        Collection<PIIData> myCol = new ArrayList<PIIData>();
        myCol.add(myPIIData);
        return myCol;
	}

	@Override
	public List<PIIData> findCustomer(SearchCriteria criteria) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TxResult> getTransactionByCUID(String id, Date startDate, Date endDate) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public ColumnSliceIterator<String, String, String> getCARDataByCUID(String id) 
	{		
		SliceQuery<String, String, String> query = HFactory.createSliceQuery(keySpace, StringSerializer.get(),
	    	    StringSerializer.get(), StringSerializer.get()).
	    	    setKey(id).setColumnFamily("CARData");

		ColumnSliceIterator<String, String, String> columnIterator = 
	    	    new ColumnSliceIterator<String, String, String>(query, null, "\uFFFF", false);
	    
		return columnIterator;
	}
	
	public void getCARAttrDataByCUID(String id, String[] attr)
	{
		/*
		try{
		ColumnQuery<String, String, String> columnQuery = HFactory.createStringColumnQuery(keySpace);
        columnQuery.setColumnFamily("PIIData");
        columnQuery.setKey(id);
        columnQuery.setName("firstName");
        QueryResult<HColumn<String, String>> colResult = columnQuery.execute();
		HColumn<String, String> hColumn = colResult.get();
		
		System.out.println("Execution time: " + colResult.getExecutionTimeMicro());
        System.out.println("CassandraHost used: " + colResult.getHostUsed());
        System.out.println("Query Execute: " + colResult.getQuery());
        
        System.out.println(hColumn.getName() + ": " + hColumn.getValue());
		}
		catch (Exception e){
			e.printStackTrace();
		}
		*/
		
		ColumnFamilyTemplate<String, String> template = 
                new ThriftColumnFamilyTemplate<String, String>(keySpace,
                											   "PIIData",
                                                               StringSerializer.get(),        
                                                               StringSerializer.get());
		try {
		    ColumnFamilyResult<String, String> res = template.queryColumns(id);
		    String value = res.getString(attr[0]);
		} catch (HectorException e) {
		    // do something ...
		}
	}
	
	public void deleteColumn(String cuid, String columnName)
	{
		ColumnFamilyTemplate<String, String> template = 
                new ThriftColumnFamilyTemplate<String, String>(keySpace,
                											   "PIIData", 
                                                               StringSerializer.get(),        
                                                               StringSerializer.get());
		try {
		    template.deleteColumn(cuid, columnName);
		} catch (HectorException e) {
		    // do something
		}
	}
	
	public void updateColumn(String cuid, String columnName)
	{	
		ColumnFamilyTemplate<String, String> template = 
                new ThriftColumnFamilyTemplate<String, String>(keySpace,
                											   "PIIData", 
                                                               StringSerializer.get(),        
                                                               StringSerializer.get());
		
		// <String, String> correspond to key and Column name.
		ColumnFamilyUpdater<String, String> updater = template.createUpdater(cuid);
		updater.setString("firstName", "new name");
		updater.setLong("time", System.currentTimeMillis());

		try {
		    template.update(updater);
		} catch (HectorException e) {
		    // do something ...
		}
	}

	@Override
	public AppGroupRoles findACLGroup(String groupID) {
		AppGroupRoles appGroupRoles = entityManager.find(AppGroupRoles.class, groupID);
		return appGroupRoles;
	}

	@Override
	public UserGroupInfo findACLUser(String userID) {
		UserGroupInfo userGroupInfo = entityManager.find(UserGroupInfo.class, userID);
		return userGroupInfo;
	}

	public void insertCARData(CARData carData)
	{
		CARData myCARData = entityManager.persist(carData);
		System.out.println("car data: " + myCARData.toString());
		
//		Mutator<String> mutator = HFactory.createMutator(keySpace, StringSerializer.get());
//        
//        mutator.addInsertion("CA Burlingame", "StateCity", HFactory.createColumn(650L, "37.57x122.34",LongSerializer.get(),StringSerializer.get()));
//        mutator.addInsertion("650", "AreaCode", HFactory.createStringColumn("Burlingame__650", "37.57x122.34"));
//        mutator.addInsertion("650222", "Npanxx", HFactory.createStringColumn("lat", "37.57"));
//        mutator.addInsertion("650222", "Npanxx", HFactory.createStringColumn("lng", "122.34"));
//        mutator.addInsertion("650222", "Npanxx", HFactory.createStringColumn("city", "Burlingame"));
//        mutator.addInsertion("650222", "Npanxx", HFactory.createStringColumn("state", "CA"));                
//        
//        MutationResult mr = mutator.execute();
	}
}
