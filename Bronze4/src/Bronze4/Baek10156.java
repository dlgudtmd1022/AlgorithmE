package Bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek10156 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk = new StringTokenizer(br.readLine());
		
		int K = Integer.parseInt(tk.nextToken());
		int N = Integer.parseInt(tk.nextToken());
		long M = Long.parseLong(tk.nextToken());
		
		if(K * N > M){
			System.out.println(-M + K * N);
		}else {
			System.out.println(0);
		}
	}
}