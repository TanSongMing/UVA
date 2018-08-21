package Medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question10424 {
	static String check = " abcdefghijklmnopqrstuvwxyz";
	static int recurseSum (int i) {
		if (i<10) {
			return i;
		} else {
			int sum=0;
			while (i>0) {
				sum+=i%10;
				i/=10;
			}
			return recurseSum(sum);
		}
	}
	static int number(String n) {
		n=n.toLowerCase();
		int sum=0;
		for (int i=0;i<n.length();i++) {
			for(int j=0;j<check.length();j++) {
				if(n.charAt(i)==check.charAt(j)) {
					sum+=j;
					break;
				}
			}
		}
		return recurseSum(sum);
	}
	public static void main (String [] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader (System.in));
		String s;
		while ((s=bf.readLine())!=null) {
			double num1 = number(s);
			double num2 = number(bf.readLine());
			double ratio=(Math.min(num1,num2)/Math.max(num1, num2))*100;
			System.out.printf("%.2f %%\n",ratio);
			}
	}
}