/**
 * 
 */
package com.kunal.practice.hackerrank;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author kunal
 *
 */
class SimpleArraySumSolutionTest {
	
	SimpleArraySumSolution simpleArray=new SimpleArraySumSolution();

	/**
	 * Test method for {@link com.kunal.practice.hackerrank.SimpleArraySumSolution#simpleArraySum(int[])}.
	 */
	@Test
	void testSimpleArraySum() {
		int[] arrNum = new int[] { 1, 2, 3 };
		assertEquals(6, simpleArray.simpleArraySum(arrNum));
	}

}
