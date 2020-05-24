/**
 * 
 */
package com.kunal.practice.hackerrank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * @author kunal
 *
 */
class DiagonalDifferenceSolutionTest {

	DiagonalDifferenceSolution solution = new DiagonalDifferenceSolution();

	/**
	 * Test method for
	 * {@link com.kunal.practice.hackerrank.SimpleArraySumSolution#simpleArraySum(int[])}.
	 */
	@Test
	void testDiagonalDifference() {
		// int[][] arrNum = new int[][] { {11, 2 ,4}, {4 ,5,6 },{10,8,-12}};

		List<Integer> row0 = new ArrayList<Integer>();
		row0.add(11);
		row0.add(2);
		row0.add(4);
		List<Integer> row1 = new ArrayList<Integer>();
		row1.add(4);
		row1.add(5);
		row1.add(6);
		List<Integer> row2 = new ArrayList<Integer>();
		row2.add(10);
		row2.add(8);
		row2.add(-12);

		List<List<Integer>> listofNumbers = new ArrayList<List<Integer>>();
		listofNumbers.add(row0);
		listofNumbers.add(row1);
		listofNumbers.add(row2);

		assertEquals(15, solution.diagonalDifference(listofNumbers));
	}

}
