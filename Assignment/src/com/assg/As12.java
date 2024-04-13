package com.assg;

public class As12 {

	public static void main(String[] args) {
		int i=1;
		while(i<101) {
			if((i%3==0) || (i%5==0) ||((i%3==0) && (i%5==0))) {
				System.out.println(i);
				
			}
			
			i=i+1;
		}
	}

}
