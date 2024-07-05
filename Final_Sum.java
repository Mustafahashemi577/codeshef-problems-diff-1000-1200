import java.util.*;
import java.lang.*;
import java.io.*;

class Final_Sum
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scan = new Scanner (System.in);
        int t = scan.nextInt();
        while(t-->0){
            int n = scan.nextInt();
            int q = scan.nextInt();
            int a[] = new int [n];
            int sum = 0;
            for(int i = 0 ;i<n;i++){
                a[i]= scan.nextInt();
                sum+=a[i];
            }
            for(int i = 0;i<q;i++){
                int a1 = scan.nextInt();
                int a2 = scan.nextInt();
                if((a2-a1)%2==0)
                sum++;
            }
            System.out.println(sum);
            
        }
            
	}
}
