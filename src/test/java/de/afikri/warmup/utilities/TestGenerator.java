package de.afikri.warmup.utilities;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestGenerator {
	static Generator generator;
	@BeforeClass
	public static void setup() {
		generator = new Generator();
		
	}
	
	@Test
	public void isArrDistinctTest(){
		assertFalse(generator.isArrDistinct(new int[]{1,2,3,4,5,6,7,8,9,1}));
	}
	
	@Test
	public void generateIntArrDistinctValsTest(){
		int dim = 10;
		int bound = 100;
		assertTrue(generator.isArrDistinct(generator.generateIntArrDistinctVals(dim, bound)));
	}
	
	@Test
	public void countDistinctValsTest1() {
		int arrDim = 100;
		int maxVal = 10000;
		assertTrue(generator.countDistinctVals(generator.generateIntArrDistinctVals(arrDim, maxVal))==arrDim);
	}
	
	@Test
	public void countDistinctValsTest2() {
		assertTrue(generator.countDistinctVals(new int[]{1,2,3,4,5,6,7,8,9,1})==9);
	}
}
