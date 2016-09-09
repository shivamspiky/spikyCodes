package com.dp.uglynumbers;

public class UglyNumbers {
	
	public int uglyNumber(int n){
		int[] uglyNumbers = new int[n+1];
		uglyNumbers[0] = 1;
		int i2=0;
		int i3=0;
		int i5=0;
		int next_multiple_of_2 = uglyNumbers[i2]*2;
		int next_multiple_of_3 = uglyNumbers[i3]*3;
		int next_multiple_of_5 = uglyNumbers[i5]*5;
		for(int i = 1; i< n+1 ;i++){
			
			uglyNumbers[i] = Math.min(next_multiple_of_2, next_multiple_of_3);
			uglyNumbers[i] = Math.min(uglyNumbers[i], next_multiple_of_5);
			
			if(uglyNumbers[i] == next_multiple_of_2){
				i2++;
				next_multiple_of_2= uglyNumbers[i2]*2;
			}
			if(uglyNumbers[i] == next_multiple_of_3){
				i3++;
				next_multiple_of_3= uglyNumbers[i3]*3;
			}
			if(uglyNumbers[i] == next_multiple_of_5){
				i5++;
				next_multiple_of_5= uglyNumbers[i5]*5;
			}
			
		}
		
		return uglyNumbers[n];
	}
	
	public static void main(String agrs[]){
		
		UglyNumbers uglyNumbers = new UglyNumbers();
		int result = uglyNumbers.uglyNumber(150);
		System.out.println(result);
	}

}
