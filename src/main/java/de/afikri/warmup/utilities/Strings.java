package de.afikri.warmup.utilities;

/**
 * @author afikri
 *
 */
public class Strings {
	/**
	 * @param s1
	 * @param s2
	 * @return
	 */
	public String findLongestCommonSequence(String s1, String s2) {
		String longStr;
		String shortStr;
		String tmp = null;
		if(s1.length() > s2.length()) {
			longStr = s1;
			shortStr = s2;
		}else {
			longStr = s2;
			shortStr = s1;
		}
		
		int length = shortStr.length();
		
		for(int i=length;i>0;i--) {
			int begin = 0;
			while(begin+i<=length) {
			   tmp = shortStr.substring(begin, i+begin++);
			   if(longStr.contains(tmp)) {
				   System.out.println(tmp);
				   return tmp;
			   }
			}
		}
		
		
		return null;
	}
	
	/**
	 * @param word
	 * @return
	 */
	public String findLongestPalindrome(String word) {
		int length = word.length();
		int j ;
		for(int l=length;l>0;l--) {
			j=0;
			while(j+l<=length) {
				char[] a = word.substring(j, j+l).toCharArray();
				int i=a.length/2+1;
				
				while(i-->0 && a[i]==a[a.length - 1-i]);
				if(i==-1) {
					return new String(a);
				}
				
				j++;
			}
			
		}
		return "";
	}
}
