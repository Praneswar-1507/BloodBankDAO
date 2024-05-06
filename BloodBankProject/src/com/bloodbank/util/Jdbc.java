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
	

	public static void update(String donorId, String donorName, String bloodType, int quantity)
			throws ClassNotFoundException, SQLException {
		Connection connection = Util.getConnection();
		String updateTable = "update Bank set donor_name=?,quantity=? where donor_id=?";
		PreparedStatement p = connection.prepareStatement(updateTable);
		p.setString(3, donorId);
		p.setString(1, donorName);
		p.setInt(2, quantity);
		int row = p.executeUpdate();
		System.out.println("updated data:" + row);
		connection.close();
	}

	public static void delete(String donorId) throws ClassNotFoundException, SQLException {
		Connection connection = Util.getConnection();
		String query = "delete from Bank where donor_id=?";
		PreparedStatement p = connection.prepareStatement(query);
		p.setString(1, donorId);
		int row = p.executeUpdate();
		System.out.println("Deleted data: " + row);
		connection.close();
	}

	public static void insert(String donorId,String donorName,String bloodType,int quantity)throws ClassNotFoundException,SQLException
	         {
	          Connection connection = Util.getConnection();
	          String query="insert into Bank values(?,?,?,?)";
	          PreparedStatement p= connection.prepareStatement(query);
	          p.setString(1,donorId);
	          p.setString(2,donorName);
	          p.setString(3,bloodType);
	          p.setInt(4,quantity);
	        int row=  p.executeUpdate();
	        System.out.println("inserted data:"+row);
	          connection.close();
	         }

	public static List<BloodBank> listofStudents() throws ClassNotFoundException, SQLException {
	        Connection connection = Util.getConnection();
	        String query = "select id,name, grade from student";
	        PreparedStatement ps = connection.prepareStatement(query);	
	        ArrayList<BloodBank> list = new ArrayList();	
	        ResultSet resultSet = ps.executeQuery();
	        while (resultSet.next()) {   
	        	String donorId = resultSet.getString("id");
	        	String donorName = resultSet.getString("name");
	        	int quantity = resultSet.getInt("quantity");
	        	BloodBank stud1 = new BloodBank();
	        	stud1.setDonorId(donorId);
	            stud1.setDonorName(donorName);	           
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
        String query = "select donor_id from Bank";
        PreparedStatement ps = connection.prepareStatement(query);
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
