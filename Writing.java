// this one creates a file and adds something in it
// Main class

public class apples {
     public static void main(String[] args) {
    	
    	 CreateFile fl = new CreateFile();
    	 fl.openFile();
    	 fl.addRecords();
    	 fl.closeFile();

}
}



import java.io.*;
import java.lang.*;
import java.util.*;

public class CreateFile {
	
	private Formatter x;
	
	public void openFile() {
		try {
			x = new Formatter("chinese.txt");
		}
		catch (Exception e) {
			System.out.println("u have an error!");
		}
	}
	
	// open a file and add three values to the file
	public void addRecords() {
		x.format("%s, %s, %s", " 20", " Dinesh", " Sharma");
	}
	// finally when i am done, just close the file
	public void closeFile() {
		x.close();
	}

}
// if i look at the JRE System Library i see this file created
