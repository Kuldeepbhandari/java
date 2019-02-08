
 class ArraySearchExample {
	static int  searchElements(int userID[],int key)
	{
		int mid=0,high,low,index,temp;
		high=userID.length-1;
		low=0; // it store 
	for(index=0;index<=high;index++) //this code is use to sort array 
	{
		for(int inner=0;inner<=high;inner++)
		{
			if(userID[index]<userID[inner])
			{
			temp=userID[inner];
			userID[inner]=userID[index];
			userID[index]=temp;
			}
		}
	}
	
		while(high>=low) // this code is use to find key
		{
		
			mid=(low+high)/2;
			if(key<userID[mid])
			{
				high=mid-1;
			}
			else if(key==userID[mid])
			{
				return userID[mid];
			}
			else
			{
				low=mid+1;
		}
		}
		
		return 0;
		
	}
 public static void main(String str[])
 {
	 int userID[]={1,11,4,2,32,12,22,8,9,14,17};
	 int hold,key=17;
	  hold=ArraySearchExample.searchElements(userID, key);
	  
	  if(hold==key)
	  {
		  System.out.print("elements found ....."+hold);
	  }
	  else
	  {
		  System.out.println("Not found........");
	  }
 }
}
