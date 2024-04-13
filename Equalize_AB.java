import java.util.*;
import java.lang.*;
import java.io.*;

class Equalize_AB
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int a = scan.nextInt();
		    int b = scan.nextInt();
		    int x = scan.nextInt();
		    int differ = Math.abs(a-b);
		    int p = differ/x;
		    if (a==b)
		    System.out.println("YES");
		    else if (p%2==0 && differ%x==0)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}
	}
}
