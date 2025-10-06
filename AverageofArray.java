package com.madhu;

public class AverageofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int[] a= {10,13,20,22,15,17,42};
		for(int i=0;i<=a.length-1;i++)
		{
sum+=a[i];
	}
double avg=(double) sum/a.length;
System.out.println(avg);
}
}
