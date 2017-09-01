
//In this program we are trying to copy the elements from set2 to set1
//so that the set1 becomes the union of set2 as set1

package Assignment20;  // i am crating package name as Assignment20

import java.util.HashSet;
import java.util.Set;

public class SetDemo {   // i am creating Class name as SetDemo
	public static void main (String []args){     // the main method
		
				Set setDemo1 = new HashSet();  //creating HashSet method
				
				// here i am adding four string elements in the setDemo1 object
				
				setDemo1.add("Gandiji");  
				
				setDemo1.add("Ravindranath tagore");
				
				setDemo1.add("Subash chandrabosh");
				
				setDemo1.add("Swami Vivekananda");
				
				
			    Set setDemo2 =new HashSet(); 
			    
			    setDemo2.add("Sardhar vallabhaipatel"); //creating  four string elements in the setDemo2 object
			    setDemo2.add("Sarojini naidu");        
			    setDemo2.add("APJ Abdul kalam");
			    setDemo2.add(" Gurunanak");
			 
			   
				System.out.println("The setDemo1 elements are : "+setDemo1 );    // the elements are printing  setDemo1 and setDemo2
				System.out.println("The setDemo2 elements are : "+setDemo2 );
				
				
				                    //after adding all the elements it shows as one set 
				
				setDemo1.addAll(setDemo2);
				
				System.out.println("After adding all the elements of setDemo2 to setDemo1 are : " ); 
				
				
			
				System.out.println(setDemo1 );  //as it prints all the elements
				
				
			}

		

	}
   