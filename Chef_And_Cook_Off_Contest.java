import java.util.*;
import java.lang.*;
import java.io.*;

class Chef_And_Cook_Off_Contest
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    ArrayList <String> problems = new ArrayList<>();
		    Map <String, Integer> checker = new HashMap<>();
		    checker.put("cakewalk",0);
		    checker.put("simple",0);
		    checker.put("easy",0);
		    checker.put("medium",0);
		    checker.put("easy-medium",0);
		    checker.put("medium-hard",0);
		    checker.put("hard",0);
		    for(int i = 0;i<n;i++){
		        String diff = scan.next();
		        checker.put(diff,checker.get(diff)+1);
		    }
		    if( checker.get("cakewalk")>=1 && checker.get("simple")>=1 && checker.get("easy")>=1 && (checker.get("medium")>=1 || checker.get("easy-medium")>=1) && (checker.get("medium-hard")>=1 || checker.get("hard")>=1))
		        System.out.println("Yes");
		    else
		        System.out.println("No");
		    
		}

	}
}
