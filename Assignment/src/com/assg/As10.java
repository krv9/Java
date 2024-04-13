package com.assg;
import java.util.Scanner;
public class As10 {

	public static void main(String[] args) {
		Scanner num=new Scanner(System.in);
		System.out.println("enter num :-");
		int n=num.nextInt();
		int nn= n*10+n;
		int nnn= n*100+nn;
		int result = n + nn +nnn;
		System.out.println("number:-"+n+"+"+nn+"+"+nnn);
		System.out.println(result);
	}

}
