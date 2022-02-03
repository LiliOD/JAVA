package loopsGit;
import java.util.Scanner;

public class WhileLoops {
	 public static void main(String[] args)
	    {
	        Scanner console = new Scanner(System.in);
	        int num;
	        
	        System.out.print("Enter any positive integer: ");
	        num = console.nextInt();
	        
	        console.close();
	                
	        System.out.println("Multiplication Table of " + num);
	        
	       //TODO implement While loop to get print result
	        int i = 0;
	        while (i<=10) {
	        	System.out.println(num*i);
	        	i++;
	        }
	    }

}
