package Bronze5;

import java.util.Scanner;

public class Baek4101 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a == 0 && b == 0) {
			break;			
		}else if(a <= b) {
			System.out.println("No");
		}else if (a > b) {
			System.out.println("Yes");
		}
		}
	}
}