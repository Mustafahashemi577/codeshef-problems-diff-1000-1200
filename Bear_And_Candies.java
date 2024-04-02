import java.util.*;
import java.lang.*;
import java.io.*;

class Bear_And_Candies
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int a = scan.nextInt();
		    int b = scan.nextInt();
		    int limak = 0;
		    int bob = 0;
		    int i =1;
		    for(;limak<=a&&bob<=b;i++)
		    {
		        if (i%2==1)
		        limak+=i;
		        else
		        bob+=i;
		    }
		    System.out.println(i%2==0 ? "Bob":"Limak");
		}

	}
}
