package com.madhu;

public class ArrayBig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {10,20,11,21,13};
		int big=a[0];
		for(int i=1;i<=a.length-1;i++)
		{
			if(a[i]>big)
			{
				big=a[i];
			}
		}
		System.out.println(big);

	}

}
