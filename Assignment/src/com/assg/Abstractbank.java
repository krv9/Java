package com.assg;
abstract class bank{
	void entry() {
		System.out.println("abstract class");
	}
	abstract void getbalance();
}
class A extends bank{
	public void getbalance() {
		System.out.println("$100");
	}
}
class B extends bank{
	public void getbalance() {
		System.out.println("$150");
	}
}
class C extends bank{
	public void getbalance() {
		System.out.println("$200");
	}
}

public class Abstractbank extends C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C sc=new C();
		sc.entry();
		sc.getbalance();
		B bc=new B();
		bc.getbalance();
		A ac=new A();
		ac.getbalance();
	}

}
