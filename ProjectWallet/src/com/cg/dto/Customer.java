package com.cg.dto;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="customer_wal")
public class Customer {
	@Id
	private int customerId;
	private String firstname;
	private  String lastName;
	private BigInteger mobileNumber;
	private String emailId;
	private BigInteger alternateMobileNumber;
	private double balance;
	private String address;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public BigInteger getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(BigInteger mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public BigInteger getAlternateMobileNumber() {
		return alternateMobileNumber;
	}
	public void setAlternateMobileNumber(BigInteger alternateMobileNumber) {
		this.alternateMobileNumber = alternateMobileNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Customer(int customerId, String firstname, String lastName,
			BigInteger mobileNumber, String emailId,
			BigInteger alternateMobileNumber, double balance, String address) {
		super();
		this.customerId = customerId;
		this.firstname = firstname;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
		this.alternateMobileNumber = alternateMobileNumber;
		this.balance = balance;
		this.address = address;
	}
	public Customer() {
		super();
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstname="
				+ firstname + ", lastName=" + lastName + ", mobileNumber="
				+ mobileNumber + ", emailId=" + emailId
				+ ", alternateMobileNumber=" + alternateMobileNumber
				+ ", balance=" + balance + ", address=" + address + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + customerId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (customerId != other.customerId)
			return false;
		return true;
	}
}
