package io;

import java.util.Scanner;

public class q2588 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		//b의 1의 자리 뽑기
		//System.out.println(b-b/10*10);
		
		//(3)
		System.out.println(a*(b-b/10*10));
		
		//(4)
		System.out.println(a*((b-b/100*100)/10));
		
		//(5)
		System.out.println(a*(b/100));
		
		//(6)
		System.out.println(a*b);

	}

}
