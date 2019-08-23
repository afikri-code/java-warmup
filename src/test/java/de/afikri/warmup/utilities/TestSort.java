package de.afikri.warmup.utilities;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestSort {
	static Generator generator;
	static Sort sort;
	@BeforeClass
	public static void setup() {
		generator = new Generator();
		sort = new Sort();		
	}
	
	@Test
	public void isArrSortedTest() {
		assertTrue(sort.isArrSorted(new int[] {1,2,3,4,5,6,7,8,9}));
	}
	
	@Test
	public void isArrSortedTest2() {
		assertFalse(sort.isArrSorted(new int[] {1,2,3,4,5,6,7,8,9,0}));
	}
	
	@Test
	public void mergeSortTest() {
		int[] arr = sort.sortMerge(generator.generateIntArr(100, 10000));
		assertTrue(sort.isArrSorted(arr));
	}
	@Test
	public void quickSortTest() {
		int[] arr = generator.generateIntArr(100, 10000);
		sort.quickSort(arr,0,arr.length-1);
		assertTrue(sort.isArrSorted(arr));
	}
}
