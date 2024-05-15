package com.assg;

public class Areas {
static int area(int l) {
	return l*l;
}
static int area(int l , int b) {
	return l*b;
}
	public static void main(String[] args) {
		int square=area(2);
		System.out.println("area of square:" +square);
		int rectangle=area(2,3);
		System.out.println("area of rectangle:" +rectangle);

	}

}
