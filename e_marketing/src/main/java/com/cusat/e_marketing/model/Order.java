package com.cusat.e_marketing.model;

public class Order {
	private String orderId;
	private String productId;
	private String customerId;
	private String sellerId;
	private String style;
	private int qty;
	private float price;
	private int status;
	private String orderedDate;
	private String cancelledDate;
	private String deliveredDate;
	/**
	 * @return the orderId
	 */
	public String getOrderId() {
		return orderId;
	}
	/**
	 * @param orderId the orderId to set
	 */
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	/**
	 * @return the productId
	 */
	public String getProductId() {
		return productId;
	}
	/**
	 * @param productId the productId to set
	 */
	public void setProductId(String productId) {
		this.productId = productId;
	}
	/**
	 * @return the customerId
	 */
	public String getCustomerId() {
		return customerId;
	}
	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	/**
	 * @return the sellerId
	 */
	public String getSellerId() {
		return sellerId;
	}
	/**
	 * @param sellerId the sellerId to set
	 */
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}
	/**
	 * @return the style
	 */
	public String getStyle() {
		return style;
	}
	/**
	 * @param style the style to set
	 */
	public void setStyle(String style) {
		this.style = style;
	}
	/**
	 * @return the qty
	 */
	public int getQty() {
		return qty;
	}
	/**
	 * @param qty the qty to set
	 */
	public void setQty(int qty) {
		this.qty = qty;
	}
	/**
	 * @return the price
	 */
	public float getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(float price) {
		this.price = price;
	}
	/**
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
	}
	/**
	 * @return the orderedDate
	 */
	public String getOrderedDate() {
		return orderedDate;
	}
	/**
	 * @param orderedDate the orderedDate to set
	 */
	public void setOrderedDate(String orderedDate) {
		this.orderedDate = orderedDate;
	}
	/**
	 * @return the cancelledDate
	 */
	public String getCancelledDate() {
		return cancelledDate;
	}
	/**
	 * @param cancelledDate the cancelledDate to set
	 */
	public void setCancelledDate(String cancelledDate) {
		this.cancelledDate = cancelledDate;
	}
	/**
	 * @return the deliveredDate
	 */
	public String getDeliveredDate() {
		return deliveredDate;
	}
	/**
	 * @param deliveredDate the deliveredDate to set
	 */
	public void setDeliveredDate(String deliveredDate) {
		this.deliveredDate = deliveredDate;
	}	
}
