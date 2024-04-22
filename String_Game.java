import java.util.*;
import java.lang.*;
import java.io.*;

class String_Game
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    char [] s = scan.next().toCharArray();
		    HashMap <Character,Integer> define = new HashMap<>();
		    boolean find = true;
		    if(s.length%2!=0)
		    System.out.println("NO");
		    else{
		    for(int i =0;i<s.length;i++){
		        if(!define.containsKey(s[i]))
		        {
		            define.put(s[i],1);
		        }
		        else
		        {
		            define.put(s[i],(define.get(s[i]))+1);
		        }
		    }
		    for(char key: define.keySet() )
		        if((define.get(key))%2!=0)
		        {
		            find = false;
		            break;
		        }         
		    
		        System.out.println(find==false?"NO":"YES");
		    }      
		}

	}
}
