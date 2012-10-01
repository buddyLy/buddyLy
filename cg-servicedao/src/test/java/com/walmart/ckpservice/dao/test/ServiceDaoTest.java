package com.walmart.ckpservice.dao.test;

import java.util.Collection;

import me.prettyprint.cassandra.service.ColumnSliceIterator;
import me.prettyprint.hector.api.beans.HColumn;

import org.junit.Test;

import com.walmart.services.ckpcg.dao.ServiceDao;
import com.walmart.services.ckpcg.dao.ServiceDaoImpl;
import com.walmart.services.ckpcg.dao.model.CARData;
import com.walmart.services.ckpcg.dao.model.PIIData;

public class ServiceDaoTest 
{
	ServiceDao serviceDao = null;
	
	public ServiceDaoTest()
	{
		serviceDao = new ServiceDaoImpl();
	}
	
	@Test
	public void trickJunit(){
		
	}
	
	public void testInsertCustomer(){		
		PIIData customer = new PIIData();
		customer.setCuid("cuid123");
		customer.setFirstName("Willy");
		customer.setLastName("Nelson");
		customer.setEmail("willy@yahoo.com");
		customer.setDob("12/09/1920");
		customer.setPhoneNumber("479-273-395");
		
		Collection<PIIData> customers = serviceDao.insertPIIData(customer);
		for (PIIData customer1:customers){
			System.out.println(customer1.getFirstName());
		}
	}
	
	@Test
	public void testGetCustomer(){
		Collection<PIIData> customers = serviceDao.getPIIDataByCUID("cuid123");
		for (PIIData customer1:customers){
			System.out.println(customer1.getFirstName());
		}		
	}
	

	public void testGetCARData(){
		ColumnSliceIterator<String, String, String> columnIterator = serviceDao.getCARDataByCUID("cuid123");
		
		while (columnIterator.hasNext()) {
    	    HColumn<String, String> hColumn = columnIterator.next();
    	    System.out.println("Name: " + hColumn.getName());
    	    System.out.println("Value: " + hColumn.getValue());
    	}
		
		System.out.println();
	}
	
	
	public void insertCARData(){
		ServiceDaoImpl impl = new ServiceDaoImpl();
		
		CARData carData = new CARData();
		carData.setCuid("cuid123");
		carData.setFirstTxnDate("12/09/1983");
		carData.setFirstTxnStoreNbr("8209");
		carData.setFirstTxnStoreCountryCode("US");
		carData.setLastTxnDate("12/09/2007");
		carData.setLastTxnStoreNbr("8209");
		
		impl.insertCARData(carData);
	}
}
