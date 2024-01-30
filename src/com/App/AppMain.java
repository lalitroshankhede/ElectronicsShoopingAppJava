package com.App;

import com.Authentication.LogAuth;

public class AppMain {

	public static void main(String[] args) {

		System.out.println("======== Welcome to Apna Electronics =========");
		LogAuth obj = new LogAuth();
		obj.userRegistation();
	}
}
