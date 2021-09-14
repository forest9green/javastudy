package condition_while;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class p10952 {

	public static void main(String[] args) throws IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		List plus=new ArrayList();
		int flagNum=0;
		
		do{
			StringTokenizer st=new StringTokenizer(br.readLine()," ");
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			flagNum=a+b;
			if(flagNum!=0) {
				plus.add(flagNum);					
			}
		}while(flagNum!=0);
		
		for(int i=0;i<plus.size();i++) {
			System.out.println(plus.get(i));
		}
		
	}

}
