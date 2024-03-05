package com.assg;
import java.util.Scanner;
public class As3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a year:-");
		int year =sc.nextInt();
		if((year%100==0)&&(year%400==0)) {
			System.out.println("It is leap year");
		}
		else {
			System.out.println("It is not a leap year");
		}
		System.out.println("First 10 natural numbers:-");
		int i=1;
		while(i<11) {
			System.out.print(i);
			i=i+1;
		}
	}

}
