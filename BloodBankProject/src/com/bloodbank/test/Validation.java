package com.bloodbank.test;

import java.util.Scanner;

import com.bloodbank.model.BloodBank;

public class Validation {
	BloodBank a1 = new BloodBank();

	public String passwordCheck(Scanner scanner, String password) {
		while (true) {
			if (!password.matches("^(?=.*[a-z])(?=.*[A-z])(?=.*[0-9])(?=.*[@#$%]).{7}$")) {
				System.out.println("Incorrect Password");
				System.out.println("Password must contain atleast one uppercase,one lowercase,one digit,one symbol ");
				password = scanner.next();
			} else {
				break;
			}
		}
		return password;
	}

	public int quantityCheck(Scanner scanner, int quantity) {
		while (true) {
			if (quantity < 0) {
				System.out.println("Enter positive value:");
				quantity = scanner.nextInt();
			} else {
				break;
			}
		}
		return quantity;

	}

	public String BloodTypeCheck(Scanner scanner, String bloodType) {
		while (true) {
			if (!bloodType.matches("^(A|B|AB|O)[+-]$")) {
				System.out.println("Enter valid Blood Type(A+,AB+ve,AB-ve,o+ve,o-ve,A-,b-):");
				bloodType = scanner.next();
			} else {
				break;
			}

		}
		return bloodType;
	}

}
