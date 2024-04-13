package com.assg;
import java.util.Scanner;
public class As4 {

	
	public static void main(String[] args) {
		int sum=0;
		for (int i=1; i<6; i++) {
			Scanner n=new Scanner(System.in);
			System.out.println("enter value "+i+":-");
			int num=n.nextInt();
			sum=sum+num;
						
		}
		double average=0;
		average=(double)sum/5;
		System.out.println("Sum:-"+sum);
		System.out.println("Average:-"+average);
	}
}
