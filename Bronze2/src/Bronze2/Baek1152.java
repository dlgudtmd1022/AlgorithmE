package Bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek1152 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = 1;
		
		String word = br.readLine();
		for(int i = 0; i < word.length();i++) {
			char num = word.charAt(i);
			if(num == 32) {
				count++;
			}
		}
		if(word.charAt(0) == 32){
			count--;
		}
		if(word.charAt(word.length() - 1) == 32) {
			count--;
		}
		System.out.println(count);	
	}
}
