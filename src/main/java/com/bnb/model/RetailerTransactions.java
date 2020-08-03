package com.bnb.model;
// Generated 30 Jul, 2020 3:44:28 PM by Hibernate Tools 5.2.10.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * RetailerTransactions generated by hbm2java
 */
@Entity
@Table(name = "retailer_transactions", schema = "public")
public class RetailerTransactions implements java.io.Serializable {

	private long id;
	private int retailerId;
	private Integer khataCustomerId;
	private double amount;
	private int txnType;
	private int paymentType;
	private String modeRefId;
	private Integer status;
	private String refId;
	private String orderId;
	private Date txnTimestamp;
	private Date syncTimestamp;
	private Date modifiedTimestamp;
	private Date createdAt;
	private Date updatedAt;
	private Boolean isSync;
	private Boolean isDeleted;
	private String customerPhoneNumber;
	private String remark;
	private Boolean isReinitiated;
	private String parentRefId;
	private Date createdTimestamp;
	private Integer pnbRetailerId;
	private String retailerPhoneNumber;
	private String img;
	private String remarks;
	private Integer medium;
	private String mediumDetails;

	public RetailerTransactions() {
	}

	public RetailerTransactions(long id, int retailerId, double amount, int txnType, int paymentType, String refId,
			String orderId, Date txnTimestamp, Date syncTimestamp, Date modifiedTimestamp, Date createdAt,
			Date updatedAt) {
		this.id = id;
		this.retailerId = retailerId;
		this.amount = amount;
		this.txnType = txnType;
		this.paymentType = paymentType;
		this.refId = refId;
		this.orderId = orderId;
		this.txnTimestamp = txnTimestamp;
		this.syncTimestamp = syncTimestamp;
		this.modifiedTimestamp = modifiedTimestamp;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public RetailerTransactions(long id, int retailerId, Integer khataCustomerId, double amount, int txnType,
			int paymentType, String modeRefId, Integer status, String refId, String orderId, Date txnTimestamp,
			Date syncTimestamp, Date modifiedTimestamp, Date createdAt, Date updatedAt, Boolean isSync,
			Boolean isDeleted, String customerPhoneNumber, String remark, Boolean isReinitiated, String parentRefId,
			Date createdTimestamp, Integer pnbRetailerId, String retailerPhoneNumber, String img, String remarks,
			Integer medium, String mediumDetails) {
		this.id = id;
		this.retailerId = retailerId;
		this.khataCustomerId = khataCustomerId;
		this.amount = amount;
		this.txnType = txnType;
		this.paymentType = paymentType;
		this.modeRefId = modeRefId;
		this.status = status;
		this.refId = refId;
		this.orderId = orderId;
		this.txnTimestamp = txnTimestamp;
		this.syncTimestamp = syncTimestamp;
		this.modifiedTimestamp = modifiedTimestamp;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.isSync = isSync;
		this.isDeleted = isDeleted;
		this.customerPhoneNumber = customerPhoneNumber;
		this.remark = remark;
		this.isReinitiated = isReinitiated;
		this.parentRefId = parentRefId;
		this.createdTimestamp = createdTimestamp;
		this.pnbRetailerId = pnbRetailerId;
		this.retailerPhoneNumber = retailerPhoneNumber;
		this.img = img;
		this.remarks = remarks;
		this.medium = medium;
		this.mediumDetails = mediumDetails;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "retailer_id", nullable = false)
	public int getRetailerId() {
		return this.retailerId;
	}

	public void setRetailerId(int retailerId) {
		this.retailerId = retailerId;
	}

	@Column(name = "khata_customer_id")
	public Integer getKhataCustomerId() {
		return this.khataCustomerId;
	}

	public void setKhataCustomerId(Integer khataCustomerId) {
		this.khataCustomerId = khataCustomerId;
	}

	@Column(name = "amount", nullable = false, precision = 17, scale = 17)
	public double getAmount() {
		return this.amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Column(name = "txn_type", nullable = false)
	public int getTxnType() {
		return this.txnType;
	}

	public void setTxnType(int txnType) {
		this.txnType = txnType;
	}

	@Column(name = "payment_type", nullable = false)
	public int getPaymentType() {
		return this.paymentType;
	}

	public void setPaymentType(int paymentType) {
		this.paymentType = paymentType;
	}

	@Column(name = "mode_ref_id")
	public String getModeRefId() {
		return this.modeRefId;
	}

	public void setModeRefId(String modeRefId) {
		this.modeRefId = modeRefId;
	}

	@Column(name = "status")
	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Column(name = "ref_id", nullable = false)
	public String getRefId() {
		return this.refId;
	}

	public void setRefId(String refId) {
		this.refId = refId;
	}

	@Column(name = "order_id", nullable = false)
	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "txn_timestamp", nullable = false, length = 29)
	public Date getTxnTimestamp() {
		return this.txnTimestamp;
	}

	public void setTxnTimestamp(Date txnTimestamp) {
		this.txnTimestamp = txnTimestamp;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "sync_timestamp", nullable = false, length = 29)
	public Date getSyncTimestamp() {
		return this.syncTimestamp;
	}

	public void setSyncTimestamp(Date syncTimestamp) {
		this.syncTimestamp = syncTimestamp;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "modified_timestamp", nullable = false, length = 29)
	public Date getModifiedTimestamp() {
		return this.modifiedTimestamp;
	}

	public void setModifiedTimestamp(Date modifiedTimestamp) {
		this.modifiedTimestamp = modifiedTimestamp;
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

	@Column(name = "is_sync")
	public Boolean getIsSync() {
		return this.isSync;
	}

	public void setIsSync(Boolean isSync) {
		this.isSync = isSync;
	}

	@Column(name = "is_deleted")
	public Boolean getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	@Column(name = "customer_phone_number")
	public String getCustomerPhoneNumber() {
		return this.customerPhoneNumber;
	}

	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}

	@Column(name = "remark")
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Column(name = "is_reinitiated")
	public Boolean getIsReinitiated() {
		return this.isReinitiated;
	}

	public void setIsReinitiated(Boolean isReinitiated) {
		this.isReinitiated = isReinitiated;
	}

	@Column(name = "parent_ref_id")
	public String getParentRefId() {
		return this.parentRefId;
	}

	public void setParentRefId(String parentRefId) {
		this.parentRefId = parentRefId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_timestamp", length = 29)
	public Date getCreatedTimestamp() {
		return this.createdTimestamp;
	}

	public void setCreatedTimestamp(Date createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}

	@Column(name = "pnb_retailer_id")
	public Integer getPnbRetailerId() {
		return this.pnbRetailerId;
	}

	public void setPnbRetailerId(Integer pnbRetailerId) {
		this.pnbRetailerId = pnbRetailerId;
	}

	@Column(name = "retailer_phone_number")
	public String getRetailerPhoneNumber() {
		return this.retailerPhoneNumber;
	}

	public void setRetailerPhoneNumber(String retailerPhoneNumber) {
		this.retailerPhoneNumber = retailerPhoneNumber;
	}

	@Column(name = "img")
	public String getImg() {
		return this.img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	@Column(name = "remarks")
	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Column(name = "medium")
	public Integer getMedium() {
		return this.medium;
	}

	public void setMedium(Integer medium) {
		this.medium = medium;
	}

	@Column(name = "medium_details")
	public String getMediumDetails() {
		return this.mediumDetails;
	}

	public void setMediumDetails(String mediumDetails) {
		this.mediumDetails = mediumDetails;
	}

}
