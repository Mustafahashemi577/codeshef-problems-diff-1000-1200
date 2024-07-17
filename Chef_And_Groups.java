import java.util.*;
import java.lang.*;
import java.io.*;

class Chef_And_Groups
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    char s[] = scan.next().toCharArray();
		    int group=0;
		    for(int i =0;i<s.length;i++){
		        if(i==s.length-1 && s[i]=='1'){
		        group++;
		        continue;
		        }
		        if(s[i]=='1' && s[i+1]!=s[i])
		        group++;
		    }
		    System.out.println(group);
		}

	}
}
