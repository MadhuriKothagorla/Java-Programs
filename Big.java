package com.madhu;

public class Big {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {5,6,75,8,9,2,3,50,43,10};
		int biggest=a[0];
		for(int i=1;i<=a.length-1;i++)
		{
			if(a[i]>biggest)
			{
			biggest=a[i];
			
			}
			
		}
		System.out.println("Biggest element in the array:"+biggest);

	}

}
