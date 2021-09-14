package condition_while;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1110 {

	public static void main(String[] args) throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String oriNum=br.readLine();
		String middleNum=oriNum;
		String newNum="";
		char lastNum;
		int count=0;
		boolean flag=true;
		if(Integer.parseInt(oriNum)<10) {
			oriNum=oriNum+"0";
			middleNum=oriNum+"0";
		}
		do {
			if(Character.getNumericValue(middleNum.charAt(0))+Character.getNumericValue(middleNum.charAt(1))>=10) {
				lastNum=(Integer.toString(Character.getNumericValue(middleNum.charAt(0))+Character.getNumericValue(middleNum.charAt(1)))).charAt(1);
			}else {
				lastNum=(Integer.toString(Character.getNumericValue(middleNum.charAt(0))+Character.getNumericValue(middleNum.charAt(1)))).charAt(0);
			}
			newNum=middleNum.charAt(1)+Character.toString(lastNum);
			count++;
			if(!oriNum.equals(newNum)) {
				middleNum=newNum;
			}else {
				flag=false;
			}
		}while(flag);
		System.out.println(count);
		
		//스캐너로 받아서 for문 돌리는 것이 훨씬 편한 코드임....
		//너무 어렵게 짰다
	}

}
