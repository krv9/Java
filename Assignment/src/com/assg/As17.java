package com.assg;
import java.util.Scanner;
public class As17 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string:-");
		String str1;
		str1=sc.next();
		String str2 ="Red";
		if(str1.startsWith(str2)) {
			System.out.println("True, matching");
		}
		else {
			System.out.println("False,not matching");
		}
	}

}
