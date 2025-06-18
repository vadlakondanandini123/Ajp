package Box;
class A{
	int num;
	A(){
		System.out.println("class A");
	}
	void getNum() {
		System.out.println("num="+num);
		
	}
}
//sub class
class B extends A{
	int num1;
	B(){
		System.out.println("class B");
	}
	void getValue() {
		System.out.println("num1="+num1);
	}
}
class C extends B{
	int num2;
	C(){
	System.out.println("class C");
	}
	void getNum2() {
		System.out.println("num2="+num2);
	}
	}

 class Main {
	public static void main(String args[]) {
		C b=new C();
	    b.num=10;
	    b.num1=30;
	    b.num2=40;
		b.getNum();
		b.getValue();
		b.getNum2();
	}

}
