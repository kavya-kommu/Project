package com.wipro.ecom.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Customer {
	  @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
      private Integer id;
      private String name;
      private String cust_contact;
      private String cust_email;
      private String cust_adress;
      public Customer() {}
	public Customer(Integer id, String name, String cust_contact, String cust_email, String cust_adress) {
		super();
		this.id = id;
		this.name = name;
		this.cust_contact = cust_contact;
		this.cust_email = cust_email;
		this.cust_adress = cust_adress;
	}
	public Integer getid() {
		return id;
	}
	public void setid(Integer id) {
		this.id = id;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public String getCust_contact() {
		return cust_contact;
	}
	public void setCust_contact(String cust_contact) {
		this.cust_contact = cust_contact;
	}
	public String getCust_email() {
		return cust_email;
	}
	public void setCust_email(String cust_email) {
		this.cust_email = cust_email;
	}
	public String getCust_adress() {
		return cust_adress;
	}
	public void setCust_adress(String cust_adress) {
		this.cust_adress = cust_adress;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", cust_contact=" + cust_contact
				+ ", cust_email=" + cust_email + ", cust_adress=" + cust_adress + "]";
	}
}