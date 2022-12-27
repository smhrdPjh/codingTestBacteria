package codingtest;

import java.util.ArrayList;

public class 박테리아증식 {

	public static void main(String[] args) {
	
		
	int result = bacteria(2,10);
	
		System.out.println(result);	 	 	 		
		

	}
	//
	public static int bacteria(int num, int time) {	
		
			
		for(int i =1; i<=time;i++) {			
			num=num*2;						
		}		
				
		return num;
	}

}
