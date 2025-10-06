package com.madhu;

public class ArrayReverseCopying {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,20,30,40,50};
		int[] b=new int[a.length];
		for(int i=a.length-1;i>=0;i--)
		{
			b[i]=a[i];
			System.out.println(b[i]);
			
		}
		
	}

}
