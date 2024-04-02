import java.util.*;
import java.lang.*;
import java.io.*;

class Encoding_Message
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    String s = scan.next();
		    char arr [] = s.toCharArray();
		    for(int i = 0;i<n-1;i+=2){
		        char temp = arr[i];
		        arr[i]=arr[i+1];
		        arr[i+1]=temp;
		    }
		    
		    for(int i =0;i<n;i++){
		        int d = (int)arr[i];
		        arr[i]=(char)(122-(d-97));
		    }
		    String F = new String(arr);
		    System.out.println(F);
		}

	}
}
