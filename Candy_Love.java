import java.util.*;
import java.lang.*;
import java.io.*;

class Candy_Love
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    boolean find = false;
		    int a []= new int [n];
		    int sum = 0;
		    for (int i =0;i<n;i++){
		        a[i]=scan.nextInt();
		        sum+=a[i];
		    }
		    /*for(int i =0;i<n-1;i+=2){
		  
		    }*/
		    System.out.println(sum%2!=1? "NO" : "YES");
		}

	}
}
