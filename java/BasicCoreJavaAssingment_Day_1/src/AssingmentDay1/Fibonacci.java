package AssingmentDay1;

import java.util.Scanner;

public class Fibonacci {
public static void fac()
{
	
	int num=20;
	int n1=0;
	int n2=1;
	int sum=0;
	
	for(int i=2;i<num;i++)
	{  
		sum=n1+n2;
		n1=n2;
		n2=sum;
		System.out.println("Fibonacci series from " +n2+ "   are "+sum);
	}
	
	
	
	
}
}
