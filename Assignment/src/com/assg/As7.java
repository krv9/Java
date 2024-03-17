package com.assg;
import java.util.Scanner;
public class As7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter positive input:-");
		int num=sc.nextInt();
		int count=0;
		if(num>0) {
		while(num!=0) {
			num=num/10;
			count++;
		}
		System.out.println("count of integer:-"+count);
			}
	
	 else {
		System.out.println("next time");
	 }
	}
	
}


