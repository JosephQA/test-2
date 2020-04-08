package Excersises;

public class CheckString {
	private static String chk = "This is my check";
	
	/**
	 * checks if input matches hardcoded String chk
	 * @param str any valid string
	 * @return boolean value of check
	 */
	boolean matches(String str) {
		return(str == chk);
	}
	/**
	 * checks to see if input strings are equal
	 * @param str1 any valid string
	 * @param str2 any valid string
	 * @return boolean value of check
	 */
	boolean matches(String str1, String str2) {
		return(str1 == str2);
	}

}
