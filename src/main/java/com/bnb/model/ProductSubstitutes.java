package com.bnb.model;
// Generated 30 Jul, 2020 3:44:28 PM by Hibernate Tools 5.2.10.Final

import java.io.Serializable;
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
 * ProductSubstitutes generated by hbm2java
 */
@Entity
@Table(name = "product_substitutes", schema = "public")
public class ProductSubstitutes implements java.io.Serializable {

	private long id;
	private Products products;
	private Serializable substitutes;
	private Date createdAt;
	private Date updatedAt;
	private Serializable substituteSize;

	public ProductSubstitutes() {
	}

	public ProductSubstitutes(long id, Date createdAt, Date updatedAt) {
		this.id = id;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public ProductSubstitutes(long id, Products products, Serializable substitutes, Date createdAt, Date updatedAt,
			Serializable substituteSize) {
		this.id = id;
		this.products = products;
		this.substitutes = substitutes;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.substituteSize = substituteSize;
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
	@JoinColumn(name = "product_id")
	public Products getProducts() {
		return this.products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}

	@Column(name = "substitutes")
	public Serializable getSubstitutes() {
		return this.substitutes;
	}

	public void setSubstitutes(Serializable substitutes) {
		this.substitutes = substitutes;
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

	@Column(name = "substitute_size")
	public Serializable getSubstituteSize() {
		return this.substituteSize;
	}

	public void setSubstituteSize(Serializable substituteSize) {
		this.substituteSize = substituteSize;
	}

}
