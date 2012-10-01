package com.walmart.services.ckpcg.dao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="TxResult")
public class TxResult {
	@Id
	private String cuid;
	
	@Column(name="storeNbr")	
	private String storeNbr;
	
	@Column(name="txTimeStamp")
	private String txTimeStamp;
	
	private String countryCode;
	private String city;
	private String amount;
	public String getCuid() {
		return cuid;
	}
	public void setCuid(String cuid) {
		this.cuid = cuid;
	}
	public String getStoreNbr() {
		return storeNbr;
	}
	public void setStoreNbr(String storeNbr) {
		this.storeNbr = storeNbr;
	}
	public String getTxTimeStamp() {
		return txTimeStamp;
	}
	public void setTxTimeStamp(String txTimeStamp) {
		this.txTimeStamp = txTimeStamp;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
		
}
