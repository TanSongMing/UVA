package SuperEasy;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Question12279 {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader( new InputStreamReader(System.in));
		for(int i=1;;i++) {
			int cases = Integer.parseInt(bf.readLine());
			if(cases==0)
				break;
			int count=0;
			String Input=bf.readLine();
			StringTokenizer st = new StringTokenizer(Input," ");
			for(int j=0;j<cases;j++) {
				int input = Integer.parseInt(st.nextToken());
				if(input==0)
					count--;
				else
					count++;
			}
			System.out.println("Case "+i+": "+count);
		}
	}
}
