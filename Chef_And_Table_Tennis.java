import java.util.*;
import java.lang.*;
import java.io.*;

class Chef_And_Table_Tennis
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    String s = scan.next();
		    int zeros =0, ones = 0;
		    int counter = 20;
		    if(s.length()<=20){
		    for(int i = 0;i<s.length();i++){
		        if (s.charAt(i)=='0')
		        zeros++;
		        else
		        ones++;
		    }
		    if(ones>zeros)
		    System.out.println("WIN");
		    else if (ones<zeros)
		    System.out.println("LOSE");
		    }
		    else
		    {
		       for(;counter<s.length();counter+=2){
		        if(s.charAt(counter)==s.charAt(counter+1))
		             break;
		       }       
		       System.out.println(s.charAt(counter)=='1'?"WIN":"LOSE");
		    }
		}

	}
}
