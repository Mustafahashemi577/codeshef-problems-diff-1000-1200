import java.util.Scanner;

public CodeChef_Streak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextInt();
            }
        
            int maxa=0, maxb=0;
            int maxOm =0;
            int maxAd =0;
            for(int i =0;i<n;i++){
                if (a[i]!=0)
                {
                    maxOm++;
                    if (maxOm>maxa)
                    maxa=maxOm;
                }
                else
                maxOm=0;
                
                if (b[i]!=0){
                maxAd++;
                if(maxAd>maxb)
                maxb=maxAd;
                }
                else
                maxAd=0;
            }
            if (maxa==maxb)
            System.out.println("Draw");
            else
            System.out.println(maxa>maxb? "Om" : "Addy");
            
        }
    }
}
