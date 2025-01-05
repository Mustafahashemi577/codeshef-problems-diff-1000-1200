import java.util.*;
import java.lang.*;
import java.io.*;

class LazySalesman
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scan = new Scanner (System.in);
        int t = scan.nextInt();
        while(t-->0){
            int n = scan.nextInt();
            int w = scan.nextInt();
            int a[] = new int [n];
            int sum=0;
            for(int i = 0;i<n;i++){
                a[i]=scan.nextInt();
                sum+=a[i];
            }
            Arrays.sort(a);
            if(sum==w)
            System.out.println(0);
            else{
                int i = 0;
                for(;i<n;i++){
                    sum-=a[i];
                    if(sum<=w)
                    break;
                }
                System.out.println(sum<w?i:i+1);
            }
            
        }
        
	}
}

