package de.afikri.warmup.utilities;

/**
 * @author afikri
 *
 */
public class Sort {
	/**
	 * @param left
	 * @param right
	 * @return
	 */
	int[] mergeArr(int[] left, int[] right) {
		int[] arr = new int[left.length+right.length];
		int currentSize =0;
		int j=0;
		for(int i=0;i<left.length;i++) {
			while(j<right.length && right[j]<left[i]) {
				arr[currentSize++] = right[j++];
			}
			arr[currentSize++] = left[i];
		}
		for(int i=j;i<right.length;i++) {
			arr[currentSize++]=right[i];
		}
		
		return arr;
	}
	
	/**
	 * @param arr
	 * @return
	 */
	public int[] sortMerge(int[] arr) {
		if(arr.length == 1) {
			return arr;
		}
		int[] left = new int[arr.length/2];
		int[] right = new int[arr.length - left.length];
		for(int i=0;i<left.length;i++) {
			left[i] = arr[i];
		}
		for(int i=0;i<right.length;i++) {
			right[i] = arr[i+left.length];
		}
		left = sortMerge(left);
		right = sortMerge(right);
		return mergeArr(left,right);
	}
	
	/**
	 * @param arr
	 * @param begin
	 * @param end
	 * @return
	 */
	int partitionForQuickSort(int[] arr,int begin, int end) {
		int pi = arr[(begin+end)/2];
		int i=begin-1;
		int j=end+1;
		int tmp;
		while(true) {
			do {
				i++;
			}while(arr[i]<pi);
			do {
				j--;
			}while(arr[j]> pi);

			if(i<j) {
				tmp = arr[i];
				arr[i]=arr[j];
				arr[j]=tmp;
			}else {
				return j;
			}
		}

	}
	
	public void quickSort(int[] arr, int begin,int end) {
		if(begin<end) {
			int q = partitionForQuickSort(arr,begin,end);
			quickSort(arr,begin,q);
			quickSort(arr,q+1,end);
		}
		
	}
	
	/**
	 * @param arr
	 * @return
	 */
	public boolean isArrSorted(int[] arr) {
		for(int i = 1;i< arr.length;i++) {
			if(arr[i]<arr[i-1])
				return false;
		}
		return true;
	}

}
