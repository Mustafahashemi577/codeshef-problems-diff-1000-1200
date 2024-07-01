import java.util.*;
import java.lang.*;
import java.io.*;
class Medel
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   Scanner scan = new Scanner(System.in);
        int times = scan.nextInt();
        while(times --> 0){
            int n = scan.nextInt();
            int[] a = new int[n];
            ArrayList<Integer> clist = new ArrayList<>();
            for(int i=0;i<n;i++){
                a[i] = scan.nextInt();
                clist.add(a[i]);
            }
            Arrays.sort(a);
            int max = clist.indexOf(a[0]);
            int min = clist.indexOf(a[a.length-1]);
            System.out.println(min>max?a[0]+" "+a[a.length-1]:a[a.length-1]+" "+a[0]);
        }
	}
}
