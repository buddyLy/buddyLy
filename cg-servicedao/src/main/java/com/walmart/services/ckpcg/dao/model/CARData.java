package com.walmart.services.ckpcg.dao.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import me.prettyprint.hom.annotations.Column;
import me.prettyprint.hom.annotations.Id;

@Entity
@Table(name="CARData")
public class CARData 
{
	@Id
	@Column(name="cuid")
	private String cuid;
	
	@Column(name="firstTxnDate")
	private String firstTxnDate;
	
	@Column(name="firstTxnStoreNbr")
	private String firstTxnStoreNbr;
	
	@Column(name="firstTxnStoreCountryCode")
	private String firstTxnStoreCountryCode;
	
	@Column(name="lastTxnDate")
	private String lastTxnDate;
	
	@Column(name="lastTxnStoreNbr")
	private String lastTxnStoreNbr;
	
	private String lastTxnStoreCountryCode;
	private String threeMoUniqueVisitStoreCnt;
	private String curr12MoUniqueVisitStoreCnt;
	private String prev12MoUniqueVisitStoreCnt;
	private String curr12MoAvgBetweenVisitDayQty;
	private String curr12MoMaxBetweenVisitDayQty;
	private String curr12MoTenderTypeQty;
	private String tenureDayQty;
	private String recencyDayQty;
	private String threeMoVisitCnt;
	private String curr12MoVisitCnt;
	private String prev12MoVisitCnt;
	private String threeMoAvgVisitAmt;
	private String curr12MoAvgVisitAmt;
	private String prev12MoAvgVisitAmt;
	private String threeMoAvgVisitUniqueItemCnt;
	private String curr12MoAvgVisitUniqueItemCnt;
	private String prev12MoAvgVisitUniqueItemCnt;
	private String threeMoSpendAmt;
	private String curr12MoSpendAmt;
	private String prev12MoSpendAmt;
	private String curr12MoAvgMoSpendAmt;
	private String prev12MoAvgMoSpendAmt;
	private String curr12MoWgtAvgMoSpendAmt;
	private String curr12MoAvgMoVisitCnt;
	private String prev12MoAvgMoVisitCnt;
	private String curr12MoWgtAvgMoVisitCnt;
	public String getCuid() {
		return cuid;
	}
	public void setCuid(String cuid) {
		this.cuid = cuid;
	}
	public String getFirstTxnDate() {
		return firstTxnDate;
	}
	public void setFirstTxnDate(String firstTxnDate) {
		this.firstTxnDate = firstTxnDate;
	}
	public String getFirstTxnStoreNbr() {
		return firstTxnStoreNbr;
	}
	public void setFirstTxnStoreNbr(String firstTxnStoreNbr) {
		this.firstTxnStoreNbr = firstTxnStoreNbr;
	}
	public String getFirstTxnStoreCountryCode() {
		return firstTxnStoreCountryCode;
	}
	public void setFirstTxnStoreCountryCode(String firstTxnStoreCountryCode) {
		this.firstTxnStoreCountryCode = firstTxnStoreCountryCode;
	}
	public String getLastTxnDate() {
		return lastTxnDate;
	}
	public void setLastTxnDate(String lastTxnDate) {
		this.lastTxnDate = lastTxnDate;
	}
	public String getLastTxnStoreNbr() {
		return lastTxnStoreNbr;
	}
	public void setLastTxnStoreNbr(String lastTxnStoreNbr) {
		this.lastTxnStoreNbr = lastTxnStoreNbr;
	}
	public String getLastTxnStoreCountryCode() {
		return lastTxnStoreCountryCode;
	}
	public void setLastTxnStoreCountryCode(String lastTxnStoreCountryCode) {
		this.lastTxnStoreCountryCode = lastTxnStoreCountryCode;
	}
	public String getThreeMoUniqueVisitStoreCnt() {
		return threeMoUniqueVisitStoreCnt;
	}
	public void setThreeMoUniqueVisitStoreCnt(String threeMoUniqueVisitStoreCnt) {
		this.threeMoUniqueVisitStoreCnt = threeMoUniqueVisitStoreCnt;
	}
	public String getCurr12MoUniqueVisitStoreCnt() {
		return curr12MoUniqueVisitStoreCnt;
	}
	public void setCurr12MoUniqueVisitStoreCnt(String curr12MoUniqueVisitStoreCnt) {
		this.curr12MoUniqueVisitStoreCnt = curr12MoUniqueVisitStoreCnt;
	}
	public String getPrev12MoUniqueVisitStoreCnt() {
		return prev12MoUniqueVisitStoreCnt;
	}
	public void setPrev12MoUniqueVisitStoreCnt(String prev12MoUniqueVisitStoreCnt) {
		this.prev12MoUniqueVisitStoreCnt = prev12MoUniqueVisitStoreCnt;
	}
	public String getCurr12MoAvgBetweenVisitDayQty() {
		return curr12MoAvgBetweenVisitDayQty;
	}
	public void setCurr12MoAvgBetweenVisitDayQty(
			String curr12MoAvgBetweenVisitDayQty) {
		this.curr12MoAvgBetweenVisitDayQty = curr12MoAvgBetweenVisitDayQty;
	}
	public String getCurr12MoMaxBetweenVisitDayQty() {
		return curr12MoMaxBetweenVisitDayQty;
	}
	public void setCurr12MoMaxBetweenVisitDayQty(
			String curr12MoMaxBetweenVisitDayQty) {
		this.curr12MoMaxBetweenVisitDayQty = curr12MoMaxBetweenVisitDayQty;
	}
	public String getCurr12MoTenderTypeQty() {
		return curr12MoTenderTypeQty;
	}
	public void setCurr12MoTenderTypeQty(String curr12MoTenderTypeQty) {
		this.curr12MoTenderTypeQty = curr12MoTenderTypeQty;
	}
	public String getTenureDayQty() {
		return tenureDayQty;
	}
	public void setTenureDayQty(String tenureDayQty) {
		this.tenureDayQty = tenureDayQty;
	}
	public String getRecencyDayQty() {
		return recencyDayQty;
	}
	public void setRecencyDayQty(String recencyDayQty) {
		this.recencyDayQty = recencyDayQty;
	}
	public String getThreeMoVisitCnt() {
		return threeMoVisitCnt;
	}
	public void setThreeMoVisitCnt(String threeMoVisitCnt) {
		this.threeMoVisitCnt = threeMoVisitCnt;
	}
	public String getCurr12MoVisitCnt() {
		return curr12MoVisitCnt;
	}
	public void setCurr12MoVisitCnt(String curr12MoVisitCnt) {
		this.curr12MoVisitCnt = curr12MoVisitCnt;
	}
	public String getPrev12MoVisitCnt() {
		return prev12MoVisitCnt;
	}
	public void setPrev12MoVisitCnt(String prev12MoVisitCnt) {
		this.prev12MoVisitCnt = prev12MoVisitCnt;
	}
	public String getThreeMoAvgVisitAmt() {
		return threeMoAvgVisitAmt;
	}
	public void setThreeMoAvgVisitAmt(String threeMoAvgVisitAmt) {
		this.threeMoAvgVisitAmt = threeMoAvgVisitAmt;
	}
	public String getCurr12MoAvgVisitAmt() {
		return curr12MoAvgVisitAmt;
	}
	public void setCurr12MoAvgVisitAmt(String curr12MoAvgVisitAmt) {
		this.curr12MoAvgVisitAmt = curr12MoAvgVisitAmt;
	}
	public String getPrev12MoAvgVisitAmt() {
		return prev12MoAvgVisitAmt;
	}
	public void setPrev12MoAvgVisitAmt(String prev12MoAvgVisitAmt) {
		this.prev12MoAvgVisitAmt = prev12MoAvgVisitAmt;
	}
	public String getThreeMoAvgVisitUniqueItemCnt() {
		return threeMoAvgVisitUniqueItemCnt;
	}
	public void setThreeMoAvgVisitUniqueItemCnt(String threeMoAvgVisitUniqueItemCnt) {
		this.threeMoAvgVisitUniqueItemCnt = threeMoAvgVisitUniqueItemCnt;
	}
	public String getCurr12MoAvgVisitUniqueItemCnt() {
		return curr12MoAvgVisitUniqueItemCnt;
	}
	public void setCurr12MoAvgVisitUniqueItemCnt(
			String curr12MoAvgVisitUniqueItemCnt) {
		this.curr12MoAvgVisitUniqueItemCnt = curr12MoAvgVisitUniqueItemCnt;
	}
	public String getPrev12MoAvgVisitUniqueItemCnt() {
		return prev12MoAvgVisitUniqueItemCnt;
	}
	public void setPrev12MoAvgVisitUniqueItemCnt(
			String prev12MoAvgVisitUniqueItemCnt) {
		this.prev12MoAvgVisitUniqueItemCnt = prev12MoAvgVisitUniqueItemCnt;
	}
	public String getThreeMoSpendAmt() {
		return threeMoSpendAmt;
	}
	public void setThreeMoSpendAmt(String threeMoSpendAmt) {
		this.threeMoSpendAmt = threeMoSpendAmt;
	}
	public String getCurr12MoSpendAmt() {
		return curr12MoSpendAmt;
	}
	public void setCurr12MoSpendAmt(String curr12MoSpendAmt) {
		this.curr12MoSpendAmt = curr12MoSpendAmt;
	}
	public String getPrev12MoSpendAmt() {
		return prev12MoSpendAmt;
	}
	public void setPrev12MoSpendAmt(String prev12MoSpendAmt) {
		this.prev12MoSpendAmt = prev12MoSpendAmt;
	}
	public String getCurr12MoAvgMoSpendAmt() {
		return curr12MoAvgMoSpendAmt;
	}
	public void setCurr12MoAvgMoSpendAmt(String curr12MoAvgMoSpendAmt) {
		this.curr12MoAvgMoSpendAmt = curr12MoAvgMoSpendAmt;
	}
	public String getPrev12MoAvgMoSpendAmt() {
		return prev12MoAvgMoSpendAmt;
	}
	public void setPrev12MoAvgMoSpendAmt(String prev12MoAvgMoSpendAmt) {
		this.prev12MoAvgMoSpendAmt = prev12MoAvgMoSpendAmt;
	}
	public String getCurr12MoWgtAvgMoSpendAmt() {
		return curr12MoWgtAvgMoSpendAmt;
	}
	public void setCurr12MoWgtAvgMoSpendAmt(String curr12MoWgtAvgMoSpendAmt) {
		this.curr12MoWgtAvgMoSpendAmt = curr12MoWgtAvgMoSpendAmt;
	}
	public String getCurr12MoAvgMoVisitCnt() {
		return curr12MoAvgMoVisitCnt;
	}
	public void setCurr12MoAvgMoVisitCnt(String curr12MoAvgMoVisitCnt) {
		this.curr12MoAvgMoVisitCnt = curr12MoAvgMoVisitCnt;
	}
	public String getPrev12MoAvgMoVisitCnt() {
		return prev12MoAvgMoVisitCnt;
	}
	public void setPrev12MoAvgMoVisitCnt(String prev12MoAvgMoVisitCnt) {
		this.prev12MoAvgMoVisitCnt = prev12MoAvgMoVisitCnt;
	}
	public String getCurr12MoWgtAvgMoVisitCnt() {
		return curr12MoWgtAvgMoVisitCnt;
	}
	public void setCurr12MoWgtAvgMoVisitCnt(String curr12MoWgtAvgMoVisitCnt) {
		this.curr12MoWgtAvgMoVisitCnt = curr12MoWgtAvgMoVisitCnt;
	}		
}

