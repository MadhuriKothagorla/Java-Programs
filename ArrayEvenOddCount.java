package com.madhu;

public class ArrayEvenOddCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int evencount=0;
		int oddcount=0;
		int[]a= {10,11,12,16,18,20};
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2==0)
			{
				evencount++;
			}
			else {
				oddcount++;
			}
		}
		System.out.println("evencount="+evencount);
		System.out.println("oddcount="+oddcount);

	}

}
