package com.ajp1;

public class Fibonacci {

	 static void series( int range)
	 {
		int num1=0;
		int num2=1;
		int num3;
		System.out.println(num1+" "+num2);
		for(int i=3;i<=range;i++) {
			num3=num1+num2;
			System.out.println(" "+num3);
			num1=num2;
			num2=num3;
		}
		
	 }
	 public static void main(String arg[])
	 {
	series(10);	  
		 }
	 }
	 
// TODO Auto-generated method stub

	
 
