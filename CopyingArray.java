package com.madhu;

public class CopyingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,50,21,77,12,53};
		int[] b=new int[a.length];
		int[] c=new int[a.length];
		int j=0,k=0;
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2==0)
			{
				b[j++]=a[i];
			
			}
			else 
			{
				c[k++]=a[i];
			}
		}
		System.out.println("Array b");
		for(int i=0;i<j;i++)
		{
		System.out.println(b[i]);
		}
		System.out.println("Array c");
		for(int i=0;i<k;i++)
		{
		System.out.println(c[i]);
		}
	}
}



