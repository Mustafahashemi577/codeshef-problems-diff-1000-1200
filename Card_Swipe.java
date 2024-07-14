import java.util.*;
import java.lang.*;
import java.io.*;

class Card_Swipe
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int  [] a = new int [n];
		    HashSet <Integer> hs = new HashSet<>();
		    int maxlength = 0;
		    for(int i = 0;i<n;i++){
		        a[i]=scan.nextInt();
		        if(!hs.contains(a[i])){
		        hs.add(a[i]);
		        if(maxlength<hs.size())
		        maxlength=hs.size();
		        }
		        else{
		            hs.remove(a[i]);
		            
		        }
		    }
		    System.out.println(maxlength);
 		}

	}
}
