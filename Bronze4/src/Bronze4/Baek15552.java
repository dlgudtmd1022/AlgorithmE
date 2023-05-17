package Bronze4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baek15552 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer  tk = new StringTokenizer(br.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(tk.nextToken());
				
		for(int i = 0; i < T; i++) {
			tk = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(tk.nextToken());
			int B = Integer.parseInt(tk.nextToken());
			bw.write(String.valueOf(A + B));
			bw.newLine();
		}	
		bw.flush();
		br.close();
		bw.close();
	}
}

