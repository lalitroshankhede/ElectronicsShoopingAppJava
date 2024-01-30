package com.Services;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AppMenuImpl extends Thread implements AppMenuDao {

	Scanner input = new Scanner(System.in);
	protected int samMobTotal, appMobTotal, oneMobTotal;
	protected int lenoLapTotal, hpLapTotal, asusLapTotal;
	float totalAmount, finalBillAmt;
	String DiscountCoupenCode = "REPUBLIC26", userCoupen;

	@Override
	public void allItems() throws InterruptedException {
		System.out.println("****** Mobiles *******");
		int mobPrice[] = { 40000, 60000, 35000 };
		int lapPrice[] = { 40000, 50000, 70000 };
		String mobModel[] = { "1. Samsung", "2. Apple", "3. OnePlus" };
		String lapModel[] = { "4. Lenovo", "5. HP", "6. Asus" };
		sleep(1000);
		System.out.println(mobModel[0] + " " + mobPrice[0]);
		System.out.println(mobModel[1] + " " + mobPrice[1]);
		System.out.println(mobModel[2] + " " + mobPrice[2]);
		System.out.println("****** Laptops *******");
		sleep(1000);
		System.out.println(lapModel[0] + " " + lapPrice[0]);
		System.out.println(lapModel[1] + " " + lapPrice[1]);
		System.out.println(lapModel[2] + " " + lapPrice[2]);
		System.out.println("7.Total Price of Mobiles");
		System.out.println("8.Total Price of Laptops");
		System.out.println("9.Generate Bill");

		// Implementation

		int choose = input.nextInt();

		switch (choose) {
		case 1: {

			System.out.println("You Choosed " + mobModel[0] + " " + mobPrice[0]);

			do {
				System.out.println("Add again ?");
				System.out.println("1. Yes 2. No");
				choose = input.nextInt();
				switch (choose) {
				case 1:
					samMobTotal = mobPrice[0] + samMobTotal;
					System.out.println("Total Price = " + samMobTotal);
					break;

				case 2:
					allItems();
					break;

				}
			} while (choose != 2);

			break;
		}

		case 2: {

			System.out.println("You Choosed " + mobModel[1] + " " + mobPrice[1]);
			do {
				System.out.println("Add again ?");
				System.out.println("1. Yes 2. No");
				choose = input.nextInt();
				switch (choose) {
				case 1:
					appMobTotal = mobPrice[1] + appMobTotal;
					System.out.println("Total Price = " + appMobTotal);
					break;

				case 2:
					allItems();
					break;

				}
			} while (choose != 2);
			break;
		}

		case 3: {

			System.out.println("You Choosed " + mobModel[2] + " " + mobPrice[2]);

			do {
				System.out.println("Add again ?");
				System.out.println("1. Yes 2. No");
				choose = input.nextInt();
				switch (choose) {
				case 1:
					oneMobTotal = mobPrice[2] + oneMobTotal;
					System.out.println("Total Price = " + oneMobTotal);
					break;

				case 2:
					allItems();
					break;

				}
			} while (choose != 2);
			break;
		}

//		******************* Laptop Items ***************************

		case 4: {

			System.out.println("You Choosed " + lapModel[0] + " " + lapPrice[0]);

			do {
				System.out.println("Add again ?");
				System.out.println("1. Yes 2. No");
				choose = input.nextInt();
				switch (choose) {
				case 1:
					lenoLapTotal = lapPrice[0] + lenoLapTotal;
					System.out.println("Total Price = " + lenoLapTotal);
					break;

				case 2:
					allItems();
					break;

				}
			} while (choose != 2);

			break;
		}

		case 5: {

			System.out.println("You Choosed " + lapModel[1] + " " + lapPrice[1]);
			do {
				System.out.println("Add again ?");
				System.out.println("1. Yes 2. No");
				choose = input.nextInt();
				switch (choose) {
				case 1:
					hpLapTotal = lapPrice[1] + hpLapTotal;
					System.out.println("Total Price = " + hpLapTotal);
					break;

				case 2:
					allItems();
					break;

				}
			} while (choose != 2);
			break;
		}

		case 6: {

			System.out.println("You Choosed " + lapModel[2] + " " + lapPrice[2]);

			do {
				System.out.println("Add again ?");
				System.out.println("1. Yes 2. No");
				choose = input.nextInt();
				switch (choose) {
				case 1:
					asusLapTotal = lapPrice[2] + asusLapTotal;
					System.out.println("Total Price = " + asusLapTotal);
					break;

				case 2:
					allItems();
					break;

				}
			} while (choose != 2);
			break;
		}

		case 7: {

			System.out.println("Total Pricing of Mobile Phones is : Samsung : " + samMobTotal + " " + " Apple : "
					+ appMobTotal + " " + "One Plus :" + oneMobTotal);
			System.out.println("Press 1 to main menu");
			choose = input.nextInt();
			switch (choose) {
			case 1:
				allItems();
				break;

			default:
				System.out.println("Invalid option try again!");

				break;
			}

			break;
		}
		case 8: {

			System.out.println("Total Pricing of Mobile Phones is : Lenovo : " + lenoLapTotal + " " + " HP : "
					+ hpLapTotal + " " + "Asus :" + asusLapTotal);
			System.out.println("Press 1 to main menu");
			choose = input.nextInt();
			switch (choose) {
			case 1:
				allItems();
				break;

			default:
				System.out.println("Invalid option try again!");

				break;
			}

			break;
		}
		case 9: {

			System.out.println();
			System.out.println("********** Product Invoice ***********");
			System.out.println("_________________________________");

			System.out.println("Names                 Price");
			System.out.println("===================================");
			
		   DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		   LocalDateTime localDateTime=LocalDateTime.now();
		   System.out.println("	  Date : "+dateTimeFormatter.format(localDateTime));
			
			System.out.println("-*-*-*-*- Mobiles *-*-*-*-*-");
			System.out.println(mobModel[0] + " :		 " + samMobTotal);
			System.out.println(mobModel[1] + " :		 " + appMobTotal);
			System.out.println(mobModel[2] + " :		 " + oneMobTotal);

			System.out.println("-*-*-*-*- Laptops *-*-*-*-*-");
			System.out.println(lapModel[0] + " :		 " + lenoLapTotal);
			System.out.println(lapModel[1] + " :		 " + hpLapTotal);
			System.out.println(lapModel[2] + " :		 " + asusLapTotal);

			totalAmount = samMobTotal + appMobTotal + oneMobTotal + lenoLapTotal + hpLapTotal + asusLapTotal;

			if (totalAmount > 200000) {

				System.out.print("Apply Coupen Code : ");
				userCoupen = input.next();
				if (DiscountCoupenCode.equalsIgnoreCase(userCoupen)) {
					System.out.println("Applied Coupen Successfully");
					finalBillAmt = (float) (totalAmount - (0.05 * totalAmount));
					System.out.println("Total Discount        - " + (0.05 * totalAmount));

					
					System.out.println("=================================");
                     
					System.out.println("Total Bill :           " + finalBillAmt);

				} else {
					sleep(1000);
					System.out.println("Coupen Invalid");
					System.out.println("=================================");
					System.out.println("Total Bill :           " + totalAmount);
				}
			}

			else {
				System.out.println("=================================");
				System.out.println("Total Bill :           " + totalAmount);
			}

		}

			break;

		default:
			allItems();
		}

	}

}
