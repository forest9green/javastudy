package condition_if;

import java.util.Scanner;

public class q2884 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int hour=sc.nextInt();
		int min=sc.nextInt();
		
		if(hour>0) {
			if(min>=45) {
				min=min-45;
			}else {
				hour=hour-1;
				min=min+15;
			}
		}else {
			if(min>=45) {
				min=min-45;
			}else {
				hour=23;
				min=min+15;
			}
		}
		
		System.out.println(hour+" "+min);

	}

}
