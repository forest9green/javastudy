package condition_for;

import java.util.Scanner;

public class q10871 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int num:arr) {
			if(num<x) {
				System.out.print(num+" ");
			}
		}

	}

}
