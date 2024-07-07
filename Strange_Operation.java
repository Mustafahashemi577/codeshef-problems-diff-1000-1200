import java.util.*;
import java.lang.*;
import java.io.*;

class Strange_Operation
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scan = new Scanner (System.in);
        int t = scan.nextInt();
        while(t-->0){
            int n = scan.nextInt();
            int k = scan.nextInt();
            int a [] = new int [n];
            long sum = 0;
            for(int i = 0;i<n;i++){
                a[i]=scan.nextInt();
                sum+=a[i];
            }
            long store=0;
            while(k-->0){
                long d = sum+1;
                sum+=d;
                store = d;
            }
            
            System.out.println(store%2==0?"even":"odd");
        }
        
	}
}
