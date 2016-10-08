package com.dp.catalannumber;

/*
 * 
 * Suppose the nodes are labelled 1 to n and for any ith node the number of
 * binary search tree possible will be product of Ci-1 (the number of possible
 * left subtree) and Cn-i(possible number of right subtree) and because i varies
 * from i to n, it will sum of Ci-1*Cn-i where i varies from i= 1 to i = n*/
public class CatalanNumber {
	public int catalanNumber(int n) {

		if (n == 0) {
			return 1;
		}
		int[] catalanNumbers = new int[n + 1];
		catalanNumbers[0] = 1;
		for (int i = 1; i <= n; i++) {
			catalanNumbers[i] = 0;
			for (int j = 1; j <= i; j++) {
				catalanNumbers[i] += catalanNumbers[i - j]
						* catalanNumbers[j - 1];
			}
		}
		return catalanNumbers[n];
	}

	public static void main(String[] args) {
		CatalanNumber catalanNumber = new CatalanNumber();
		System.out.println(catalanNumber.catalanNumber(4));
	}
}
