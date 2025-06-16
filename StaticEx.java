package com.ajp1;

public class StaticEx {
	//instance
	int num;
	//static variable
	static int val;
	//static method
	static void getMsg() {
		System.out.println("static method"+val);
	}
	//instance
	void getCall() {
		System.out.println("static method"+val+","+num);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        val=10;
        System.out.println(val);
        StaticEx staticEx=new StaticEx();
        staticEx.num=20;
        System.out.println(staticEx.num);
        staticEx.val=30;
        System.out.println(staticEx.val);
        getMsg();
        
	}

}
