package com.madhu;

public class CopyingofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5};
		int[] b=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		System.out.println("Copiedarray: ");
		for(int num:b)
		{
			System.out.print(num+" ");
		}

	}

}
