import java.util.*;
import java.lang.*;
import java.io.*;

class Reach_Codetown
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan = new Scanner (System.in);
	    int t = scan.nextInt();
	    while(t-->0){
	        String s = scan.next();
	        char array[]=s.toCharArray();
	        boolean find [] = {false, true, false, true, false,true,false,false};
	        boolean result = true;
	        for(int i =0;i<8;i++){
	            if("AEIOU".contains(array[i]+"") != find[i])
	            
	            {
	                result=false;
	                break;
	            }
	        }
	        System.out.println(result==true? "YES":"NO");
	        
	    }

	}
}
