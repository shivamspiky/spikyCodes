package com.dp.longestnonrepeatingsubstring;

public class LongestNonRepeatingSubstring {

	public int longestNonRepeating(String str) {
		
		int[] visited = new int[256];
		
		for(int i=0;i<256;i++) {
			visited[i] = -1;
		}
		visited[str.charAt(0)]=0;
		int max =1;
		int max_index = 0;
		int current_max=1;
		int n = str.length();
		for(int i=1;i<n;i++) {
			
			if(visited[str.charAt(i)]==-1 || visited[str.charAt(i)] <i-current_max) {
				current_max++;
				if(current_max>max) {
					max = current_max;
					max_index = i;
				}
			} else {
				current_max = current_max -visited[str.charAt(i)];
			}
			visited[str.charAt(i)]=i;
		}
		System.out.println(str.substring(max_index-max+1,max+1));
		return max;
	}
	
	public static void main(String[] args) {
		LongestNonRepeatingSubstring longestNonRepeatingSubstring = new LongestNonRepeatingSubstring();
		System.out.println(longestNonRepeatingSubstring.longestNonRepeating("ABDEFGABEF"));
	}
}
