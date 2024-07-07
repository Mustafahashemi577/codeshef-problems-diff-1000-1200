import java.util.*;
import java.lang.*;
import java.io.*;

class Chef_And_Coloring
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scan = new Scanner (System.in);
        int t = scan.nextInt();
        while(t-->0){
            int n = scan.nextInt();
            char current [] = scan.next().toCharArray();
            int max = 1;
            int secondmax= 1;
            Arrays.sort(current);
            for(int i = 0;i<current.length-1;i++){
                if(current[i]==current[i+1]){
                secondmax++;
                if(secondmax>max)
                max=secondmax;
                }
                else
                secondmax=1;
            }
            System.out.println(current.length-max);
        }
        
	}
}
