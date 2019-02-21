package sum;

import java.util.Scanner;

public class OddEvenSum {

	public static void main(String[] args) {


		int sumOdd = 0;
		int sumEven = 0;
		
		sumEven = summEven(1, 10);
		System.out.println("1 부터 10까지의 짝수 합은 : " + sumEven);
		
		
	}
	
	public static int summEven(int start, int end) {
		int sum = 0;
		
		for (int i = 1; i <= end; i++) {
			if (i%2==1) {
				continue;
			}
			sum += i;
		}
		return sum;
	}

}
