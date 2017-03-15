package com.dp.uglynumbers;

public class UglyNumbers {
	
	public int uglyNumber(int n){
		int[] uglyNumbers = new int[n];
		uglyNumbers[0] = 1;
		int i2=0;
		int i3=0;
		int i5=0;
//		int next_multiple_of_2 = uglyNumbers[i2]*2;
//		int next_multiple_of_3 = uglyNumbers[i3]*3;
//		int next_multiple_of_5 = uglyNumbers[i5]*5;
		for(int i = 1; i< n ;i++){
			
			uglyNumbers[i] = Math.min(2*uglyNumbers[i2], 3*uglyNumbers[i3]);
			uglyNumbers[i] = Math.min(uglyNumbers[i], 5*uglyNumbers[i5]);
			
			if(uglyNumbers[i] == 2*uglyNumbers[i2]){
				i2++;
				
			}
			if(uglyNumbers[i] == 3*uglyNumbers[i3]){
				i3++;
				
			}
			if(uglyNumbers[i] == 5*uglyNumbers[i5]){
				i5++;
			}
			
		}
		return uglyNumbers[n-1];
	}
	
	public static void main(String agrs[]){
		
		UglyNumbers uglyNumbers = new UglyNumbers();
		int result = uglyNumbers.uglyNumber(11);
		System.out.println(result);
	}

}
