package Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek10810 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(tk.nextToken());
		int M = Integer.parseInt(tk.nextToken());
		
		int [] arr = new int [N + 1];
		
		for(int u =0; u < M; u++) {
			tk = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(tk.nextToken());
			int j = Integer.parseInt(tk.nextToken());	
			int k = Integer.parseInt(tk.nextToken());
			for(int index = i; index <= j; index++) {
				arr[index] = k;
			}	
		}
		for(int i = 1; i <= N; i++) {
			System.out.print(arr[i] + " ");
		}	
	}
}
