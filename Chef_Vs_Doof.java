import java.util.*;
import java.lang.*;
import java.io.*;

class Chef_Vs_Doof
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scan = new Scanner (System.in);
        int t = scan.nextInt();
        while(t-->0){
            int n = scan.nextInt();
            int a [] = new int [n];
            boolean find = true;
            for(int i=0;i<n;i++){
                a[i]= scan.nextInt();
                if(a[i]%2==0)
                    find = false;
            }
            System.out.println(find==false?"NO":"YES");
        }

	}
}
