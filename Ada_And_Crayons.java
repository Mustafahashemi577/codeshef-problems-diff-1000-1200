import java.util.*;
import java.lang.*;
import java.io.*;

class Ada_And_Crayons
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    char [] s = scan.next().toCharArray();
		    int upwards = 0;
		    int downwards = 0;
		    char define = s[0];
		    if(define=='U')
		    upwards++;
		    else
		    downwards++;
		    for(int i = 1;i<s.length;i++){
                if(define!=s[i])
                {
                    if(s[i]=='U')
                    upwards++;
                    else
                    downwards++;
                    
                    define=s[i];
                }
		    }
		    System.out.println(downwards>=upwards? upwards:downwards);
		}

	}
}
