/**
 * 
 */
package com.ss.wk1.project;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Christian Angeles
 */
public class Recursion {
	/**
	 * Given an array of ints, is it possible to choose a group of some of the ints, such that the group sums to the given target, 
	 * <p>with this additional constraint: if there are numbers in the array that are adjacent and the identical value, 
	 * <p>they must either all be chosen, or none of them chosen. 
	 * @param index
	 * @param arr
	 * @param target
	 * @return
	 */
	public Boolean groupSumClump(Integer index, Integer[] arr, Integer target) {
		if(arr==null) {
			return false;
		}
		List<Integer> tempList = new ArrayList<>();
		Integer[] tempArr1 = arr;
		Integer[] tempArr2 = arr;
		Integer tempTarget = target;
		Integer arrNum = 0;
		Integer count = 1;
		
		if(index == 0) {
			for(int i = 0; i < arr.length-1; ++i) {
				if(arr[i]==arr[i+1]) {
					arrNum = arr[i];
					count += 1;
				}
			}

			if(count > 1) {
				for(int i = 0; i < arr.length; ++i) {
					if(arr[i] != arrNum) {
						tempList.add(arr[i]);
					}
				}
				tempArr1 = new Integer[tempList.size()];
				tempArr1 = tempList.toArray(tempArr1);
				
				tempList.add(arrNum*count);
				tempArr2 = new Integer[tempList.size()];
				tempArr2 = tempList.toArray(tempArr2);
			}
		}
		
		if(index < tempArr1.length) {
			if(groupSumClump(index+1, tempArr1, tempTarget-tempArr1[index])) {
				return true;
			}
			if(groupSumClump(index+1, tempArr1, tempTarget)) {
				return true;
			}
		}
		if(index < tempArr2.length) {
			if(groupSumClump(index+1, tempArr2, tempTarget-tempArr2[index])) {
				return true;
			}
			if(groupSumClump(index+1, tempArr2, tempTarget)) {
				return true;
			}
		}

		if(tempTarget == 0) {
			return true;
		}
		return false;
	}
}
