import java.util.Scanner;


public class ReverseString {
 public static void rev()
 {
	
	 
	 String inputSt;     //input String
	 
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter a String Value");
	 inputSt=s.nextLine();
	 int strLen=inputSt.length();
	 /*String str="";
	
	 for(int i=strLen-1;i>=0;i--)
	 {
		 str=str+inputSt.charAt(i);
	
	 }
	 */
	 StringBuilder rev=new StringBuilder();
	 for(int i=strLen-1;i>=0;i--)
	 {
		 rev.append(inputSt.charAt(i));
	 }
	 System.out.println(rev);
	
 }
}
