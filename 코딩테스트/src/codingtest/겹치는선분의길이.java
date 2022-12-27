package codingtest;

public class 겹치는선분의길이 {

	public static void main(String[] args) {

		int arr[][] = { { -80, -89 }, { 2, 5 }, { 3, 9 } };
		int overlap = overlapedLine(arr);
		System.out.println(overlap);

	}

	public static int overlapedLine(int[][] lines) {

		//치환용배열 선언 -100~+100 => 0~200 -배열이 없기때문 즉, 똑같은 범위내에 선분 3개중 겹치는 애들만 걸러내면 됨
		int[] arr = new int[200];
		int answer = 0;

		// {x1,x2} x1과 x2 사이의 배열 ++시켜서 선분의 길이 표시  초기값은 200개배열 전부 0으로 초기화됨
		for (int i = 0; i < lines.length; i++) {
			for (int j = lines[i][0] + 100; j < lines[i][1] + 100; j++) {
				arr[j]++;
				System.out.println(j+"번째 배열의 j:"+arr[j]);
			}
		}
		// 2이상은 선분이 중첩된 것임으로 200개의 배열중 2이상인 애들의 갯수를 구하여 리턴~! 
		for (int i = 0; i < 200; i++) {
			if (arr[i] > 1) {
				answer++;
			}
		}
		return answer;

	}
}
