package com.walmart.services.ckpcg.dao;
//package com.walmart.ckpservice.dao;
//
//import java.net.URL;
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Iterator;
//import java.util.List;
//
//import com.google.common.io.Resources;
//import com.walmartlabs.ckpservice.dao.model.PIIData;
//import com.walmartlabs.ckpservice.dao.model.PIIData;
//import com.walmartlabs.ckpservice.dao.model.PIIDataDao;
//import com.walmartlabs.ckpservice.dao.model.SearchCriteria;
//import com.walmartlabs.ckpservice.dao.model.TransactionData;
//import com.walmartlabs.ckpservice.dao.model.TransactionDataMonthly;
//import com.walmartlabs.dal.cassandra.CassandraService;
//import com.walmartlabs.dal.cassandra.DALCassandraConnectionPool;
//import com.walmartlabs.dal.client.DAL;
//import com.walmartlabs.dal.client.DALResult;
//import com.walmartlabs.dal.client.ServiceFactory;
//import com.walmartlabs.dal.core.Role;
//import com.walmartlabs.dal.core.pool.DALConnectionManager;
//
//public class ServiceDaoUsingDalImpl implements ServiceDao 
//{
//	private static final String CAS_ROLE_NAME = "mystuff";
//	Role role = null;
//	
//	public ServiceDaoUsingDalImpl(){
//		
//		try{
//			final URL hostConfigUrl = Resources.getResource("dal-host-config.json");
//		    final URL dataConfigUrl = Resources.getResource("dal-data-config.json");
//		    
//		    //DAL.getInstance().setConfiguration(hostConfigUrl.openStream(), dataConfigUrl.openStream());
//		    DAL.getInstance().setConfiguration(hostConfigUrl.openStream());
//		    
//		    // Create a connection pool with a maximum of 42 connections.
//		    role = new Role(CAS_ROLE_NAME);
//		    DALCassandraConnectionPool dccp = new DALCassandraConnectionPool(42, role);
//		    DALConnectionManager.getInstance().registerConnectionPool(dccp);
//		    DALConnectionManager.getInstance().activatePools();
//		    
//		    final CassandraService cas = ServiceFactory.getOrCreateByRole(role, CassandraService.class);
////	        cas.postSolrConfig(Resources.getResource("solrconfig.xml"), "account");
////	        cas.postSolrSchema(Resources.getResource("schema.xml"), "account");
//		}
//		catch (Exception e){
//			e.printStackTrace();
//		}
//	}
//	
//	@Override
//	public List<PIIData> findCustomer(SearchCriteria criteria) 
//	{
//		List<PIIData> customers = new ArrayList<PIIData>();
//		
//		PIIData customer = new PIIData();
//		customer.setFirstName("Willy");
//		customer.setLastName("Wonda");
//		customer.setDob("12/09/1920");
//		
//		PIIData customer2 = new PIIData();
//		customer2.setFirstName("Willy");
//		customer2.setLastName("Wonda Jr");
//		customer2.setDob("12/09/1900");
//		
//		customers.add(customer);
//		customers.add(customer2);
//		return customers;
//	}
//
//	@Override
//	public Collection<PIIData> getPIIDataByCUID(String cuid) 
//	{
//		PIIDataDao dao = new PIIDataDao();
//		DALResult<PIIData> result = dao.getByPrimaryKey(cuid);
//		Collection<PIIData> customers = result.getResults();
//		return customers;
//	}
//
//	@Override
//	public TransactionData getTransactionByIUID(String id) {
//		TransactionData txData = new TransactionData();
//		txData.setCurr12MoAvgBetweenVisitDayQty(35);
//		return txData;
//	}
//
//	@Override
//	public TransactionData getTransactionByHHUID(String id) {
//		TransactionData txData = new TransactionData();
//		txData.setCurr12MoAvgBetweenVisitDayQty(35);
//		return txData;
//	}
//
//	@Override
//	public TransactionDataMonthly getTransactionByMonth(String begin, String end) {
//		TransactionDataMonthly txDataByMonth = new TransactionDataMonthly();
//		txDataByMonth.setAvgBsktSize(789);
//		txDataByMonth.setNumVisits(76);
//		return txDataByMonth;
//	}
//
//	@Override
//	public Collection<PIIData> insertCustomer(PIIData customer) {
//		PIIDataDao dao = new PIIDataDao();
//		DALResult<PIIData> result = dao.put(customer);
//		return result.getResults();
//	}
//}
