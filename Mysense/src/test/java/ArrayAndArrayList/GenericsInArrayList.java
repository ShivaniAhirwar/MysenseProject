package ArrayAndArrayList;

import java.util.ArrayList;

public class GenericsInArrayList 
{
       public static void main(String[] args) {
		
    	   //To store a particular type data in the object form.
    	   
    	   ArrayList<String> names= new ArrayList<String>();
    	   names.add("Shivani");
    	   names.add("abhishek");
    	   names.add("shalini");
    	   names.add("sameer");
    	   names.add("deepu");
    	   names.add("kajal");
    	   names.add("tyshdgfx");
    	   
    	   String storeName = names.get(0);
    	   System.out.println(storeName);
    	   System.out.println(names);
    	   names.remove(names.size()-1);
    	   System.out.println("==========================");
    	   System.out.println(names);
    	  
	}
	
}
