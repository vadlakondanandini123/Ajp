package com.ajp1;

import java.util.Scanner;

public class Leapyear{
	public static void main(String[] args) {
		Scanner sc = new 
				Scanner (System.in);
		System.out.print("Enter year:");
		int year = sc.nextInt();
		if(isLeapyear(year)) {
			System.out.println(year + "is a Leap year.");
		}else
			System.out.println(year + "is not a Leap year.");
		}
public static boolean isLeapyear(int year) {

	return (year % 4 == 0 && year % 100 !=0)
			|| year % 400 == 0;
}
}