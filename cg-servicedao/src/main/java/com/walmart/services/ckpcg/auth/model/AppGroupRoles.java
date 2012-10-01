package com.walmart.services.ckpcg.auth.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import me.prettyprint.hom.annotations.Column;
import me.prettyprint.hom.annotations.Id;

@Entity
@Table(name="AppGroupRoles")
public class AppGroupRoles {
	@Id
	private String groupId;
	@Column(name="CustomerAttr")
	private String customerAttr;
	@Column(name="TransactionAttr")
	private String transactionAttr;
	@Column(name="SftpEnabled")
	private boolean sftpEnabled;
	@Column(name="FilesystemEnabled")
	private boolean filesystemEnabled;
	@Column(name="FtpServerName")
	private String ftpServerName;
	@Column(name="FtpUserId")
	private String ftpUserId;
	@Column(name="FtpPassword")
	private String ftpPassword;
	@Column(name="FtpFileFormat")
	private String ftpFileFormat;
	@Column(name="FileSysServerName")
	private String fileSysServerName;
	@Column(name="FileSysUserId")
	private String fileSysUserId;
	@Column(name="FileSysPassword")
	private String fileSysPassword;
	
	@Column(name="GroupActiveInd")
	private boolean groupActiveInd;
	
	@Column(name="ApplicationId")
	private String applicationId;
	
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public String getCustomerAttr() {
		return customerAttr;
	}
	public void setCustomerAttr(String customerAttr) {
		this.customerAttr = customerAttr;
	}
	public String getTransactionAttr() {
		return transactionAttr;
	}
	public void setTransactionAttr(String transactionAttr) {
		this.transactionAttr = transactionAttr;
	}
	public boolean isSftpEnabled() {
		return sftpEnabled;
	}
	public void setSftpEnabled(boolean sftpEnabled) {
		this.sftpEnabled = sftpEnabled;
	}
	public boolean isFilesystemEnabled() {
		return filesystemEnabled;
	}
	public void setFilesystemEnabled(boolean filesystemEnabled) {
		this.filesystemEnabled = filesystemEnabled;
	}
	public String getFtpServerName() {
		return ftpServerName;
	}
	public void setFtpServerName(String ftpServerName) {
		this.ftpServerName = ftpServerName;
	}
	public String getFtpUserId() {
		return ftpUserId;
	}
	public void setFtpUserId(String ftpUserId) {
		this.ftpUserId = ftpUserId;
	}
	public String getFtpPassword() {
		return ftpPassword;
	}
	public void setFtpPassword(String ftpPassword) {
		this.ftpPassword = ftpPassword;
	}
	public String getFtpFileFormat() {
		return ftpFileFormat;
	}
	public void setFtpFileFormat(String ftpFileFormat) {
		this.ftpFileFormat = ftpFileFormat;
	}
	public String getFileSysServerName() {
		return fileSysServerName;
	}
	public void setFileSysServerName(String fileSysServerName) {
		this.fileSysServerName = fileSysServerName;
	}
	public String getFileSysUserId() {
		return fileSysUserId;
	}
	public void setFileSysUserId(String fileSysUserId) {
		this.fileSysUserId = fileSysUserId;
	}
	public String getFileSysPassword() {
		return fileSysPassword;
	}
	public void setFileSysPassword(String fileSysPassword) {
		this.fileSysPassword = fileSysPassword;
	}
	public boolean isGroupActiveInd() {
		return groupActiveInd;
	}
	public void setGroupActiveInd(boolean groupActiveInd) {
		this.groupActiveInd = groupActiveInd;
	}
	public String getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}
	
	

	
}
