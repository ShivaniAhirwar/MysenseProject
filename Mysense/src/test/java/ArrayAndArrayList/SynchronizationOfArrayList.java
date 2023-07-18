package ArrayAndArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizationOfArrayList 
{
      public static void main(String[] args)
      {
	      List<String> names = Collections.synchronizedList(new ArrayList<String>());
	      names.add("Tom");
	      names.add("Dom");
	      names.add("Mom");
	      names.add("Com");
	  //to add/remove we dont need explicit synchronization.
	      
	  // for traverse/fetch the value from list---> need to do explicit sychronization    
	      synchronized(names)
	      {
	    	  Iterator<String> na = names.iterator();  
	    	  while(na.hasNext())
	    	  {
	    		  System.out.println(na.next());
	    	  }
	      }
	 //CopyOnWriteArrayList --- its a class ---> it a class---> thread safe/synchronized already.
	      
	      
	      CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
	      list.add("Java");
	      list.add("Ruby");
	      list.add("JavaScript");
	    
	      Iterator<String> it = list.iterator();
	      while(it.hasNext())
	      {
	    	  System.out.println(it.next());
	      }
	      
	      
	}
}
