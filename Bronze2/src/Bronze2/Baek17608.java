package Bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek17608 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 1;
			
		int N = Integer.parseInt(br.readLine());
		
		int [] arr = new int[N];
		
		for(int i = 0;i < N;i++) {
			arr[i] = Integer.parseInt(br.readLine());				
		}
		int max = arr[N-1];
		for(int i = N-1; i >= 0; i--) {
			if(max < arr[i]) {
			max = arr[i];
			count++;
			}
		}
		System.out.println(count);
	}
}