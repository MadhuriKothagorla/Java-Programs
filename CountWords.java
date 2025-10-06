package com.madhu;

public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="madhuri kothagorla";
		int count=1;
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			if (ch==' ')
			{
				count++;
			}
		}
		System.out.println(count);

	}
}
