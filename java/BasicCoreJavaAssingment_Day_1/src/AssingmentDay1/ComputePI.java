package AssingmentDay1;

public class ComputePI {
public static void show()
{
	double sum=0.0;
	double sum1=0.0;
	int maxDenom=100000;
	int num=1;
	for(int i=1;i<maxDenom;i=i+2)
	{
		if(i%4==1)
		{    num=num/i;
			sum=(double)sum+num;
		}
		else if(i%4==3)
		{
			sum1=(double)sum-i;
			
		}
		else
		{
			System.out.println("byeee");
		}
		
	}
	System.out.println(4*sum);
	System.out.println(sum1);
}
}
