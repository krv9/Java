package com.assg;
import java.util.Scanner;
public class As1 {

	public static void main(String[] args) {
		       
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st num:-");
		int n1=sc.nextInt();
		System.out.println("enter 2nd num:-");
		int n2=sc.nextInt();
		System.out.println("enter 3rd num:-");
        int n3=sc.nextInt();
        if(n1>n2 && n1>n3){
	      System.out.println("First number is greatest");
		  }
       else if(n2>n1 && n2>n3){
	     System.out.println("Number 2 is greatest");
		 }
	  else{
		        System.out.println("Number3 is greatest");
	  }

	}

}
