package com.bloodbank.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bloodbank.model.BloodBank;

public class Jdbc {
	

	public static void update(int quantity,String bloodType)throws ClassNotFoundException, SQLException {
		Connection connection = Util.getConnection();
		int totalQty=0;
		String updateStock="select quantity_available from stock where blood_type=?";
		PreparedStatement p = connection.prepareStatement(updateStock);
		p.setString(1,bloodType);
		ResultSet resultSet= p.executeQuery();
		if (resultSet.next()) {
			int qty= resultSet.getInt("quantity_available");
			totalQty= qty+quantity;
		}
		String updatedStock = "update stock set quantity_available = "+totalQty+" where blood_type= '"+bloodType+"';";
		 p = connection.prepareStatement(updatedStock);
		 int row=p.executeUpdate();
		 System.out.println("updated  :"+row);
		connection.close();
	}

	public static void delete(String donorId) throws ClassNotFoundException, SQLException {
		Connection connection = Util.getConnection();
		String deleteid = "delete from Bank where donor_id=?";
		PreparedStatement p = connection.prepareStatement(deleteid);
		p.setString(1, donorId);
		int row = p.executeUpdate();
		System.out.println("Deleted data: " + row);
		connection.close();
		}
	

	public static void insert(String donorId,String donorName,String bloodType,int quantity)throws ClassNotFoundException,SQLException
	         {
	          Connection connection = Util.getConnection();
	          String insertdata="insert into Bank values(?,?,?,?)";
	          PreparedStatement p= connection.prepareStatement(insertdata);
	          p.setString(1,donorId);
	          p.setString(2,donorName);
	          p.setString(3,bloodType);
	          p.setInt(4,quantity);
	        int row=  p.executeUpdate();
	        System.out.println("inserted data:"+row);
	          connection.close();
	         }

	public static List<BloodBank> bloodBankDetails() throws ClassNotFoundException, SQLException {
	        Connection connection = Util.getConnection();
	        String query = "select donor_id,donor_name,blood_type, quantity from Bank";
	        PreparedStatement ps = connection.prepareStatement(query);	
	        ArrayList<BloodBank> list = new ArrayList<>();	
	        ResultSet resultSet = ps.executeQuery();
	        while (resultSet.next()) {   
	        	String donorId = resultSet.getString("donor_id");
	        	String donorName = resultSet.getString("donor_name");
	        	String bloodtype=resultSet.getString("blood_type");
	        	int quantity = resultSet.getInt("quantity");
	        	BloodBank stud1 = new BloodBank();
	        	stud1.setDonorId(donorId);
	            stud1.setDonorName(donorName);
	            stud1.setBloodType(bloodtype);
	            stud1.setQuantity(quantity);
	            list.add(stud1);
	            System.out.println(list);
        }
	        return list;	  
	        }
	public static boolean register(BloodBank a,String donorID,Scanner scanner) throws ClassNotFoundException, SQLException {
		boolean flag = false;
        ArrayList<String> existingList = new ArrayList<String>();
        Connection connection =Util.getConnection();
        String check = "select donor_id from Bank";
        PreparedStatement ps = connection.prepareStatement(check);
        ResultSet resultSet = ps.executeQuery();
        while (resultSet.next()) {
             donorID = resultSet.getString("donor_id");
            existingList.add(donorID);
        }
        while(true) {
            if (existingList.contains(a.getDonorId())) {
                System.out.println("Donor ID already exist");
                System.out.println("Enter Donor Id");
    			donorID = scanner.next();
    			a.setDonorId(donorID);
                flag = false;
            } else {
                System.out.println("Donor Id available for Registration");
                flag = true;
                break;
            }
        }
        return flag;
    }

	}
