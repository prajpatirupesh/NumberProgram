package com.jsp.numberprogram;

public class FindLcm {
	public static void findLcm(int n1,int n2) {
		int lcm=(n1<n2)? n1:n2;
		while(true) {
			if(lcm%n1==0 && lcm%n2==0) {
				System.out.println(lcm);
				break;
			}
			lcm++;
		}
	}
	public static void main(String[] args) {
		System.out.println("rUPESH KUMAR");
		findLcm(12, 15);
	}
}
