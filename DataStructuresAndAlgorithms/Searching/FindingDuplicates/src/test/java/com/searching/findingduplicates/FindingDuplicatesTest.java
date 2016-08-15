package com.searching.findingduplicates;

import org.junit.Test;

public class FindingDuplicatesTest {

	@Test
	public void findDuplicateEntryTest() {

		FindingDuplicates findingDuplicates = new FindingDuplicates();
		int[] arr = { 1, 3, 5,4,6, 2, 6 };
		int duplicate = findingDuplicates.findDuplicateEntry(arr);

		System.out.println(duplicate);
	}

}
