package com.bnb.model;
// Generated 30 Jul, 2020 3:44:28 PM by Hibernate Tools 5.2.10.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * UserNotifications generated by hbm2java
 */
@Entity
@Table(name = "user_notifications", schema = "public")
public class UserNotifications implements java.io.Serializable {

	private long id;
	private Users users;
	private String token;
	private String deviceId;
	private Date createdAt;
	private Date updatedAt;
	private String endpointArn;
	private Boolean enable;
	private String deviceName;
	private String osVersion;
	private String platform;
	private Boolean distribution;

	public UserNotifications() {
	}

	public UserNotifications(long id, Date createdAt, Date updatedAt) {
		this.id = id;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public UserNotifications(long id, Users users, String token, String deviceId, Date createdAt, Date updatedAt,
			String endpointArn, Boolean enable, String deviceName, String osVersion, String platform,
			Boolean distribution) {
		this.id = id;
		this.users = users;
		this.token = token;
		this.deviceId = deviceId;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.endpointArn = endpointArn;
		this.enable = enable;
		this.deviceName = deviceName;
		this.osVersion = osVersion;
		this.platform = platform;
		this.distribution = distribution;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	@Column(name = "token")
	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Column(name = "device_id")
	public String getDeviceId() {
		return this.deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_at", nullable = false, length = 29)
	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_at", nullable = false, length = 29)
	public Date getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Column(name = "endpoint_arn")
	public String getEndpointArn() {
		return this.endpointArn;
	}

	public void setEndpointArn(String endpointArn) {
		this.endpointArn = endpointArn;
	}

	@Column(name = "enable")
	public Boolean getEnable() {
		return this.enable;
	}

	public void setEnable(Boolean enable) {
		this.enable = enable;
	}

	@Column(name = "device_name")
	public String getDeviceName() {
		return this.deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	@Column(name = "os_version")
	public String getOsVersion() {
		return this.osVersion;
	}

	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}

	@Column(name = "platform")
	public String getPlatform() {
		return this.platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	@Column(name = "distribution")
	public Boolean getDistribution() {
		return this.distribution;
	}

	public void setDistribution(Boolean distribution) {
		this.distribution = distribution;
	}

}
