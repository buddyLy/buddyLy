package com.walmart.services.ckpcg.auth.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="UserGroupInfo")
public class UserGroupInfo {

	@Id
	private String userId;
	
	@Column(name="GroupId")
	private String groupId;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public UserGroupInfo() {
		
	}
	public UserGroupInfo(String userId, String groupId) {
		this.userId = userId;
		this.groupId = groupId;
	}
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
}
