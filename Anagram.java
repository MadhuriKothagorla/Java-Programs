/**
 * 
 */
package com.madhu;

/**
 * 
 */
public class Anagram {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="mom";
		String s2="mam";
		if(s1.length() != s2.length())
		{
			System.out.println(s1+ " and " +s2+ " are not anagrams");
			return ;
			
		}
		int[] count1=new int[26];
		int[] count2=new int[26];
		for(int i=0;i<s1.length();i++)
		{
			char ch1=s1.charAt(i);
			char ch2=s2.charAt(i);
		
		if(ch1 >='a' && ch1 <='z')
		{
			count1[ch1 -'a']++;
		}
		if(ch2 >='a' && ch2<='z')
		{
			count2[ch2 - 'a']++;
		}
		}
		boolean isanagram=true;
		 for (int i = 0; i < 26; i++) {
	            if (count1[i] != count2[i]) {
	                isanagram=false;
	                break;
	            }
	        }
		 if(isanagram)
		 {
			 System.out.println(s1+ " and " +s2 +" are anagrams");
		 }
		 else {
			 System.out.println(s1+ " and " +s2 +" are not anagrams");
		 }

	}

}
