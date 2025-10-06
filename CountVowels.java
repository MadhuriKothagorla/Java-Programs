package com.madhu;

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="MY nAme Is MadhURi ";
		int count=0;
for(int i=0;i<s1.length();i++)
{
	char ch=s1.charAt(i);
	if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'|| ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
	{
		count++;
	}
}
System.out.println(count);
	}

}
