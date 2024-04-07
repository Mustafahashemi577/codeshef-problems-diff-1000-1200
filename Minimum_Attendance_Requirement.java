import java.util.*;
import java.lang.*;
import java.io.*;

class Minimum_Attendance_Requirement
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    String b = scan.next();
		    int absent = 0;
		    for(int i =0;i<n;i++){
		        if(b.charAt(i)=='0')
		        absent++;
		    }
		    System.out.println(absent>30? "NO" : "YES");
		}

	}
}
