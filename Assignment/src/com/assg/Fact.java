package com.assg;
import java.util.Scanner;
public class Fact {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number n:-");
	int n=sc.nextInt();
	int fact=1;
	int i=n;
	while(i>0) {
		fact=fact*i;
		i=i-1;
//		System.out.println(fact);
	}
	System.out.println("factorial of "+n+" is:-"+fact);
}
}
