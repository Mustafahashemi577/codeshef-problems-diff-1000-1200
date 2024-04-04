import java.util.*;
import java.lang.*;
import java.io.*;

class Chef_And_His_Students
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    String s = scan.next();
		    char a[] = s.toCharArray();
		    int count =0;
		    for(int i =0;i<a.length;i++){
		        if (a[i]=='>')
		        a[i]='<';
		        else if(a[i]=='<')
		        a[i]='>';
		    }
		    for(int i =0;i<a.length-1;i++)
		    {
		        if (a[i]=='>'&&a[i+1]=='<')
		        count++;
		    }
		        System.out.println(count);
		}

	}
}
