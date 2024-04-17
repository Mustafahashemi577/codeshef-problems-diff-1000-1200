import java.util.*;
import java.lang.*;
import java.io.*;

class Equal_String
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    String s1 = scan.next();
		    String s2 = scan.next();
		    HashSet<Character> set = new HashSet<>();
		    int count =0;
		    for(int i =0;i<n;i++){
		        if (s1.charAt(i)!=s2.charAt(i) && !set.contains(s2.charAt(i)))
		        {
		            count++;
		            set.add(s2.charAt(i));
		        }
		    }
		    System.out.println(count);
		    
		}

	}
}
