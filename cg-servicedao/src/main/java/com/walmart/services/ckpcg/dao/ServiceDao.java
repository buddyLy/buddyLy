package com.walmart.services.ckpcg.dao;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import me.prettyprint.cassandra.service.ColumnSliceIterator;

import com.walmart.services.ckpcg.auth.model.AppGroupRoles;
import com.walmart.services.ckpcg.auth.model.UserGroupInfo;
import com.walmart.services.ckpcg.dao.model.PIIData;
import com.walmart.services.ckpcg.dao.model.SearchCriteria;
import com.walmart.services.ckpcg.dao.model.TxResult;

public interface ServiceDao 
{
	public Collection<PIIData> getPIIDataByCUID(String cuid);
	public Collection<PIIData> insertPIIData(PIIData customer);
	public List<PIIData> findCustomer(SearchCriteria criteria);
	public ColumnSliceIterator<String, String, String> getCARDataByCUID(String id);
	public List<TxResult> getTransactionByCUID(String id, Date startDate, Date endDate);	
	public AppGroupRoles findACLGroup(String groupID);
	public UserGroupInfo findACLUser(String userID);
}


