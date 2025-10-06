package com.madhu;

public class ArrayEvenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int evensum=0;
		int[] a= {10,13,12,17,18};
		for(int i=0;i<=a.length-1;i++)
		{
		if(a[i]%2==0)
		{
			evensum+=a[i];
			
		}
		}
		
		System.out.println(evensum);
		

	}

}
