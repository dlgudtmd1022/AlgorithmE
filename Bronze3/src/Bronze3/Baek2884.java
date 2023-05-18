package Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek2884 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk = new StringTokenizer(br.readLine());
		
		int H = Integer.parseInt(tk.nextToken());
		int M = Integer.parseInt(tk.nextToken());
		
		M -= 45;
		if(M < 0) {
			M += 60;
			if(H < 0) {
				H = 23;
			}
		}
		System.out.println(H + " " + M);
	}
}
