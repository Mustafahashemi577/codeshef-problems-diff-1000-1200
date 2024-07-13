import java.util.*;
import java.lang.*;
import java.io.*;

class My_First_Geometry_Problem
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scan = new Scanner (System.in);
        int t = scan.nextInt();
        while(t-->0){
            String s = scan.next();
            char ch[] = s.toCharArray();
            int x = 1, y = 1;
            if(ch[0] == '1'){
                x = x+10;
            }
            if(ch[1] == '1'){
                x = x+10;
            }
            if(ch[2] == '1'){
                y = y+10;
            }
            if(ch[3] == '1'){
                y = y+10;
            }
            System.out.println(x*y);
        }
	}
}
