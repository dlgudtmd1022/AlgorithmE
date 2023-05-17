package Bronze5;

import java.util.Scanner;

public class Baek1271 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		scan.close();
		
		long top = (long)(n / m);
		long bottom = (long)(n % m);
		
		System.out.println(top);
		System.out.println(bottom);
		
		
	}
}