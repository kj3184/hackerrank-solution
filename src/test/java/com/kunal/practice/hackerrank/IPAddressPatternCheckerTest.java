/**
 * 
 */
package com.kunal.practice.hackerrank;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * @author kunal
 *
 */
class IPAddressPatternCheckerTest {

	@Test
	void testValidateIPAddressPattern() {

		assertTrue(IPAddressPatternChecker.validateIPAddressPattern("000.12.12.034"));
		assertTrue(IPAddressPatternChecker.validateIPAddressPattern("121.234.12.12"));
		assertTrue(IPAddressPatternChecker.validateIPAddressPattern("23.45.12.56"));
		assertFalse(IPAddressPatternChecker.validateIPAddressPattern("00.12.123.123123.123"));
		assertFalse(IPAddressPatternChecker.validateIPAddressPattern("122.23"));
		assertFalse(IPAddressPatternChecker.validateIPAddressPattern("Hello.IP"));

	}

}
