import java.util.*;
import java.lang.*;
import java.io.*;

class Access_Control
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int x = scan.nextInt();
		    boolean find = true;
		    char [] access =scan.next().toCharArray();
		    if (access[0]=='0'){
		    System.out.println("NO");
		    }
		    else{
		        int p = x;
		        for(int i = 0;i<n;i++)
		        {
		            if(access[i]=='0')
		            {
		                p--;
		                if(p<0)
		                {
		                    find = false;
		                    break;
		                }
		            }
		            if(access[i]=='1')
		            p=x;
		        }
		    
		            System.out.println(find==false? "NO":"YES");
		    
		    }
		    }
		}
		
	}

