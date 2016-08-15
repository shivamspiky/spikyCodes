package com.searching.firstrepeatingelement;

import java.util.HashMap;

public class FirstRepeatingElement {

	public int firstRepeating(int[] arr) {

		int i;
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		for (i = 0; i < arr.length; i++) {

			modifiedHashConstruction(hashMap, arr[i], i + 1);

		}

		// Iterator it = hashMap.entrySet().iterator();
		//
		// while (it.hasNext()) {
		//
		// Map.Entry<Integer, Integer> pair = (Map.Entry<Integer, Integer>) it
		// .next();
		//
		// // System.out.println(pair.getKey() + " " + pair.getValue());
		//
		// }

		return processingHash(hashMap, arr);
	}

	private void modifiedHashConstruction(HashMap<Integer, Integer> hashMap,
			int k, int i) {

		if (hashMap.containsKey(k)) {
			if (hashMap.get(k) < 0)
				return;
			else {
				i = hashMap.get(k);
				i *= -1;
				hashMap.put(k, i);
			}

		} else {
			hashMap.put(k, i);
		}

	}

	private int processingHash(HashMap<Integer, Integer> hashMap, int[] arr) {
		int max = Integer.MIN_VALUE;
		for (Integer value : hashMap.values()) {

			// System.out.println(value);
			if (value < 0 && value > max) {
				max = value;
			}
		}

		if (max != Integer.MIN_VALUE) {
			max *= -1;
			return arr[max - 1];
		} else {
			return -1;
		}
	}

}
