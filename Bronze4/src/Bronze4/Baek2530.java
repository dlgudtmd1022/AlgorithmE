package Bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek2530 {

	public static void main(String[] args) throws IOException{
		BufferedReader br  = new BufferedReader				
				(new InputStreamReader(System.in));
		StringTokenizer tk = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(tk.nextToken());
		int B = Integer.parseInt(tk.nextToken());
		int C = Integer.parseInt(tk.nextToken());
		tk = new StringTokenizer(br.readLine());		
		int D = Integer.parseInt(tk.nextToken());		
	
		
			C += D;
			if(C >= 60) {
				B += C / 60;
				C %= 60;
				if(B >= 60) {
					A += B / 60;
					B %= 60;
					if(A >= 24) {
						A %= 24;
				}
			}
		}	
		System.out.println(A + " " + B + " " + C);	
	}
}