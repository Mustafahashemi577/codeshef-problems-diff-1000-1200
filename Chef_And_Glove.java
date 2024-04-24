import java.util.*;
import java.lang.*;
import java.io.*;

class Chef_And_Glove
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int a[] = new int [n];
		    int b [] = new int [n];
		    boolean find = true;
		    boolean find2 = true;
		    for(int i = 0;i<n;i++)
		        a[i]= scan.nextInt();
		    for(int i =0;i<n;i++)
		        b[i]= scan.nextInt();
		    
		    for(int i = 0;i<n;i++){
		        if (a[i]>b[i])
		        {
		            find = false;
		            break;
		        }
		    }
		    int j = n-1;
		    for(int i=0;i<n&&j>=0;i++){
		        if(a[i]>b[j])
		        {
		            find2 = false;
		            break;
		        }
		        j--;
		    }
		    if(find==false && find2==false)
		    System.out.println("none");
		    else if (find == true && find2 == false)
		    System.out.println("front");
		    else if (find2 == true && find == false)
		    System.out.println("back");
		    else if (find2==true && find ==true)
		    System.out.println("both");
		}

	}
}
