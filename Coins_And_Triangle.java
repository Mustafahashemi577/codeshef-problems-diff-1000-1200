import java.util.*;
import java.lang.*;
import java.io.*;

class Coins_And_Triangle
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int row = 0 ;
		    for(int i =1;i<=n;i++){
		        row++;
		        n-=i;
		    }
		    System.out.println(row);
		}

	}
}
