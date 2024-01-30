package com.Authentication;

import java.util.Scanner;

import com.Services.AppMenuBean;

public class LogAuth implements AuthenticationSystem {

	Scanner input = new Scanner(System.in);
	String newUser, newPass, newEmail;
	String username, password;

	@Override
	public void userRegistation() throws IllegalArgumentException {
		System.out.println("********* Registration *********");
		System.out.print("Enter New Username :");
		newUser = input.next();
		System.out.print("Enter New Password :");
		newPass = input.next();
		System.out.print("Enter Email :");
		newEmail = input.next();
		System.out.println("Registration Successful Press 1 to Login");

		int choose = 0;
		try {
			choose = input.nextInt();
		} catch (Exception e) {

			System.out.println("Illegal argument please enter appropriate value");
			userRegistation();
		}

		switch (choose) {
		case 1: {
			logAuthentication();
			break;
		}

		default:
			System.out.println("Illigal value please choose 1 to Login");
			choose = input.nextInt();
			while (choose != 1) {
				System.out.println("Illigal value please choose 1 to Login");
				choose = input.nextInt();
				if (choose == 1) {

					logAuthentication();
				}
			}
		}
	}

	@Override
	public void logAuthentication() {

		username = this.newUser;
		password = this.newPass;

		System.out.println("***** Please Login *******");
		System.out.print("Enter Username :");
		username = input.next();
		System.out.print("Enter Password :");
		password = input.next();

		try {

			if (username.equals(newUser) && password.equals(newPass)) {

				System.out.println("Welcome Mr." + newUser);
				AppMenuBean obj = new AppMenuBean();
				obj.allMenus();
			}

			else {
				System.out.println("Invalid Creaditional Please Try again !");
				logAuthentication();
			}

		} catch (Exception e) {

			System.out.println("Invalid Input Please Try Again !");
			logAuthentication();
		}
	}

}
