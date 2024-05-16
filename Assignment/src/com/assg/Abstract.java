package com.assg;
abstract class people{
	public void business(){
	System.out.println("this is abstract method need to extend first to use this method by extending using polymorphism concept");	
	}
}
public class Abstract extends people {
void middle() {
	System.out.println("this is used to extend abstract method so that calling is easy");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstract sc=new Abstract();
		sc.business();
		sc.middle();
		
	}

}
