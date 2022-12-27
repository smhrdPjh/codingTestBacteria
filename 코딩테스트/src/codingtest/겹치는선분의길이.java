package codingtest;

public class 겹치는선분의길이 {

	public static void main(String[] args) {

		int arr[][] = { { -80, -89 }, { 2, 4 }, { 3, 9 } };
		int overlap = overlapedLine(arr);
		System.out.println(overlap);

	}

	public static int overlapedLine(int[][] lines) {

		//치환용배열 선언 -100~+100 => 0~200 -배열이 없기때문
		int[] arr = new int[200];
		int answer = 0;

		// 
		for (int i = 0; i < lines.length; i++) {
			for (int j = lines[i][0] + 100; j < lines[i][1] + 100; j++) {
				arr[j]++;
				System.out.println(j+"번째 배열의 j:"+arr[j]);
			}
		}

		for (int i = 0; i < 200; i++) {
			if (arr[i] > 1)
				answer++;
		}
		return answer;

	}
}
