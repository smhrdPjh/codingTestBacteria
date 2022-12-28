package codingtest;

public class 피나보치 {

	public static void main(String[] args) {
		int check = pinabocci(3);
		System.out.println("결과:" + check);

	}

	public static int pinabocci(int n) {

		
		int[] arr = new int[n + 1];

		
		arr[0] = 0;
		arr[1] = 1;

		for (int i = 2; i <= n; i++) {

			arr[i] = (arr[i - 1] % 1234567) + (arr[i - 2] % 1234567);

		}

		return arr[n] % 1234567;
	}

}
