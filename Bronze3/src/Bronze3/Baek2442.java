package Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek2442 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		

		for(int i = 1; i <= N; i++) {
			for(int j = N; j > i;j--) {
				System.out.print(" ");
			}
			for(int k = 0; k <i * 2 - 1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
