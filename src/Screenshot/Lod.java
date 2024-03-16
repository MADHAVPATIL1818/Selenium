package Screenshot;

import java.time.LocalDateTime;

public class Lod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         //to take current time
	  LocalDateTime	ldt=LocalDateTime.now();
	  //to print current  time
	  System.out.println(ldt);
	  
	  //to print current date time & replace : char with - 
	  System.out.println(ldt.toString().replace(':', '-'));
	}

}
