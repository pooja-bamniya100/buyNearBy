package com.bnb.model;
// Generated 30 Jul, 2020 3:44:28 PM by Hibernate Tools 5.2.10.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Brands generated by hbm2java
 */
@Entity
@Table(name = "brands", schema = "public")
public class Brands implements java.io.Serializable {

	private long id;
	private Manufacturers manufacturers;
	private String name;
	private Date createdAt;
	private Date updatedAt;
	private Double popularity;
	private String image;
	private Date deletedAt;
	private Set<Products> productses = new HashSet<Products>(0);
	private Set<BrandsSubCategories> brandsSubCategorieses = new HashSet<BrandsSubCategories>(0);

	public Brands() {
	}

	public Brands(long id, Date createdAt, Date updatedAt) {
		this.id = id;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public Brands(long id, Manufacturers manufacturers, String name, Date createdAt, Date updatedAt, Double popularity,
			String image, Date deletedAt, Set<Products> productses, Set<BrandsSubCategories> brandsSubCategorieses) {
		this.id = id;
		this.manufacturers = manufacturers;
		this.name = name;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.popularity = popularity;
		this.image = image;
		this.deletedAt = deletedAt;
		this.productses = productses;
		this.brandsSubCategorieses = brandsSubCategorieses;
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
	@JoinColumn(name = "manufacturer_id")
	public Manufacturers getManufacturers() {
		return this.manufacturers;
	}

	public void setManufacturers(Manufacturers manufacturers) {
		this.manufacturers = manufacturers;
	}

	@Column(name = "name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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

	@Column(name = "popularity", precision = 17, scale = 17)
	public Double getPopularity() {
		return this.popularity;
	}

	public void setPopularity(Double popularity) {
		this.popularity = popularity;
	}

	@Column(name = "image")
	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "deleted_at", length = 29)
	public Date getDeletedAt() {
		return this.deletedAt;
	}

	public void setDeletedAt(Date deletedAt) {
		this.deletedAt = deletedAt;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "brands")
	public Set<Products> getProductses() {
		return this.productses;
	}

	public void setProductses(Set<Products> productses) {
		this.productses = productses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "brands")
	public Set<BrandsSubCategories> getBrandsSubCategorieses() {
		return this.brandsSubCategorieses;
	}

	public void setBrandsSubCategorieses(Set<BrandsSubCategories> brandsSubCategorieses) {
		this.brandsSubCategorieses = brandsSubCategorieses;
	}

}