package com.Services;

import java.util.Scanner;

import com.Authentication.LogAuth;

public class AppMenuBean extends Thread {

	public void allMenus() throws InterruptedException {
		Scanner input = new Scanner(System.in);
		System.out.println();
		System.out.println("+-+-+-+-+ Special Offer get 5% Off on Product shooping above 2 Lac.  USE COUPEN Code : REPUBLIC26 +-+-+-+-+");

		System.out.println("******** Chooose Items **********");
		System.out.println("1.Electronics Items");
		System.out.println("2.Exit");
		int choose = 0;
		try {
			choose = input.nextInt();
		} catch (Exception e) {

			System.out.println("Illegal argument please enter appropriate value");
			allMenus();
		}

		switch (choose) {
		case 1:
			AppMenuImpl obj1 = new AppMenuImpl();
			obj1.allItems();
			break;

		case 2:

			LogAuth obj2 = new LogAuth();
			obj2.logAuthentication();
			break;

		default:
			System.out.println("Illegal Value please try again !");
			allMenus();
		}

	}

}
