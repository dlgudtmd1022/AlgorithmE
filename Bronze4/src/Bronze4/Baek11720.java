package Bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek11720 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String all = br.readLine();
		int sum = 0;
		for(int i = 0;i < N; i++) {		
			char num = all.charAt(i);
			int alone = Character.getNumericValue(num);
			sum += alone;
		}
		System.out.println(sum);
	}
}

