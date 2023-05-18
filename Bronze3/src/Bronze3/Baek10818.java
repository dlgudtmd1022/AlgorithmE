package Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek10818 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(tk.nextToken());
		tk = new StringTokenizer(br.readLine());
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i = 0;i < N;i++) {
			int num = Integer.parseInt(tk.nextToken());
			if(num > max) {
				max = num;
			}
			if(num < min) {
				min = num;
			}
		}
		System.out.println(min + " " + max);
	}
}
