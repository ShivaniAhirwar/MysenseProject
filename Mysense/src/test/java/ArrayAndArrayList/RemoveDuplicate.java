package ArrayAndArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;


public class RemoveDuplicate 
{
	public static void main(String[] args) {
		
       ArrayList<Integer> num=new ArrayList<Integer>(Arrays.asList(2,1,3,2,4,5,6,5,6,7,7));
         
       LinkedHashSet<Integer> numb=new LinkedHashSet<Integer>(num);
       System.out.println(num);
       System.out.println(numb);
       
     //JDK 8 ----> use of stream
       
       ArrayList<Integer> rollNum=new ArrayList<Integer>(Arrays.asList(2,1,3,2,4,5,6,5,6,7,7));
           
       List<Integer> uniqueRollNum = rollNum.stream().distinct().collect(Collectors.toList());
       System.out.println(uniqueRollNum);
       
       System.out.println("+++++++++++++++++++++++++++");
       
       int[] arr= {2,1,3,2,4,5,6,5,6,7,7};
       
       for(int i=0;i<arr.length;i++)
       {
    	   int count=0;
    	   for(int j=0;j<arr.length;j++)
    	   {
    		   if(i!=j && arr[i]==arr[j])
    		   {
    			   count++;
    		   }
    	   }
    	   if(count==0)
    	   {
    		   System.out.println(arr[i]);
    	   }
       }
	}      
}
