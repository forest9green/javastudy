package io;

import java.util.Scanner;

public class q10430 {

	public static void main(String[] args) {

		/*
		 * int a=5; int b=8; int c=4;
		 */
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println((a+b)%c);
		System.out.println(((a%c)+(b%c))%c);
		System.out.println((a*b)%c);
		System.out.println(((a%c)*(b%c))%c);

	}

}
