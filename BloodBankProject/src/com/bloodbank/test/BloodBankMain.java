package com.bloodbank.test;
import java.sql.SQLException;
import java.util.*;
public class BloodBankMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner scan=new Scanner(System.in);
		BloodBankUser e=new BloodBankUser();
		BloodBankAdmin g=new BloodBankAdmin();
		System.out.println("                  **************BloodBank*******************");
		System.out.println("Select \n1.admin \n2.user \n3.Exit");
		int selectOption=scan.nextInt();

		while(true)
		{
		if(selectOption==1||selectOption==2||selectOption==3)
		{
			
        switch(selectOption)
		{
		case 1:
			g.admin();
			return;
		case 2:
			e.user();
			return;
		case 3:
			System.out.println("Exited succesfully");
			System.out.println("Select \n1.admin \n2.user \n3.Exit");
			selectOption=scan.nextInt();
			
		}
		}
        else
        {
        	System.out.println("Enter the valid data:");
        	selectOption=scan.nextInt();
    		
        }
		
			
		
			}
		}
	}



