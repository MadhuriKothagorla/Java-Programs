package com.madhu;
import java.util.*;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter a  number");
		int num=s.nextInt();
		boolean isprime=true;
		if(num<=1) {
			System.out.println(" it is not a prime number");
		return;
		}
		
			for(int i=2;i<=num;i++)
			{
				if(num%i==0)
				isprime=false;
				break;
				
			}
		if(isprime)
			System.out.println(num+" is a prime number");
		else
			System.out.println(num+" is not a prime number");

	}

}
