import java.util.*;
import java.lang.*;
import java.io.*;

class Chef_And_Subset_Additions
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int x = scan.nextInt();
		    int y = scan.nextInt();
		    int a[] = new int [n];
		    int b[] = new int [n];
		    for(int i = 0;i<n;i++)
		        a[i]=scan.nextInt();
		    for(int i = 0;i<n;i++)
		        b[i]=scan.nextInt();
		    boolean result = true;
		    for(int i =0;i<n;i++){
		        int temp1=a[i]+x;
		        int temp2=a[i]+y;
		        if(temp1!=b[i] && temp2!=b[i] ){
		        result=false;
		        break;
		        }
		    }
		    System.out.println(result==true?"Yes":"No");
		}
	}
}
