package Medium;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Question10324 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader( new InputStreamReader(System.in));
		for(int i=1;;i++) {
			String input = bf.readLine();
			if(input.equals("")) 
				break;
			int cases = Integer.parseInt(bf.readLine());
			System.out.println("Case "+i+":");
			for(int j=0;j<cases;j++) {
				String number = bf.readLine();
				StringTokenizer st = new StringTokenizer(number," ");
				int num1 = Integer.parseInt(st.nextToken());
				int num2 = Integer.parseInt(st.nextToken());
				if(num1==num2) {
					System.out.println("Yes");
					break;
				}
				boolean flag=true;
				if(num1>num2) {
					  for (int k=num2;k<num1;k++) {  
                          if (input.charAt(k)!=input.charAt(k+1)) {  
                               flag = false;  
                               break;  
                          } 
					  }
				}else {
					 for (int k=num1;k<num2;k++) {  
                         if (input.charAt(k)!=input.charAt(k+1)) {  
                              flag = false;  
                              break;  
                         } 
					  }
				}
				if(flag)
					System.out.println("Yes");
				else 
					System.out.println("No");
			}
		}
	}
}
