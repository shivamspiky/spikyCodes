package com.dp.editdistance;

public class EditDistance {

	public int recursiveEditDistance(String str1, int m ,String str2, int n) {
		if(m==0) {
			return n;
		}
		if(n==0) {
			return m;
		}
		
		if(str1.charAt(m-1)==str2.charAt(n-1)) {
			return recursiveEditDistance(str1,m-1,str2,n-1);
		}
		else {
			return 1 + min(recursiveEditDistance(str1,m-1,str2,n),recursiveEditDistance(str1,m,str2,n-1),
					recursiveEditDistance(str1,m-1,str2,n-1));
		}
	}
	
	public int editDistance(String str1, String str2) {
		
		int m = str1.length();
		int n = str2.length();
		int[][] distance = new int[m+1][n+1];
		
		for(int i=0;i<=m;i++) {
			for(int j=0;j<=n;j++) {
				if(i==0) {
					distance[i][j]=j;
				}
				else if(j==0) {
					distance[i][j]=i;
				}
				
				else if(str1.charAt(i-1)==str2.charAt(j-1)) {
					distance[i][j]=distance[i-1][j-1];
				} 
				else {
					distance[i][j]=1 + min(distance[i-1][j],distance[i][j-1],distance[i-1][j-1]);
				}
			}
		}
		
		return distance[m][n];
	}
	
	private int min(int a,int b,int c) {
		int min = a;
		if(b<min) {
			min=b;
		}
		if(c < min) {
			min =c ;
		}
		
		return min;
	}
	
	public static void main(String[] args) {
		
		String str1 = "sunday";
		String str2 = "saturday";
		EditDistance editDistance = new EditDistance();
		
		System.out.println(editDistance.editDistance(str1, str2));
	}
	
}
