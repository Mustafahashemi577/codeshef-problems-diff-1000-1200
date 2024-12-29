import java.util.*;
import java.lang.*;
import java.io.*;

class PawriMeme
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    String p = scan.next();
		    if(p.length()<5)
		        System.out.println(p);
		    else{
		        char s[] = p.toCharArray();
		        for(int i = 0;i<s.length-4;i++){
		            if(s[i]=='p'&&s[i+1]=='a'&&s[i+2]=='r'&&s[i+3]=='t'&&s[i+4]=='y'){
		                s[i+2]='w';
		                s[i+3]='r';
		                s[i+4]='i';
		            }
		        }
		        StringBuilder sb = new StringBuilder();
		        for(char c:s)
		        sb.append(c);
		        System.out.println(sb);
		    }
		}

	}
}

