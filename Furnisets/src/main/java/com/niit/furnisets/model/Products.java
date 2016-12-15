package com.niit.furnisets.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Products implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String productName;
	
	private String price;
	
	private String quantity;
	
	private String catagory;
	
	private String subCatagory;
	
	private String furtherCatagory;

	private String description;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}


	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getCatagory() {
		return catagory;
	}

	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}

	public String getSubCatagory() {
		return subCatagory;
	}

	public void setSubCatagory(String subCatagory) {
		this.subCatagory = subCatagory;
	}

	public String getFurtherCatagory() {
		return furtherCatagory;
	}

	public void setFurtherCatagory(String furtherCatagory) {
		this.furtherCatagory = furtherCatagory;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	
}
