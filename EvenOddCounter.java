package com.madhu;

public class EvenOddCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,22,21,34,33,45,66};
		int evencount=0;
		int oddcount=0;
		for(int num:a)
		{
			if(num%2==0)
			{
				evencount++;
			}
			else {
				oddcount++;
			}
		}
		System.out.println("Total even numbers:"+evencount);
		System.out.println("Total odd numbers:"+oddcount);

	}

}
