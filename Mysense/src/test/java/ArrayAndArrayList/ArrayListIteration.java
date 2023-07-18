package ArrayAndArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIteration 
{
    public static void main(String[] args) {
		 
    	ArrayList<String> studentName=new ArrayList<String>();
    	studentName.add("shivani");
    	studentName.add("Abhishek");
    	studentName.add("Shalini");
    	studentName.add("sameer");
    	studentName.add("deepu");
    	
    	//Typical forloop
    	for(int i=0;i<studentName.size();i++)
    	{
    		System.out.println(studentName);
    	}
    	
    	//for each loop
    	for(String s:studentName)
    	{
    		System.out.println(s);
    	}
    	
    	//jdk 8 - we can use stream lamda 
    	//studentName.stream().forEach(ele<studentName);
    	
    	// 
    	ArrayList<Integer> arr=new ArrayList<Integer>(Arrays.asList(10,20,30));
    	
    	System.out.println(arr);
    	arr.add(8);
    	arr.add(2);
    	System.out.println(arr);
    	
	}
}
