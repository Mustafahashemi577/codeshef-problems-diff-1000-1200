import java.util.*;
import java.lang.*;
import java.io.*;

class Holes_In_The_Text
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		   char [] s = scan.next().toCharArray();
		   int count =0;
		   for(int i = 0;i<s.length;i++){
		       if (s[i]=='A'|| s[i]=='D'|| s[i]=='O'||s[i]=='P'||s[i]=='Q'||s[i]=='R')
		       count++;
		       else if (s[i]=='B')
		       count+=2;
		   }
		   System.out.println(count);
		   
		}
	}
}
