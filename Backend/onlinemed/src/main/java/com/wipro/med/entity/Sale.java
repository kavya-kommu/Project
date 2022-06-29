package com.wipro.med.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity

public class Sale {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private Integer cid;
	private Integer mid;
	private String amount;
	private String quant;
	private String date;


public Sale() {}


public Integer getId() {
	return id;
}


public void setId(Integer id) {
	this.id = id;
}


public Integer getCid() {
	return cid;
}


public void setCid(Integer cid) {
	this.cid = cid;
}


public Integer getMid() {
	return mid;
}


public void setMid(Integer mid) {
	this.mid = mid;
}


public String getAmount() {
	return amount;
}


public void setAmount(String amount) {
	this.amount = amount;
}


public String getQuant() {
	return quant;
}


public void setQuant(String quant) {
	this.quant = quant;
}


public String getDate() {
	return date;
}


public void setDate(String date) {
	this.date = date;
}


public Sale(Integer id, Integer cid, Integer mid, String amount, String quant, String date) {
	super();
	this.id = id;
	this.cid = cid;
	this.mid = mid;
	this.amount = amount;
	this.quant = quant;
	this.date = date;
}


@Override
public String toString() {
	return "Sale [id=" + id + ", cid=" + cid + ", mid=" + mid + ", amount=" + amount + ", quant=" + quant + ", date="
			+ date + "]";
}



}


