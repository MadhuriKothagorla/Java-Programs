package com.madhu;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=153;
		int res=0;
		int t=n;
		int t1=n;
		
		while(t>0)
		{
			int rem=t%10;
			res=res+rem*rem*rem;
			t=t/10;
		}
		if(t1==res)
			System.out.println(t1+" is an armstrong number");
		else
			System.out.println(t1+" is not an armstrong number");

	}

}
