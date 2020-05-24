/**
 * 
 */
package com.kunal.practice.hackerrank;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author kunal
 *
 */
class IPAddressPatternChecker {

	public static boolean validateIPAddressPattern(String ipAddress) {

		String zeroTo255 = "([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])";
		String ipPattern = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;

		Pattern regexPattern = Pattern.compile(ipPattern);

		Matcher matcher = regexPattern.matcher(ipAddress);
		System.out.println(matcher.lookingAt());
		System.out.println(matcher.matches());

		return matcher.matches();

	}

}
