import java.util.*;
import java.lang.*;
import java.io.*;

class Spell_Shortening
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        while (t-- > 0) {
            int n = scan.nextInt();
            String s = scan.next();
            
            int id = 0;
            for (id = 0; id < n - 1; id++) {
                if (s.charAt(id) > s.charAt(id + 1)) {
                    break;
                }
            }
            
            for (int i = 0; i < n; i++) {
                if (id != i) {
                    System.out.print(s.charAt(i));
                }
            }
            System.out.println();
        }
	}
}
