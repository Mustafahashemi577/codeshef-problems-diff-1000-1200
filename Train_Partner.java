import java.util.*;
import java.lang.*;
import java.io.*;

class Train_Partner
{
	public static void main (String[] args) throws java.lang.Exception
	{   
	    Scanner scan = new Scanner(System.in);
	    int t = scan.nextInt();
	    while(t-->0){
	        int n = scan.nextInt();
	        int x = n/8;
            if(n%8==1){
                System.out.println((x*8+4) + "LB");
            }else if(n%8==2){
                System.out.println((x*8+5) + "MB");
            }else if(n%8==3){
                System.out.println((x*8+6) + "UB");
            }else if(n%8==4){
                System.out.println((x*8+1) + "LB");
            }else if(n%8==5){
                System.out.println((x*8+2) + "MB");
            }else if(n%8==6){
                System.out.println((x*8+3) + "UB");
            }else if(n%8==7){
                System.out.println((x*8+8) + "SU");
            }else if(n%8==0){
                System.out.println((x*8-1) + "SL");
            }
        
	    }

	}
}
