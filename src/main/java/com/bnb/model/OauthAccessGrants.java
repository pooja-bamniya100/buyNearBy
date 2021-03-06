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
 * OauthAccessGrants generated by hbm2java
 */
@Entity
@Table(name = "oauth_access_grants", schema = "public", uniqueConstraints = @UniqueConstraint(columnNames = "token"))
public class OauthAccessGrants implements java.io.Serializable {

	private long id;
	private OauthApplications oauthApplications;
	private int resourceOwnerId;
	private String token;
	private int expiresIn;
	private String redirectUri;
	private Date createdAt;
	private Date revokedAt;
	private String scopes;

	public OauthAccessGrants() {
	}

	public OauthAccessGrants(long id, OauthApplications oauthApplications, int resourceOwnerId, String token,
			int expiresIn, String redirectUri, Date createdAt) {
		this.id = id;
		this.oauthApplications = oauthApplications;
		this.resourceOwnerId = resourceOwnerId;
		this.token = token;
		this.expiresIn = expiresIn;
		this.redirectUri = redirectUri;
		this.createdAt = createdAt;
	}

	public OauthAccessGrants(long id, OauthApplications oauthApplications, int resourceOwnerId, String token,
			int expiresIn, String redirectUri, Date createdAt, Date revokedAt, String scopes) {
		this.id = id;
		this.oauthApplications = oauthApplications;
		this.resourceOwnerId = resourceOwnerId;
		this.token = token;
		this.expiresIn = expiresIn;
		this.redirectUri = redirectUri;
		this.createdAt = createdAt;
		this.revokedAt = revokedAt;
		this.scopes = scopes;
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
	@JoinColumn(name = "application_id", nullable = false)
	public OauthApplications getOauthApplications() {
		return this.oauthApplications;
	}

	public void setOauthApplications(OauthApplications oauthApplications) {
		this.oauthApplications = oauthApplications;
	}

	@Column(name = "resource_owner_id", nullable = false)
	public int getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(int resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
	}

	@Column(name = "token", unique = true, nullable = false)
	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Column(name = "expires_in", nullable = false)
	public int getExpiresIn() {
		return this.expiresIn;
	}

	public void setExpiresIn(int expiresIn) {
		this.expiresIn = expiresIn;
	}

	@Column(name = "redirect_uri", nullable = false)
	public String getRedirectUri() {
		return this.redirectUri;
	}

	public void setRedirectUri(String redirectUri) {
		this.redirectUri = redirectUri;
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
	@Column(name = "revoked_at", length = 29)
	public Date getRevokedAt() {
		return this.revokedAt;
	}

	public void setRevokedAt(Date revokedAt) {
		this.revokedAt = revokedAt;
	}

	@Column(name = "scopes")
	public String getScopes() {
		return this.scopes;
	}

	public void setScopes(String scopes) {
		this.scopes = scopes;
	}

}
