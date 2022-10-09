package com.cts.eaution.vo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author aadi
 *Bid View Object
 */
public class BidVO {
	
	private Long bidId;
	private BigDecimal biddingAmount;
	private Long productId;
	private String buyerEmailID;
	private Date bidCreatedDate;
	private Boolean isBidActive;
	
	public String getBuyerEmailID() {
		return buyerEmailID;
	}
	public void setBuyerEmailID(String buyerEmailID) {
		this.buyerEmailID = buyerEmailID;
	}
	
	public Long getBidId() {
		return bidId;
	}
	public void setBidId(Long bidId) {
		this.bidId = bidId;
	}
	public BigDecimal getBiddingAmount() {
		return biddingAmount;
	}
	public void setBiddingAmount(BigDecimal biddingAmount) {
		this.biddingAmount = biddingAmount;
	}
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Date getBidCreatedDate() {
		return bidCreatedDate;
	}
	public void setBidCreatedDate(Date bidCreatedDate) {
		this.bidCreatedDate = bidCreatedDate;
	}
	public Boolean getIsBidActive() {
		return isBidActive;
	}
	public void setIsBidActive(Boolean isBidActive) {
		this.isBidActive = isBidActive;
	}
	
	
}
