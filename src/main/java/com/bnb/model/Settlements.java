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
 * Settlements generated by hbm2java
 */
@Entity
@Table(name = "settlements", schema = "public")
public class Settlements implements java.io.Serializable {

	private long id;
	private Orders orders;
	private String pnbTransactionId;
	private String status;
	private Date createdAt;
	private Date updatedAt;

	public Settlements() {
	}

	public Settlements(long id, Date createdAt, Date updatedAt) {
		this.id = id;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public Settlements(long id, Orders orders, String pnbTransactionId, String status, Date createdAt, Date updatedAt) {
		this.id = id;
		this.orders = orders;
		this.pnbTransactionId = pnbTransactionId;
		this.status = status;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
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
	@JoinColumn(name = "order_id")
	public Orders getOrders() {
		return this.orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	@Column(name = "pnb_transaction_id")
	public String getPnbTransactionId() {
		return this.pnbTransactionId;
	}

	public void setPnbTransactionId(String pnbTransactionId) {
		this.pnbTransactionId = pnbTransactionId;
	}

	@Column(name = "status")
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
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

}
