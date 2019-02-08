class ArraySortExample
{
     static int [] arraySort(int userID[],int choice)
	 {
	 int temp;
	 if(choice==1)
	 {
	 
	 for(int index=0;index<=userID.length-1;index++) //this code is use to sort array 
	{
		for(int inner=0;inner<=userID.length-1;inner++)
		{
			if(userID[index]<userID[inner])
			{
			temp=userID[inner];
			userID[inner]=userID[index];
			userID[index]=temp;
			}
		}
	}
	return userID;
	 }
	 else
	 {
	 for(int index=0;index<=userID.length-1;index++) //this code is use to sort array 
	{
		for(int inner=0;inner<=userID.length-1;inner++)
		{
			if(userID[index]>userID[inner])
			{
			temp=userID[inner];
			userID[inner]=userID[index];
			userID[index]=temp;
			}
		}
	}
	return userID;
	 }
	 //return userID;
	 }
	 public static void main(String str[])
	 {
	 int userID[]={2,34,54,7,62,22,13,17,2,10,26,34,1,45};
	 int choice=2;
	 int holdSortedID[]=ArraySortExample.arraySort(userID,choice);
	 System.out.println("Array elements has been sorted");
	 for(int index=0;index<holdSortedID.length;index++)
	 {
	 System.out.print(holdSortedID[index]+" , ");
	 }
	 }
	 }