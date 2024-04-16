import java.util.*;
import java.lang.*;
import java.io.*;

class Digit_Sum_Parities
{
    protected static int digitsum(int n){
        int sum = 0;
        while(n>0){
            int t = n-10*(n/10);
            sum +=t;
            n/=10;
        }
        return sum;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int sumdigitn = digitsum(n);
		    if (sumdigitn%2==0){
		        while(sumdigitn%2==0){
		            n++;
		            sumdigitn=digitsum(n);
		        }
		    
		        System.out.println(n);
		    }
		    else
		    {
		        while(sumdigitn%2!=0){
		            n++;
		            sumdigitn=digitsum(n);
		        }
		    
		        System.out.println(n);
		    }
		}

	}
}
