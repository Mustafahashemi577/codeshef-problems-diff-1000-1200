import java.util.*;
import java.lang.*;
import java.io.*;

class Even-Tual_Reduction
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    String s = scan.next();
		    char [] arr =s.toCharArray();
		    Arrays.sort(arr);
		    String s1 = " ";
		    String s2 = " ";
		    for(int i =0;i<n;i++){
		        if (i%2==0)
		        s1+=arr[i];
		        else
		        s2+=arr[i];
		    }
		    System.out.println(s1.equals(s2)?"YES":"NO");
		  
		}

	}
}
