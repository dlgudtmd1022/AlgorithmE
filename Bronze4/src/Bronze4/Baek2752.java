package Bronze4;

import java.util.Arrays;
import java.util.Scanner;

public class Baek2752 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[]arr = new int [3];
		
		for(int i = 0; i < 3; i++) {
			arr[i] = scan.nextInt();
		}
		Arrays.sort(arr);
		for(int i = 0; i < 3; i++) {
			System.out.print(arr[i] + " ");
		}
		}
}