/**
 * 
 */
package com.ss.wk1.d2.maxnumber;
import com.ss.wk1.d1.guessrng.RandomNumber;

/**
 * Creates a 2D array and generate a random number (1-100) for each element.
 * @author Christian Angeles
 */
public class CreateArray {
	private int[][] arrNumbers;
	private int row, col;
	/**
	 * Input number of rows and columns for 2D array.
	 * @param row
	 * @param col
	 */
	public CreateArray(int row, int col) {
		this.row = row;
		this.col = col;
		RandomNumber randNum = new RandomNumber();
		for(int i = 0; i < row; ++i) {
			for(int j = 0; j < col; ++j) {
				arrNumbers[i][j] = randNum.getRandNumber();
			}
		}
	}
	/**
	 * Returns 2D array with RNG elements.
	 * @return
	 */
	public int[][] getArrayNumbers() {
		return arrNumbers;
	}
	/**
	 * Returns 2D array number of rows.
	 * @return
	 */
	public int getNumRows() {
		return row;
	}
	/**
	 * Return 2D array number of columns.
	 * @return
	 */
	public int getNumCols() {
		return col;
	}
}
