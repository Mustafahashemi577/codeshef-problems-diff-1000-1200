import java.util.*;
import java.lang.*;
import java.io.*;

class DevuAndFriendshipTesting
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan = new Scanner (System.in);
	    int t = scan.nextInt();
	    while(t-->0){
	        Set<Integer> set = new HashSet<>();
	        int n = scan.nextInt();
	        for(int i = 0;i<n;i++) set.add(scan.nextInt());
	        System.out.println(set.size());
	    }

	}
}

