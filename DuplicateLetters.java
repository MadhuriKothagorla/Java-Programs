package com.madhu;

public class DuplicateLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="madhuri kothagorla";
		s.toLowerCase();
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='a' && ch<='z')
			{
				if(s.indexOf(ch)!=s.lastIndexOf(ch))
				{
					if(i==s.indexOf(ch))
					{
						System.out.print(ch+" ");
					}
				}
			}
		}

	}

}
