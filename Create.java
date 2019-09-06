// Creating a file

import java.util.*;

public class Create{
  public static void main(String[] args){
        
        final Formatter x;
    	 // i am putting it in try catch
    	 try {
    		 x = new Formatter("fred.txt");
    		 System.out.println("u created a file");
    	 }
    	 catch(Exception e) {
    		 System.out.println("YOU GOT AN ERROR!!");
    	 }
    
    
  }
}

// One last point
// the file will be created in whatever directory you programing in
