package com.assg;

class Parent{
	void Pprint() {
		System.out.println("Parent Class");
	}
}
class child extends Parent{
	void Cprint() {
		System.out.println("Child class");
	}
}
public class Inheritance {
	public static void main(String[] args) {
		child t= new child();
		t.Pprint();
		t.Cprint();
	}

}
