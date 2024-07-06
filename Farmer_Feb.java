import java.util.*;
import java.lang.*;
import java.io.*;

class Farmer_Feb
{
    public static boolean isPrime(int number){
        if(number<=1){
        return false;
        }
        for(int i =2;i<=Math.sqrt(number);i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int x = scan.nextInt();
		    int y = scan.nextInt();
		    int sum = x+y;
		    int collected = sum+1;
		    while(collected<10000){
		        boolean find = isPrime(collected);
		        if(find== true){
		        System.out.println(collected-sum);
		        break;
		        }
		        else
		        collected++;
		    }
		    
		}

	}
}
