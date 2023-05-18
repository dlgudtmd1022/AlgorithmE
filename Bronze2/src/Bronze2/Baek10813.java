package Bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek10813 {

	public static void main(String[] args) throws IOException{
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(tk.nextToken());
		int M = Integer.parseInt(tk.nextToken());
		
		
		int [] arr = new int [N+ 1];
		for(int i = 1; i <= N;i++) {
			arr[i] = i;
		}
		for(int k = 0; k < M; k++) {
			tk = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(tk.nextToken());
			int j = Integer.parseInt(tk.nextToken());
			int num = arr[i];
			arr[i] = arr[j];
			arr[j] = num;
		}
		for(int i = 1; i <= N; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
