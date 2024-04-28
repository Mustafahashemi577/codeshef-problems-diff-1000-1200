import java.util.*;
import java.lang.*;
import java.io.*;

class Chef_And_Card_Game
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int chef = 0;
		    int morty = 0;
		    while(n-->0){
		        int a = scan.nextInt();
		        int b = scan.nextInt();
		        char [] y = Integer.toString(a).toCharArray();
		        char [] u = Integer.toString(b).toCharArray();
		        int sumA = 0;
		        int sumB = 0;
		        for(int i =0;i<y.length;i++){
		            sumA+=(int)Character.getNumericValue(y[i]);
		        }
		        for(int i =0;i<u.length;i++){
		            sumB+=(int)Character.getNumericValue(u[i]);
		        }
		        if(sumA>sumB){
		            chef++;
		        }
		        else if (sumB>sumA){
		            morty++;
		        }
		        else if(sumA==sumB) 
		        {
		            chef++;
		            morty++;
		        }
		       
		    }
		    if(chef==morty)
		    System.out.println("2"+" "+chef);
		    else
		    System.out.println(chef>morty?'0'+" "+chef:'1'+" "+morty);
		}

	}
}
