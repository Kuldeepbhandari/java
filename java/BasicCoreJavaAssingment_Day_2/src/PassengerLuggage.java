import java.util.Scanner;


public class PassengerLuggage {
public static void show()
{
	double length;
	double width;
	double height;
	double linearDimensions=0 ;
	double weight;
	double mwcol=7;   //weight carry on luggage
	double mwol=20;
	double checkedLuggage=20;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the length in cm");
	length=s.nextDouble();
	System.out.println("Enter the width in cm");
	width=s.nextDouble();
	System.out.println("Enter the Height in cm");
	height=s.nextDouble();
	System.out.println("Enter the Weight in kg");
	weight=s.nextDouble();
	linearDimensions=(length+height+width);
	if(linearDimensions<=115&&checkedLuggage<=20&&weight<=8&&mwol<=20)
	{
		System.out.println("Checked bag acceptable");
	}
	
	else{
		System.out.println("Carry on too heavy");
	}
	

}
}
