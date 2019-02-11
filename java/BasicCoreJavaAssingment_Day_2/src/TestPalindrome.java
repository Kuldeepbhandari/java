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
	 //using string method
	/* String str="";
	 for(int i=strLen-1;i>=0;i--)
	 {
		 str=str+inputSt.charAt(i);
	 }
	 if(inputSt.equals(str))
	 {
		 System.out.println("String is Paildrome");
	 }
	 else
	 {
		 System.out.println("No");
	 }
	 System.out.println("The Value of String Reverse is "+str);
	 */
	 
	 
	// ****************** using string buffer method ****************
	 StringBuilder rev=new StringBuilder();
	 for(int i=strLen-1;i>=0;i--){
		 rev.append(inputSt.charAt(i)); 
	 }
	 if(inputSt.contentEquals(rev)){
		 System.out.println("String is palindrome " );
	 }
	 else{
		 System.out.println("String is not palindrome");
	 }
	 System.out.println("The Reverse String is "+rev);
 }
}
