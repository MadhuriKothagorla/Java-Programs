package com.madhu;

public class CountLetterWithoutMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java programming";
		s.toLowerCase();
		int [] count=new int[26];
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='a' && ch<='z')
			{
				count[ch -'a']++;
			}
		}
		for(int i=0;i<26;i++)
		{
			if(count[i]>0)
			{
				System.out.println((char)(i+'a')+":"+count[i]);
			}
		}

	}

}
