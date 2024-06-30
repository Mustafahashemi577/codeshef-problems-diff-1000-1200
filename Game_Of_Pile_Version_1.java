import java.util.*;
import java.lang.*;
import java.io.*;

class Game_Of_Pile_Version_1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while (t-->0){
		    int n = scan.nextInt();
		    int a [] = new int [n];
		    int count = 0;
		    for(int i = 0;i<n; i++){
		        a[i]= scan.nextInt();
		        if(a[i]%2==1)
		        count++;
		    }
		    Arrays.sort(a);
		    if(a[0]==1)
		    System.out.println("CHEF");
		    else if (count%2==0)
		    System.out.println("CHEFINA");
		    else
		    System.out.println("CHEF");
		} 

	}
}
