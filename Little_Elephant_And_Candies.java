import java.util.*;
import java.lang.*;
import java.io.*;

class Little_Elephant_And_Candies
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int elephants = scan.nextInt();
		    int candies = scan.nextInt();
		    int a [] = new int [elephants];
		    int totalCan = 0;
		    for(int i = 0;i<elephants;i++){
		        a[i]= scan.nextInt();
		        totalCan+=a[i];
		    }
		    System.out.println(totalCan<=candies?"Yes":"No");
		}

	}
}
