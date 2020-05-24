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
class AVeryBigSumSolutionTest {
	
	AVeryBigSumSolution solution=new AVeryBigSumSolution();

	/**
	 * Test method for {@link com.kunal.practice.hackerrank.SimpleArraySumSolution#simpleArraySum(int[])}.
	 */
	@Test
	void testAveryBigSum() {
		long[] arrNum = new long[] { 1000000001, 1000000002 ,1000000003, 1000000004 ,1000000005};
		assertEquals(5000000015L, solution.aVeryBigSum(arrNum));
	}

}
