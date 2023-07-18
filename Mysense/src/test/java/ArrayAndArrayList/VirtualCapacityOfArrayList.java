package ArrayAndArrayList;

import java.util.ArrayList;

public class VirtualCapacityOfArrayList {

	 public static void main(String[] args) {
		
		 
         ArrayList<Object> arr=new ArrayList<Object>(20); //here 20 we are passing to change VC.
         arr.add(5);
         arr.add("Shivani");
         arr.add(1+2);
         arr.add(3.8);
         System.out.println(arr); 
         System.out.println(arr.size());  //size() always count physical capacity. 
                                          //and in arraylist default virtual capacity is 10.
         arr.add(7);
         System.out.println(arr.size());
         
	}
}
