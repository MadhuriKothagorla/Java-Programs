package com.madhu;

public class EvenOddBig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int evenbig=0;
		int oddbig=0;
		int[] a= {10,50,21,77,12,53};
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2==0 && evenbig<a[i])
				evenbig=a[i];
			else if(a[i]%2!=0 && oddbig<a[i])
				oddbig=a[i];
		}
		System.out.println(evenbig);
		System.out.println(oddbig);

	}

}
