import java.util.*;
import java.lang.*;
import java.io.*;

class Testing_Robot
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int x = scan.nextInt();
		    ArrayList <Integer> list = new ArrayList<>();
		    list.add(x);
		    char [] s = scan.next().toCharArray();
		    for(int i = 0;i<n;i++){
		        if(s[i]=='L')
		        x--;
		        else
		        x++;
		        if(!list.contains(x))
		        list.add(x);
		        
		    }
		    System.out.println(list.size());
		}

	}
}
