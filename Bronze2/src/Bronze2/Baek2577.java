package Bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek2577 {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());

		String multi = String.valueOf(A * B  * C);
		
		for(int i = 0; i <= 9 ; i++) {
			int count = 0;
			for(int j = 0; j < multi.length(); j ++) {
			if(multi.charAt(j) == (char)(i + '0')) {
			count++;
			}		
		}
		System.out.println(count);
		}
		System.out.println(multi);
	}
}
