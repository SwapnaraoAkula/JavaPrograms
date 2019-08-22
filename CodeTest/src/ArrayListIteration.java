import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {
	public static void main(String[] args) {

	      ArrayList<Integer> arrlist = new ArrayList<Integer>();
	      arrlist.add(14);
	      arrlist.add(7);
	      arrlist.add(39);
	      arrlist.add(40);

	      /* For Loop for iterating ArrayList */
	      System.out.println("For Loop");
	      for (int i = 0; i < arrlist.size(); i++) { 		      
	          System.out.println(arrlist.get(i)); 		
	      }   		

	      /* Advanced For Loop*/ 		
	      System.out.println("Advanced For Loop"); 		
	      for (Integer i : arrlist) { 		      
	           System.out.println(i); 		
	      }

	      /* While Loop for iterating ArrayList*/ 		
	      System.out.println("While Loop"); 		
	      int i = 0; 		
	      while (arrlist.size() > i) {
		 System.out.println(arrlist.get(i));
	         i++;
	      }

	      /*Looping Array List using Iterator*/
	      System.out.println("Iterator");
	      Iterator iter = arrlist.iterator();
	      while (iter.hasNext()) {
	         System.out.println(iter.next());
	      }
	   }
	}


