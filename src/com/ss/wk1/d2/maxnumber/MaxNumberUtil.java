package com.ss.wk1.d2.maxnumber;
/**
 * MaxNumber utility class to find max number and position.
 * @author Christian Angeles
 */
public class MaxNumberUtil {
	/**
	 * Display 2D array elements.
	 * Input parameter is CreateArray object.
	 * @param arrNumbers
	 */
	public void printArray(CreateArray arrNumbers) {
		for(int i = 0; i < arrNumbers.getNumRows(); ++i) {
			for(int j = 0; j < arrNumbers.getNumCols(); ++j) {
				System.out.printf("["+arrNumbers.getArray()[i][j]+"]\t");
			}
			System.out.println();
		}
	}
	/**
	 * Display the max number.
	 * Input parameter is CreateArray object.
	 * @param arrNumbers
	 */
	public void getMaxNum(CreateArray arrNumbers) {
		int maxNum = arrNumbers.getArray()[0][0];
		for(int i = 0; i < arrNumbers.getNumRows(); ++i) {
			for(int j = 0; j < arrNumbers.getNumCols(); ++j) {
				if(maxNum < arrNumbers.getArray()[i][j]) {
					maxNum = arrNumbers.getArray()[i][j];
				}
			}
		}
		System.out.println("Max number in 2D array: "+maxNum);
	}
	/**
	 * Display the position of max number.
	 * Input parameter is CreateArray object.
	 * @param arrNumbers
	 */
	public void getPosition(CreateArray arrNumbers) {
		int row = 0, col = 0;
		for(int i = 0; i < arrNumbers.getNumRows(); ++i) {
			for(int j = 0; j < arrNumbers.getNumCols(); ++j) {
				if(arrNumbers.getArray()[row][col] < arrNumbers.getArray()[i][j]) {
					row = i;
					col = j;
				}
			}
		}
		System.out.println("Position: ("+row+", "+col+")");
	}
}
