package AssingmentDay1;

import java.util.Scanner;

public class TimeTable {
public static void show()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter a Value");
int num=s.nextInt();
	int t=0;
	for(int a=0;a<=num;a++)
	{if(a==0)
		System.out.print("\t " +"*");
	else
		System.out.print("\t"+a);
	}
	System.out.println("");
	for(int i=1;i<=num;i++)
	{
		System.out.print("\t"+"- - - -");
	}
	System.out.println("");
	for(int i=1;i<=num;i++)
	{	
		System.out.print("\t"+i);
	    System.out.print(" |");
		for(int j=1;j<=num;j++)
		{
			t=i*j;
			System.out.print("\t"+t);
		}
		System.out.println(" ");
	}
}

}
