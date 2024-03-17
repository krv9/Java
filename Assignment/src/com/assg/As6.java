package com.assg;

public class As6 {

	public static void main(String[] args) {
		int i=1;
		while(i<5) {
		int l=i-1;
		int j= ((l*(l+1))/2)+1;
		int k=j+i;
		while(j<k) {
			System.out.print(j);
			j=j+1;
		}
		System.out.println();
		i=i+1;
		}
	}

}
