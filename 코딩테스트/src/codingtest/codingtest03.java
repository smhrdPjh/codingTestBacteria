package codingtest;

public class codingtest03 {

	public static void main(String[] args) {
		
		
		int hp = 999;
		int num = ant(hp);
		System.out.println(num);
		

	}
	
	public static int ant(int hp) {
		//5,3,1
		int boss = 5;
		int middle = 3;
		int small =1;
		int bossNum = hp/boss;
		int middleNum = (hp%boss)/middle;
		int smallNum = ((hp%boss)%middle)/small;
		
	
					
			int result = bossNum+middleNum+smallNum;
	
		
		return result;
	}

}
