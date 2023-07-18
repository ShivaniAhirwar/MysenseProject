package ArrayAndArrayList;

import java.util.ArrayList;

public class ArraylistProgram
{
    public static void main(String[] args)
    {
	       //Arraylist is dynamic in nature where array is static in nature.
    	
    	//default generic of arraylist is object.
           ArrayList<Object> arr=new ArrayList<Object>();
           arr.add(5);
           arr.add("Shivani");
           arr.add(1+2);
           arr.add(3.8);
           System.out.println(arr);
           System.out.println(arr.size());
           arr.add(7);
           System.out.println(arr.size());
    	
    	
	}
}
