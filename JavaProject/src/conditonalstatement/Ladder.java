package conditonalstatement;

import java.util.Scanner;

public class Ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int  score; 
           Scanner scanner = new Scanner(System.in);
           System.out.println("enter the marks(*out of 100*)");
           score = scanner.nextInt();

           if(score <= 100 && score >= 70)
           {
        	   System.out.println("distinction");
           }
           else if(score < 70 && score >= 60)
           {
        	   System.out.println("first class");
           }
           else if(score <= 60 && score >= 50)
           {
        	   System.out.println("second class");
           }
           else if(score < 50 && score >= 41)
           {
        	   System.out.println("third class");
        	  
           }
           else if(score == 40)
           {
        	   System.out.println("pass");
        	  
           }
           else
           {
        	   System.out.println("fail");
           }
           scanner.close();
           


}

}