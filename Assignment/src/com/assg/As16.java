package com.assg;

import java.util.Scanner;

public class As16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1;
		System.out.println("enter a String :-");
		str1 = sc.next();
		String str2 = "se";

		boolean ends = false;
		int i = str1.length() - 1;
		int j = str2.length() - 1;

		while (i >= 0 && j >= 0) {
			if (str1.charAt(i) != str2.charAt(j)) {
				ends = false;
				break;
			} else {
				ends = true;
				i--;
				j--;
			}
		}

		System.out.println("Does " + str1 + " end with " + str2 + "? " + ends);
		sc.close();
	}

}
