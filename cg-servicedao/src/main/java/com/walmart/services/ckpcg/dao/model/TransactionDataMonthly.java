package com.walmart.services.ckpcg.dao.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import me.prettyprint.hom.annotations.Column;
import me.prettyprint.hom.annotations.Id;

@Entity
@Table(name="TransactionDataMonthly")
public class TransactionDataMonthly {
	@Id
	@Column(name="cuid")
	private String cuid;
	
	private int yearNbr;
	private String runDate;
	private float avgSpend;
	private int numVisits;
	private int avgBsktSize;
	public int getYearNbr() {
		return yearNbr;
	}
	public void setYearNbr(int yearNbr) {
		this.yearNbr = yearNbr;
	}
	public String getRunDate() {
		return runDate;
	}
	public void setRunDate(String runDate) {
		this.runDate = runDate;
	}
	public float getAvgSpend() {
		return avgSpend;
	}
	public void setAvgSpend(float avgSpend) {
		this.avgSpend = avgSpend;
	}
	public int getNumVisits() {
		return numVisits;
	}
	public void setNumVisits(int numVisits) {
		this.numVisits = numVisits;
	}
	public int getAvgBsktSize() {
		return avgBsktSize;
	}
	public void setAvgBsktSize(int avgBsktSize) {
		this.avgBsktSize = avgBsktSize;
	}
	public String getCuid() {
		return cuid;
	}
	public void setCuid(String cuid) {
		this.cuid = cuid;
	}
}
