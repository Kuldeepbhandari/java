package AssingmentDay1;

public class HarmonicSum {
   public static void show()
   {
	   int maxDenominator=5000;
	   double sumLTR=0.0;
	   double sumRTL=0.0;
	   int Denominator=1;
	   double a=0;
	   double b=0;
	   
	   for(int i=1;i<=maxDenominator;i++)
	   {
		   sumLTR=(double)Denominator/i;
		   a=(double)a+sumLTR;
	   }
	   System.out.println("The Sum Of No Left To Right is "+a);
	   
	   for(int i=maxDenominator;i>=1;i--){
		   sumRTL=(double)Denominator/i;
		   
		   b=(double)b+sumRTL;    
		   
	   }
	   System.out.println("The Sum Of No Right To Left is "+a);
	  
   }
}
