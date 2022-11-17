package com.customer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class customer{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cid;
	@Column(length=100)
	private String cname;
	@Column(length=50)
	private String address;
	private int contact;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public customer(int cid, String cname, String address, int contact) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.address = address;
		this.contact = contact;
	}
	public customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "customer [cid=" + cid + ", cname=" + cname + ", address=" + address + ", contact=" + contact + "]";
	}
	
}




	