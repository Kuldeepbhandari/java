package AssingmentDay1;

import java.util.Scanner;

public class CheckGrade {
     public static void display()
     {
    	 Scanner s=new Scanner(System.in);
    	 System.out.println("Enter The Vaule Between One To Hundred");
    	 int score=s.nextInt();
    	 if(81<=score &&score<=100){
    		 System.out.println("Grade A");
    	 }
    	 else if(71<=score&&score<=80){
    		 System.out.println("Grade B");
    	 }
    	 else if(61<=score&&score<=70){
    		 System.out.println("Grade C");
    	 }
    	 else
    	 {
    		 System.out.println("Enter value again 61 to 100");
    	 }
    	 
     }
}
