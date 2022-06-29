package com.wipro.ecom.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Purchase {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String Purchase_Date;
	private String gstin;
	private String Dealer_id;
	private String Medicine_id;
	private String Quantity;
	
	public Purchase() {}
	
	  public Purchase(Integer id,String Purchase_Date ,String gstin ,String Dealer_id,String Medicine_id,String Quantity) {
		  super();
		  this.id=id;
	      this.Purchase_Date=Purchase_Date;
	      this.gstin=gstin;
	      this.Dealer_id=Dealer_id;
	      this.Medicine_id=Medicine_id;
	      this.Quantity=Quantity;
	  }
	  
	  public Integer getId() {
		  return id;
	  }
	  public void setid(Integer id) {
		  this.id=id;
	  }
	  public String getPurchase_Date() {
		  return Purchase_Date;
	  }
	  public void setPurchase_Date(String Purchase_Date) {
		  this.Purchase_Date=Purchase_Date;
	  }
	  
	  public String getGstin() {
		  return gstin;
	  }
	  public void setGstin(String gstin) {
		  this.gstin=gstin;
	  }
	  
	  public String getDealer_id() {
		  return Dealer_id;
	  }
	  public void setDealer_id(String Dealer_id) {
		  this.Dealer_id=Dealer_id;
	  }
	  
	  public String getMedicine_id() {
		  return Medicine_id;
	  }
	  public void setMedicine_id(String Medicine_id) {
		  this.Medicine_id=Medicine_id;
	  }
	  
	  public String getQuantity() {
		  return Quantity;
	  }
	  public void setQuantity(String Quantity) {
		  this.Quantity=Quantity;
	  }
	  
	  @Override
	  public String toString() {
		  return "Purchase [id=" + id + ", Purchase_Date=" + Purchase_Date + ", gstin="+ gstin + ", Dealer_id=" + Dealer_id
				  + ", Medicine_id=" + Medicine_id +", Quantity=" + Quantity +"]";
				  
	  }
}