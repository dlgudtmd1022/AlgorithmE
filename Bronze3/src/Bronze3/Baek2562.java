package Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek2562 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int maxNum = 0;
		int max = 0;
		int arr[] = new int [9];
		for(int i = 0; i < arr.length; i ++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(arr[i] > max) {
				max = arr[i];
				maxNum = i + 1;
			}
		}
	System.out.println(max);
	System.out.println(maxNum);
	}
}
