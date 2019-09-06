// this is how to use this class to find a perticular file in your hard drive
import java.io.File;

public class Find{
   public static void main(String[] args){
 
       File x = new File("F:\\PEND DRIVE\\TODAY.CSV"); // i am checking it in my hard drive for TODAY file whether or not it exists
    	 
    	 if(x.exists())
    		 System.out.println(x.getName() + " exists!!");
    	 else
    		 System.out.println("this file does not exists");
        
    	 
     }     
}
   }
}
