package codingtest;

import java.util.ArrayList;

public class codingtest04 {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5};
	
		
		int check = get(numbers,6);
	System.out.println(check);
	}

	public static int get(int[] numbers, int k) {

		
	
		

		int result = 0;
		int j = -2;
		for (int i = 1; i <= k; i++) {

			j = j+2;
		
			if (j == numbers.length) {
				j = 0;

			} else if (j > numbers.length) {
				j = 1;

			}	
		
			System.out.println(j);
			result = numbers[j];

		}
		

		return result;
	}

}
