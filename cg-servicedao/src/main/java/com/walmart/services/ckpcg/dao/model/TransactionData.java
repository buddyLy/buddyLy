package com.walmart.services.ckpcg.dao.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import me.prettyprint.hom.annotations.Column;
import me.prettyprint.hom.annotations.Id;

@Entity
@Table(name="TransactionData")
public class TransactionData 
{
	@Id
	@Column(name="cuid")
	private String cuid;
	
	private String firstTxnDate;
	private int firstTxnStoreNbr;
	private String firstTxnStoreCountryCode;
	private String lastTxnDate;
	private int lastTxnStoreNbr;
	private int lastTxnStoreCountryCode;
	private int threeMoUniqueVisitStoreCnt;
	private int curr12MoUniqueVisitStoreCnt;
	private int prev12MoUniqueVisitStoreCnt;
	private int curr12MoAvgBetweenVisitDayQty;
	private int curr12MoMaxBetweenVisitDayQty;
	private int curr12MoTenderTypeQty;
	private int tenureDayQty;
	private int recencyDayQty;
	private int threeMoVisitCnt;
	private int curr12MoVisitCnt;
	private int prev12MoVisitCnt;
	private float threeMoAvgVisitAmt;
	private int curr12MoAvgVisitAmt;
	private int prev12MoAvgVisitAmt;
	private float threeMoAvgVisitUniqueItemCnt;
	private float curr12MoAvgVisitUniqueItemCnt;
	private float prev12MoAvgVisitUniqueItemCnt;
	private float threeMoSpendAmt;
	private float curr12MoSpendAmt;
	private float prev12MoSpendAmt;
	private float curr12MoAvgMoSpendAmt;
	private float prev12MoAvgMoSpendAmt;
	private float curr12MoWgtAvgMoSpendAmt;
	private int curr12MoAvgMoVisitCnt;
	private int prev12MoAvgMoVisitCnt;
	private int curr12MoWgtAvgMoVisitCnt;
	public String getFirstTxnDate() {
		return firstTxnDate;
	}
	public void setFirstTxnDate(String firstTxnDate) {
		this.firstTxnDate = firstTxnDate;
	}
	public int getFirstTxnStoreNbr() {
		return firstTxnStoreNbr;
	}
	public void setFirstTxnStoreNbr(int firstTxnStoreNbr) {
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
	public int getLastTxnStoreNbr() {
		return lastTxnStoreNbr;
	}
	public void setLastTxnStoreNbr(int lastTxnStoreNbr) {
		this.lastTxnStoreNbr = lastTxnStoreNbr;
	}
	public int getLastTxnStoreCountryCode() {
		return lastTxnStoreCountryCode;
	}
	public void setLastTxnStoreCountryCode(int lastTxnStoreCountryCode) {
		this.lastTxnStoreCountryCode = lastTxnStoreCountryCode;
	}
	public int getThreeMoUniqueVisitStoreCnt() {
		return threeMoUniqueVisitStoreCnt;
	}
	public void setThreeMoUniqueVisitStoreCnt(int threeMoUniqueVisitStoreCnt) {
		this.threeMoUniqueVisitStoreCnt = threeMoUniqueVisitStoreCnt;
	}
	public int getCurr12MoUniqueVisitStoreCnt() {
		return curr12MoUniqueVisitStoreCnt;
	}
	public void setCurr12MoUniqueVisitStoreCnt(int curr12MoUniqueVisitStoreCnt) {
		this.curr12MoUniqueVisitStoreCnt = curr12MoUniqueVisitStoreCnt;
	}
	public int getPrev12MoUniqueVisitStoreCnt() {
		return prev12MoUniqueVisitStoreCnt;
	}
	public void setPrev12MoUniqueVisitStoreCnt(int prev12MoUniqueVisitStoreCnt) {
		this.prev12MoUniqueVisitStoreCnt = prev12MoUniqueVisitStoreCnt;
	}
	public int getCurr12MoAvgBetweenVisitDayQty() {
		return curr12MoAvgBetweenVisitDayQty;
	}
	public void setCurr12MoAvgBetweenVisitDayQty(int curr12MoAvgBetweenVisitDayQty) {
		this.curr12MoAvgBetweenVisitDayQty = curr12MoAvgBetweenVisitDayQty;
	}
	public int getCurr12MoMaxBetweenVisitDayQty() {
		return curr12MoMaxBetweenVisitDayQty;
	}
	public void setCurr12MoMaxBetweenVisitDayQty(int curr12MoMaxBetweenVisitDayQty) {
		this.curr12MoMaxBetweenVisitDayQty = curr12MoMaxBetweenVisitDayQty;
	}
	public int getCurr12MoTenderTypeQty() {
		return curr12MoTenderTypeQty;
	}
	public void setCurr12MoTenderTypeQty(int curr12MoTenderTypeQty) {
		this.curr12MoTenderTypeQty = curr12MoTenderTypeQty;
	}
	public int getTenureDayQty() {
		return tenureDayQty;
	}
	public void setTenureDayQty(int tenureDayQty) {
		this.tenureDayQty = tenureDayQty;
	}
	public int getRecencyDayQty() {
		return recencyDayQty;
	}
	public void setRecencyDayQty(int recencyDayQty) {
		this.recencyDayQty = recencyDayQty;
	}
	public int getThreeMoVisitCnt() {
		return threeMoVisitCnt;
	}
	public void setThreeMoVisitCnt(int threeMoVisitCnt) {
		this.threeMoVisitCnt = threeMoVisitCnt;
	}
	public int getCurr12MoVisitCnt() {
		return curr12MoVisitCnt;
	}
	public void setCurr12MoVisitCnt(int curr12MoVisitCnt) {
		this.curr12MoVisitCnt = curr12MoVisitCnt;
	}
	public int getPrev12MoVisitCnt() {
		return prev12MoVisitCnt;
	}
	public void setPrev12MoVisitCnt(int prev12MoVisitCnt) {
		this.prev12MoVisitCnt = prev12MoVisitCnt;
	}
	public float getThreeMoAvgVisitAmt() {
		return threeMoAvgVisitAmt;
	}
	public void setThreeMoAvgVisitAmt(float threeMoAvgVisitAmt) {
		this.threeMoAvgVisitAmt = threeMoAvgVisitAmt;
	}
	public int getCurr12MoAvgVisitAmt() {
		return curr12MoAvgVisitAmt;
	}
	public void setCurr12MoAvgVisitAmt(int curr12MoAvgVisitAmt) {
		this.curr12MoAvgVisitAmt = curr12MoAvgVisitAmt;
	}
	public int getPrev12MoAvgVisitAmt() {
		return prev12MoAvgVisitAmt;
	}
	public void setPrev12MoAvgVisitAmt(int prev12MoAvgVisitAmt) {
		this.prev12MoAvgVisitAmt = prev12MoAvgVisitAmt;
	}
	public float getThreeMoAvgVisitUniqueItemCnt() {
		return threeMoAvgVisitUniqueItemCnt;
	}
	public void setThreeMoAvgVisitUniqueItemCnt(float threeMoAvgVisitUniqueItemCnt) {
		this.threeMoAvgVisitUniqueItemCnt = threeMoAvgVisitUniqueItemCnt;
	}
	public float getCurr12MoAvgVisitUniqueItemCnt() {
		return curr12MoAvgVisitUniqueItemCnt;
	}
	public void setCurr12MoAvgVisitUniqueItemCnt(float curr12MoAvgVisitUniqueItemCnt) {
		this.curr12MoAvgVisitUniqueItemCnt = curr12MoAvgVisitUniqueItemCnt;
	}
	public float getPrev12MoAvgVisitUniqueItemCnt() {
		return prev12MoAvgVisitUniqueItemCnt;
	}
	public void setPrev12MoAvgVisitUniqueItemCnt(float prev12MoAvgVisitUniqueItemCnt) {
		this.prev12MoAvgVisitUniqueItemCnt = prev12MoAvgVisitUniqueItemCnt;
	}
	public float getThreeMoSpendAmt() {
		return threeMoSpendAmt;
	}
	public void setThreeMoSpendAmt(float threeMoSpendAmt) {
		this.threeMoSpendAmt = threeMoSpendAmt;
	}
	public float getCurr12MoSpendAmt() {
		return curr12MoSpendAmt;
	}
	public void setCurr12MoSpendAmt(float curr12MoSpendAmt) {
		this.curr12MoSpendAmt = curr12MoSpendAmt;
	}
	public float getPrev12MoSpendAmt() {
		return prev12MoSpendAmt;
	}
	public void setPrev12MoSpendAmt(float prev12MoSpendAmt) {
		this.prev12MoSpendAmt = prev12MoSpendAmt;
	}
	public float getCurr12MoAvgMoSpendAmt() {
		return curr12MoAvgMoSpendAmt;
	}
	public void setCurr12MoAvgMoSpendAmt(float curr12MoAvgMoSpendAmt) {
		this.curr12MoAvgMoSpendAmt = curr12MoAvgMoSpendAmt;
	}
	public float getPrev12MoAvgMoSpendAmt() {
		return prev12MoAvgMoSpendAmt;
	}
	public void setPrev12MoAvgMoSpendAmt(float prev12MoAvgMoSpendAmt) {
		this.prev12MoAvgMoSpendAmt = prev12MoAvgMoSpendAmt;
	}
	public float getCurr12MoWgtAvgMoSpendAmt() {
		return curr12MoWgtAvgMoSpendAmt;
	}
	public void setCurr12MoWgtAvgMoSpendAmt(float curr12MoWgtAvgMoSpendAmt) {
		this.curr12MoWgtAvgMoSpendAmt = curr12MoWgtAvgMoSpendAmt;
	}
	public int getCurr12MoAvgMoVisitCnt() {
		return curr12MoAvgMoVisitCnt;
	}
	public void setCurr12MoAvgMoVisitCnt(int curr12MoAvgMoVisitCnt) {
		this.curr12MoAvgMoVisitCnt = curr12MoAvgMoVisitCnt;
	}
	public int getPrev12MoAvgMoVisitCnt() {
		return prev12MoAvgMoVisitCnt;
	}
	public void setPrev12MoAvgMoVisitCnt(int prev12MoAvgMoVisitCnt) {
		this.prev12MoAvgMoVisitCnt = prev12MoAvgMoVisitCnt;
	}
	public int getCurr12MoWgtAvgMoVisitCnt() {
		return curr12MoWgtAvgMoVisitCnt;
	}
	public void setCurr12MoWgtAvgMoVisitCnt(int curr12MoWgtAvgMoVisitCnt) {
		this.curr12MoWgtAvgMoVisitCnt = curr12MoWgtAvgMoVisitCnt;
	}
	public String getCuid() {
		return cuid;
	}
	public void setCuid(String cuid) {
		this.cuid = cuid;
	}
	
}

