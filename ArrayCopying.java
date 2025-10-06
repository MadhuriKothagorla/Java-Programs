package com.madhu;

public class ArrayCopying {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,20,30,40,50};
		int[] b=new int[a.length];
		System.out.println("Array b");
		
		for(int i=0;i<=a.length-1;i++)
		{
			b[i]=a[i];
			
			System.out.println(b[i]);
	
		}
		
		
		
		
		

	}

}
