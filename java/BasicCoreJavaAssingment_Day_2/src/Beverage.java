import java.util.Scanner;


public class Beverage {

	public static void show()
	{
		int volume;
		int radius;
		double cost;
		double height;
		
		Scanner s=new Scanner(System.in);
	int num=1;
		
		System.out.println("Enter The Volume");
		volume=s.nextInt();
		System.out.println("Enter The Radius");
		radius=s.nextInt();
		while(num<2)
		{
			System.out.println(height=volume/(3.14*radius*radius));
			System.out.println(cost=(2*3.14*radius)/(radius+height));
			num++;
		}
		
		
		
	}
}
