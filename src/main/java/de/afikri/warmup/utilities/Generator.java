package de.afikri.warmup.utilities;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * @author afikri
 *
 */
public class Generator {
	/**
	 * @param dim
	 * @param bound
	 * @return
	 */
	public int[] generateIntArr(int dim, int bound) {
		int[] arr = new int[dim];
		Random random = new Random();
		for(int i=0;i<dim;i++) {
			arr[i] = random.nextInt(bound);
		}
		return arr;		
	}
	
	/**
	 * @param dim
	 * @param bound
	 * @return
	 */
	public int[] generateIntArrDistinctVals(int dim, int bound) {
		int[] arr = new int[dim];
		int tmpArrSize = 100*dim;
		int currentSize = 0;
		int tmp,tmpMod;
		int[] tmpArr = new int[tmpArrSize];
		Random random = new Random();
		while(currentSize<dim) {
		  tmp = random.nextInt(bound);
		  tmpMod = tmp%tmpArrSize;
		  if(tmpArr[tmpMod]!=tmpMod) {
			  tmpArr[tmpMod] = tmpMod;
			  arr[currentSize++]=tmp;
		  }
		}
		
		return arr;
	}
	
	/**
	 * @param arr
	 * @return
	 */
	public boolean isArrDistinct(int[] arr) {
		Set<Integer> tmpSet = new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			if(!tmpSet.add(arr[i]))
				return false;
		}
		return true;
		
	}
	
	/**
	 * @param arr
	 * @return
	 */
	public int countDistinctVals(int[] arr) {
		int count = 0;
		Set<Integer> tmpSet = new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			if(!tmpSet.add(arr[i]))
				count++;
		}
		
		return arr.length - count;
		
	}
}
