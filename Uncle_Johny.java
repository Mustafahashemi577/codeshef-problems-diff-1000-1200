import java.util.*;
import java.lang.*;
import java.io.*;

class Uncle_Johny
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int a[] = new int [n];
		    for(int i =0;i<n;i++){
		        a[i]=scan.nextInt();
		    }
		    int k = scan.nextInt();
		    int w = a[k-1];
		    Arrays.sort(a);
		    for(int i =0;i<n;i++){
		        if (a[i]==w)
		        {
		            System.out.println(i+1);
		            break;
		        }
		    }
		}

	}
}
