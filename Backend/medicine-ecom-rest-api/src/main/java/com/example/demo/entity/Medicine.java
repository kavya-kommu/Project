package com.example.demo.entity;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Medicine {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String name;
	private String mfgdate;
	private String expdate;
	private String price;
	private String stock;
	
	public Medicine() {}

	public Medicine(Integer id, String name, String mfgdate, String expdate, String price, String stock) {
		super();
		this.id = id;
		this.name = name;
		this.mfgdate = mfgdate;
		this.expdate = expdate;
		this.price = price;
		this.stock = stock;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMfgdate() {
		return mfgdate;
	}

	public void setMfgdate(String mfgdate) {
		this.mfgdate = mfgdate;
	}

	public String getExpdate() {
		return expdate;
	}

	public void setExpdate(String expdate) {
		this.expdate = expdate;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Medicine [id=" + id + ", name=" + name + ", mfgdate=" + mfgdate + ", expdate=" + expdate + ", price="
				+ price + ", stock=" + stock + "]";
	}
}