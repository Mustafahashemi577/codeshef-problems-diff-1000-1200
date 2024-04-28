import java.util.*;
import java.lang.*;
import java.io.*;

class Processing_A_String
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    char [] s = scan.next().toCharArray();
		    int sum = 0;
		    for(int i = 0;i<s.length;i++){
		        if(s[i]>='1'&&s[i]<='9'){
		            sum += (int)Character.getNumericValue( s[i] );
		        }
		    }
		    System.out.println(sum);
		    
		}

	}
}
