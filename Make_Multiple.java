import java.util.*;
import java.lang.*;
import java.io.*;

class Make_Multiple
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int firstNumber = scan.nextInt();
		    int secondNumber = scan.nextInt();
		    if(secondNumber%firstNumber!=0){
		        if(secondNumber>2*firstNumber)
		        System.out.println("YES");
		        else
		        System.out.println("NO");
		    }
		    else
		    System.out.println("YES");
		}

	}
}
