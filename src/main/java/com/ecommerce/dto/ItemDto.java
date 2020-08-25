package com.ecommerce.dto;

public class ItemDto {
    private String itemName;
    private double pricePerUnit;
    private Integer itemId;
    private Integer quanity;
    
    
   
    public double getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

	public Integer getQuanity() {
		return quanity;
	}

	public void setQuanity(Integer quanity) {
		this.quanity = quanity;
	}

	public String getItemName() {
	return itemName;
    }

    public void setItemName(String itemName) {
	this.itemName = itemName;
    }

    public double getPrice() {
	return pricePerUnit;
    }

    public void setPrice(double pricePerUnit) {
	this.pricePerUnit = pricePerUnit;
    }

    public Integer getItemId() {
	return itemId;
    }

    public void setItemId(Integer itemId) {
	this.itemId = itemId;
    }
}
