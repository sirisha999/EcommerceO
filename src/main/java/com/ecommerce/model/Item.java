package com.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer itemId;
    private String itemName;
    private double pricePerUnit;

    public Integer getItemId() {
	return itemId;
    }

    public void setItemId(Integer itemId) {
	this.itemId = itemId;
    }

    public String getItemName() {
	return itemName;
    }

    public void setItemName(String itemName) {
	this.itemName = itemName;
    }

    @Override
    public String toString() {
	return "Item [itemId=" + itemId + ", itemName=" + itemName + ", pricePerUnit=" + pricePerUnit + "]";
    }

    public void setPricePerUnit(double pricePerUnit) {
	this.pricePerUnit = pricePerUnit;
    }

    public double getPricePerUnit() {
	return pricePerUnit;
    }

}
