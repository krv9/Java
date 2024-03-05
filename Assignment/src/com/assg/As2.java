package com.assg;
import java.util.Scanner;
public class As2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter input:-");
		char c=sc.next().charAt(0);
		if((c>='A' && c<='Z')|| (c>='a' && c<='z'))
		{
			System.out.println("character is constant");
		}
		else {
			System.out.println("print correct value");
		}
	}

}
