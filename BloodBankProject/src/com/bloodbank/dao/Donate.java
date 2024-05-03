package com.bloodbank.dao;

public abstract class Donate {
	public void donate(String donorId, String bloodType) {
		System.out.println("Donor ID:" + donorId + "\n" + "Blood Type:" + bloodType + "ve");
	}

	public void donate(int quantity) {
		System.out.println("Quantity Of Blood Donated:" + quantity + "unit");
		System.out.println("              ----------Thanks For Donating Blood----------");
	}

	public abstract void donate(String donorName, String bloodType, int quantity);

	public void bloodReceived(String recipientName, String bloodGroup, int quantityReceived) {
		int cost = quantityReceived * 500;
		System.out.println("Recipient name:" + recipientName);
		System.out.println("quantity Of Blood Received:" + quantityReceived + "unit" + "\n" + "cost:" + cost + "Rs");
	}

}
