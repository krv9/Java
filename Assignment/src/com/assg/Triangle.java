package com.assg;

public class Triangle {
	int area(int l,int b,int h) {
		return l*b*h;
	}
	int perimeter(int l,int b,int h) {
		return l+b+h;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t=new Triangle();
		System.out.println("Area of triangle is:-" +t.area(2,3,4));
		System.out.println("Perimeter of triangle:-"+t.perimeter(2,3,4));
	}

}
