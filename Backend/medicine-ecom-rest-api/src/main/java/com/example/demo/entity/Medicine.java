package com.example.demo.entity;
import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.ManyToOne;

@Entity
public class Medicine {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String name;
	private String mfgdate;
	private String expdate;
	private Float price;
	private Integer stock;
	private byte[] picture;
	/*@ManyToOne
	private Dealer dealer;
	*/
	public Medicine() {}
	
	public Medicine(Integer id, String name, String mfgdate, String expdate, Float price, Integer stock,
			byte[] picture) {
		super();
		this.id = id;
		this.name = name;
		this.mfgdate = mfgdate;
		this.expdate = expdate;
		this.price = price;
		this.stock = stock;
		this.picture = picture;
	}
	
	
	/*
	public Medicine(Integer id, String name, String mfgdate, String expdate, Float price, Integer stock, byte[] picture,
			Dealer dealer) {
		super();
		this.id = id;
		this.name = name;
		this.mfgdate = mfgdate;
		this.expdate = expdate;
		this.price = price;
		this.stock = stock;
		this.picture = picture;
		this.dealer = dealer;
	}
	*/
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

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public byte[] getPicture() {
		return picture;
	}

	public void setPicture(byte[] picture) {
		this.picture = picture;
	}
	/*
	public Dealer getDealer() {
		return dealer;
	}

	public void setDealer(Dealer dealer) {
		this.dealer = dealer;
	}
	*/
	@Override
	public String toString() {
		return "Medicine [id=" + id + ", name=" + name + ", mfgdate=" + mfgdate + ", expdate=" + expdate + ", price="
				+ price + ", stock=" + stock + ", picture=" + Arrays.toString(picture) + "]";
	}
}	
