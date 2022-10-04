package com.cts.eaution.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.Future;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.validation.annotation.Validated;

import com.cts.eaution.vo.validator.ValidateString;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @author aadi
 *VO for product entity
 */
//@Validated
public class ProductVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5163778913689759342L;
	public ProductVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	private Long id;
	
	@NotNull(message = "{validation.product.name.notnull}")
	@Size(min = 5, max = 30,message = "{validation.product.name.size}")
	private String name;
	private String shortDescription;
	@ValidateString(acceptedValues={"String"}, message="validation.product.category.values")
	private Category category;
	@Min(value = 0, message = "{validation.product.sprice.shouldbeno}")
	private BigDecimal startingPrice;
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	@Future(message ="{validation.product.benddate.future}")
	private Date bidEndDate;
	private Date createdDate;
	private Long createdBy;
	private String detailedDescription;
	public List<BidVO> getBids() {
		return bids;
	}
	public void setBids(List<BidVO> bids) {
		this.bids = bids;
	}
	private List<BidVO> bids;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShortDescription() {
		return shortDescription;
	}
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	
	public BigDecimal getStartingPrice() {
		return startingPrice;
	}
	public void setStartingPrice(BigDecimal startingPrice) {
		this.startingPrice = startingPrice;
	}
	public Date getBidEndDate() {
		return bidEndDate;
	}
	public void setBidEndDate(Date bidEndDate) {
		this.bidEndDate = bidEndDate;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Long getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}
	public String getDetailedDescription() {
		return detailedDescription;
	}
	public void setDetailedDescription(String detailedDescription) {
		this.detailedDescription = detailedDescription;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}

	
}
