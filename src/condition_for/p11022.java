package condition_for;

import java.util.Scanner;

public class p11022 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int[] arr1=new int[num];
		int[] arr2=new int[num];
		for(int i=0;i<num;i++) {
			arr1[i]=sc.nextInt();
			arr2[i]=sc.nextInt();
		}
		
		for(int i=0;i<num;i++) {
			System.out.println("Case #"+(i+1)+": "+arr1[i]+" + "+arr2[i]+" = "+(arr1[i]+arr2[i]));
		}

	}

}
