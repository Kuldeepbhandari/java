import java.util.Scanner;


public class TestPalindrome {
 public static void show()
 {
	 String inputSt;     //input String
	 int strLen;   
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter a String Value");
	 inputSt=s.nextLine();
	 strLen=inputSt.length();
	 String str="";
	 /*StringBuilder  cons=new StringBuilder();
	 StringBuilder vowel=new StringBuilder();
	 StringBuilder str=new StringBuilder();*/
	 for(int i=strLen-1;i>=0;i--)
	 {
		 str=str+inputSt.charAt(i);
	 }
	 if(str==inputSt)
	 {
		 System.out.println("String is Paildrome");
	 }
	 else
	 {
		 System.out.println("No");
	 }
	 System.out.println("The Value of String Reverse is "+str);
	 
	
 }
}
