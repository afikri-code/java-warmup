package de.afikri.warmup.utilities;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestStrings {
	static Strings strings;
	@BeforeClass
	public static void setup() {
		strings = new Strings();
	}
	@Test
	public void findLongestCommonSequence1(){
		assertTrue(strings.findLongestCommonSequence("abattd", "gdgeaba").equals("aba"));
		
	}
	@Test
	public void findLongestCommonSequence2(){
		assertTrue(strings.findLongestCommonSequence("abc", "sdsad").equals("a"));
		
	}
	@Test
	public void findLongestCommonSequence3(){
		assertTrue(strings.findLongestCommonSequence("abcba", "abcba").equals("abcba"));
		
	}
	@Test
	public void findLongestCommonSequence4(){
		assertTrue(strings.findLongestCommonSequence("thhwerwaaa", "aaa").equals("aaa"));
		
	}
	
	@Test
	public void findLongestCommonSequence5(){
		assertTrue(strings.findLongestCommonSequence("Hallo AhmedouDilhiWelt", "OAhmedouDilhiSk Hallo Welt").equals("AhmedouDilhi"));
		
	}
	
	@Test
	public void findLongestPalindromeTest1() {
		assertTrue(strings.findLongestPalindrome("abattd").equals("aba"));		
	}
	
	@Test
	public void findLongestPalindromeTest2() {
		assertTrue(strings.findLongestPalindrome("abc").equals("a"));		
	}
	
	@Test
	public void findLongestPalindromeTest3() {
		assertTrue(strings.findLongestPalindrome("abcba").equals("abcba"));		
	}
	
	@Test
	public void findLongestPalindromeTest4() {
		assertTrue(strings.findLongestPalindrome("thhwerw").equals("hh"));		
	}
	
	
}
