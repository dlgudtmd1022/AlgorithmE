package Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek10250 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk = new StringTokenizer(br.readLine());
		
		int T = Integer.parseInt(tk.nextToken());

		for(int i = 0; i < T;i++) {
			tk = new StringTokenizer(br.readLine());
			int H = Integer.parseInt(tk.nextToken());
			int W = Integer.parseInt(tk.nextToken());
			int N = Integer.parseInt(tk.nextToken());
			int num = (N - 1) / H + 1;
			int floor = (N - 1) % H + 1;
			String n = Integer.toString(floor);
			if(num >= 10) {
				System.out.println(n + num);
			}else {
				System.out.println(n + 0 + num);
			}
	}
}
}
