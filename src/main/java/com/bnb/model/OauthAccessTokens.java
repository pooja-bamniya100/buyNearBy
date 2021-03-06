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
import javax.persistence.UniqueConstraint;

/**
 * OauthAccessTokens generated by hbm2java
 */
@Entity
@Table(name = "oauth_access_tokens", schema = "public", uniqueConstraints = {
		@UniqueConstraint(columnNames = "refresh_token"), @UniqueConstraint(columnNames = "token") })
public class OauthAccessTokens implements java.io.Serializable {

	private long id;
	private OauthApplications oauthApplications;
	private Integer resourceOwnerId;
	private String token;
	private String refreshToken;
	private Integer expiresIn;
	private Date revokedAt;
	private Date createdAt;
	private String scopes;
	private String previousRefreshToken;

	public OauthAccessTokens() {
	}

	public OauthAccessTokens(long id, String token, Date createdAt, String previousRefreshToken) {
		this.id = id;
		this.token = token;
		this.createdAt = createdAt;
		this.previousRefreshToken = previousRefreshToken;
	}

	public OauthAccessTokens(long id, OauthApplications oauthApplications, Integer resourceOwnerId, String token,
			String refreshToken, Integer expiresIn, Date revokedAt, Date createdAt, String scopes,
			String previousRefreshToken) {
		this.id = id;
		this.oauthApplications = oauthApplications;
		this.resourceOwnerId = resourceOwnerId;
		this.token = token;
		this.refreshToken = refreshToken;
		this.expiresIn = expiresIn;
		this.revokedAt = revokedAt;
		this.createdAt = createdAt;
		this.scopes = scopes;
		this.previousRefreshToken = previousRefreshToken;
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
	@JoinColumn(name = "application_id")
	public OauthApplications getOauthApplications() {
		return this.oauthApplications;
	}

	public void setOauthApplications(OauthApplications oauthApplications) {
		this.oauthApplications = oauthApplications;
	}

	@Column(name = "resource_owner_id")
	public Integer getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Integer resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
	}

	@Column(name = "token", unique = true, nullable = false)
	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Column(name = "refresh_token", unique = true)
	public String getRefreshToken() {
		return this.refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	@Column(name = "expires_in")
	public Integer getExpiresIn() {
		return this.expiresIn;
	}

	public void setExpiresIn(Integer expiresIn) {
		this.expiresIn = expiresIn;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "revoked_at", length = 29)
	public Date getRevokedAt() {
		return this.revokedAt;
	}

	public void setRevokedAt(Date revokedAt) {
		this.revokedAt = revokedAt;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_at", nullable = false, length = 29)
	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@Column(name = "scopes")
	public String getScopes() {
		return this.scopes;
	}

	public void setScopes(String scopes) {
		this.scopes = scopes;
	}

	@Column(name = "previous_refresh_token", nullable = false)
	public String getPreviousRefreshToken() {
		return this.previousRefreshToken;
	}

	public void setPreviousRefreshToken(String previousRefreshToken) {
		this.previousRefreshToken = previousRefreshToken;
	}

}
