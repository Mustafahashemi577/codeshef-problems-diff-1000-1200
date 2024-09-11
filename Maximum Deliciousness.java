import java.util.*;

class Maximum Deliciousness {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            int l = scan.nextInt();
            int[] a = new int[n];
            
            for (int i = 0; i < n; i++) a[i] = scan.nextInt();
            int numberOfElementsInB = (n / k) + 1;
            int[] b = new int[numberOfElementsInB];
            for (int i = 0; i < numberOfElementsInB; i++) {
                b[i] = l + i * k;
            }
            
            Arrays.sort(a);
            long total = 0L;
            int counter = 0;
            int fromEnd = 1;
            for (int i = n - 1; i >= 0; i--) {
                if (counter < numberOfElementsInB && fromEnd == b[counter]) {
                    total += a[i];
                    counter++;
                }
                fromEnd++;
            }
            
            System.out.println(total);
        }
    }
}
