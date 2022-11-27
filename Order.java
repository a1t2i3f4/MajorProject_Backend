package com.example.demo.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Order {
    @Id
	private Long userid;
	private String name;
	private String emailid;
	private String address ;
	private Long productId;
	private String productName;
	private String productCategory;
	private long productRate;
	
	
	
	public Order(Long userid, String name, String emailid, String address, Long productId, String productName,
			String productCategory, Long productRate) {
		super();
		this.userid = userid;
		this.name = name;
		this.emailid = emailid;
		this.address = address;
		this.productId = productId;
		this.productName = productName;
		this.productCategory = productCategory;
		this.productRate = productRate;
	}
	public Order() {
		
	}
	@Override
	public String toString() {
		return "Order [userid=" + userid + ", name=" + name + ", emailid=" + emailid + ", address=" + address
				+ ", productId=" + productId + ", productName=" + productName + ", productCategory=" + productCategory
				+ ", productRate=" + productRate + "]";
	}
	public Long getUserid() {
		return userid;
	}
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		name = name;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public Long getProductRate() {
		return productRate;
	}
	public void setProductRate(Long productRate) {
		this.productRate = productRate;
	}
	private Long productRate1;
}
