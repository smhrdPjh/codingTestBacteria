package codingtest;

public class _7의개수 {

	public static void main(String[] args) {

		int arr[] = { 7, 77, 7177, 10, 20 };

		int result = solution(arr);

		System.out.println(result);

	}

	public static int solution(int array[]) {
		int num7 = 0;
		for (int i = 0; i < array.length; i++) {
			
			//배열에 들어있는 값을 String 타입으로
			String num = Integer.toString(array[i]);

			//배열에있는 원소의 크기 추출
			int length = num.length();	
			
			// 원소하나하나 추출하여 arrStr에 넣기
			String[] arrStr = num.split("",length);
		

			// 7이있으면 ++num7
			for (int j = 0; j < arrStr.length; j++) {
				if (arrStr[j].equals("7")) {
					++num7;
				}
			}

		}

		return num7;
	}

}
