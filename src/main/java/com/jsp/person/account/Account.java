package com.jsp.person.account;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String bank_name;
	private long acc_no;
	private String ifsc;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBank_name() {
		return bank_name;
	}
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	public long getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(long acc_no) {
		this.acc_no = acc_no;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

}
