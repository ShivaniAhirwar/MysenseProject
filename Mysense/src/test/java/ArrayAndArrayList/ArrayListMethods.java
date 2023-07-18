package ArrayAndArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods 
{
    public static void main(String[] args) {
		
    //Combine two arrayList elements.
    	
    	ArrayList<String> names= new ArrayList<String>();
    	names.add("Shivani");
    	names.add("Abhishek");
    	names.add("Shalini");
    	names.add("Sameer");
    	names.add("Unknown");
    	
    	ArrayList<String> Department= new ArrayList<String>();
    	Department.add("QA");
    	Department.add("BPO");
    	Department.add("Beautician");
    	Department.add("VIP");
    	
    	names.addAll(Department);
    	System.out.println(names);
    	System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
    	names.addAll(2,Department); //to add elements from specific index.
    	
  	//Clone the elements of arrayList.
    	
    	ArrayList<String> clone = (ArrayList<String>)names.clone();
    	System.out.println(clone);
    	
    //To check index of any element-----> indexOf().
    	
    	int index = names.indexOf("BPO");
    	System.out.println("String index="+index);
    	System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
    	int lastIndex = names.lastIndexOf("VIP");
    	System.out.println("index of last string="+lastIndex);
    	
    	int undefinedIndex = names.lastIndexOf("true");
    	System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
    	System.out.println(undefinedIndex);
    	
   //Remove values from arrayList.
    	names.remove("VIP");
    	System.out.println(names);
    	System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        names.remove("Unknown");
        System.out.println(names);
    	ArrayList<Integer> list=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,9,8,9,10));
    	list.removeIf(num-> num%2!=0);
    	System.out.println(list);
        
    	
    //RetainAll() method, it will retain all values which we have passed.
    	names.retainAll(Collections.singleton("BPO"));
    	System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
    	System.out.println(names);
    
    //Create sublist for arrayList.
    	ArrayList<Integer> subList=new ArrayList<Integer>(list.subList(2,5));
    	System.out.println(subList);
	}
}
