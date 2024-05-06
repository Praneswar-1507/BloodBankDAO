package com.bloodbank.test;
import java.sql.SQLException;
import java.util.Scanner;

import com.bloodbank.model.BloodBank;
import com.bloodbank.util.Jdbc;
public class BloodBankAdmin {
	public void admin() throws ClassNotFoundException, SQLException
	{
		Scanner d=new Scanner(System.in);
		System.out.println("Enter admin name:");
		String adminName=d.next();
		while(!adminName.matches("abc123"))
		{
			System.out.println("Enter Valid name:");
			adminName=d.next();
		}
		System.out.println("Enter password:");
		String password=d.next();
		while(!password.matches("abc@123"))
		{
			System.out.println("Enter password:");
			 password=d.next();
			
		}
		System.out.println("------------login successfully-------------");
		System.out.println("1.adding stock 2.Delete,3.Display donor Details");
		int Details=d.nextInt();
		switch(Details)
		{
		case 1:
		{
			System.out.println("Enter type of blood:");
			String bloodType=d.next();
			System.out.println("Enter quantity of blood to be added:");
			int quantityAdded=d.nextInt();
			Jdbc.update(quantityAdded,bloodType);
		}
		case 2:
		{
			System.out.println("Please enter the id ");
			String donorId = d.next();
			Jdbc.delete(donorId);
			break;
		}
			case 3:
			{
			System.out.println("Donor Details:\n1.Name:sachin\t BloodGroup:Ab+\t ContactNo:12345678 \n2.Name:dhoni\t BloodGroup:A+\t ContactNo:13456788 \n3.Name:virat\t BloodGroup:Ab-\t ContactNo:1456788");
			break;
		}
			
		
	}
	}
		public void DonorUpdate(BloodBank a) throws ClassNotFoundException, SQLException
		{
			Scanner y=new Scanner(System.in);
		System.out.println("Select T0 Make Changes In Database\n1.Insert\n2.Updtate ");
		int select=y.nextInt();
		switch(select)
		{
		case 1:
		Jdbc.insert(a.getDonorId(),a.getDonorName(),a.getBloodType(),a.getQuantity());
		break;
		
		
	}
		}
		
	

}


