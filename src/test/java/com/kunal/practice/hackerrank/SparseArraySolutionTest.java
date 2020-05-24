/**
 * 
 */
package com.kunal.practice.hackerrank;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * This is test case for SparseArraySolution class
 * 
 * @author kunal
 *
 */
class SparseArraySolutionTest {
 
	SparseArraySolution solution =new SparseArraySolution();
	
	@Test
	void testMatchingStrings() {
		
		String[] strings= new String[] {"def","de","fgh"};
		String[] queries= new String[] {"de","lmn","fgh"};
		
		int[] output= new int[] {1,0,1};
		assertArrayEquals(output, solution.matchingStrings(strings, queries));
		
	}

}
