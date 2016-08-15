package com.recursion.hanoi;

import org.junit.Test;

import com.recursion.towerofhanoi.TowerOfHanoi;

public class TowerOfHanoiTest {

	@Test
	public void towerOfHanoitest() {
		TowerOfHanoi  towerOfHanoi = new TowerOfHanoi();
		towerOfHanoi.towerOfHanoi(10,"1","3","2");
	}

}
