package com.bloodbank.model;

public class BloodBank {
	String bloodType, donorName, recipientName, bloodGroup, donorId, password;
	int quantity, noOfDays, quantityReceived, selectOption;
	char donatedbefore;

	public BloodBank() {

	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getSelectOption() {
		return selectOption;
	}

	public void setSelectOption(int selectOption) {
		this.selectOption = selectOption;
	}

	public String getDonorId() {
		return donorId;
	}

	public void setDonorId(String donorId) {
		this.donorId = donorId;
	}

	public int getQuantityReceived() {
		return quantityReceived;
	}

	public void setQuantityReceived(int quantityReceived) {
		this.quantityReceived = quantityReceived;
	}

	public String getRecipientName() {
		return recipientName;
	}

	public void setRecipientName(String recipientName) {
		this.recipientName = recipientName;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}

	public char getDonatedbefore() {
		return donatedbefore;
	}

	public void setDonatedbefore(char donatedbefore) {
		this.donatedbefore = donatedbefore;
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public String getDonorName() {
		return donorName;
	}

	public void setDonorName(String donorName) {
		this.donorName = donorName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public BloodBank(String bloodType, String donorName, String recipientName, String bloodGroup, String donorId,
			int quantity, int noOfDays, int quantityReceived, int selectOption, char donatedbefore) {
		super();
		this.bloodType = bloodType;
		this.donorName = donorName;
		this.recipientName = recipientName;
		this.bloodGroup = bloodGroup;
		this.donorId = donorId;
		this.quantity = quantity;
		this.noOfDays = noOfDays;
		this.quantityReceived = quantityReceived;
		this.selectOption = selectOption;
		this.donatedbefore = donatedbefore;
	}

	@Override
	public String toString() {
		return "BloodBank [bloodType=" + bloodType + ", donorName=" + donorName + ", recipientName=" + recipientName
				+ ", bloodGroup=" + bloodGroup + ", donorId=" + donorId + ", quantity=" + quantity + ", noOfDays="
				+ noOfDays + ", quantityReceived=" + quantityReceived + ", selectOption=" + selectOption
				+ ", donatedbefore=" + donatedbefore + "]";
	}

}
