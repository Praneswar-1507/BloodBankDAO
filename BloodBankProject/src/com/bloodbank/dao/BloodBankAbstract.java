package com.bloodbank.dao;

public class BloodBankAbstract extends Donate {
	public  void donate(String donorName,String bloodType,int quantity)
	{
	System.out.println("Donor name:"+donorName+"\n"+"Blood Type:"+bloodType+"ve");
	System.out.println("Quantity Of Blood Donated:"+quantity+"unit");
	System.out.println("              ---------Thanks For Donating Blood----------");
	}
}
