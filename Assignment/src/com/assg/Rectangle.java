package com.assg;

class Mrectangle {
public int perimeter(int L,int B) {
	return L+B;
}
public int area(int L,int B) {
	return L*B;
}
}
class Square extends Mrectangle{
	public int area(int L) {
		return L*L;
	}
	public int perimeter(int L) {
		return L+L;
	}

}
public class Rectangle{
public static void main (String args []) {
	Square t=new Square();
	int Rperi=t.perimeter(2, 3);
	int Rarea=t.area(3,4);
	int Sarea=t.area(2);
	int Speri=t.perimeter(4);
	
	System.out.println("Perimeter of Rectangle-"+Rperi);
	System.out.println("Area of Rectangle-"+Rarea);
	System.out.println("Perimeter of Square-"+Speri);
	System.out.println("Area of Square-"+Sarea);

}
}