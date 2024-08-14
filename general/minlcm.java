import java.util.Scanner;

public class minlcm {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int[] x = new int[1];
            int[] y = new int[1];
            int[] max = new int[1];
            max[0] = Integer.MAX_VALUE;
            int n = sc.nextInt();
            for(int i =2; i*i<=n; i++){
                if(n%i==0){
                    gcd(i, n-i, x, y, max);
                    gcd(n/i, n-(n/i),x, y, max);
                }
                
            }
            System.out.println(x[0]+" "+y[0]);

        t--;

    }



    }

    public static void gcd(int a, int b, int[]x, int[]y,int[] max){
        

            while(a%b!=0){
                int r = a%b;
                a = b;
                b = r;
            }
            System.out.println(b);
            if((a*b)/b < max[0]){
                x[0] = b;
                y[0] = a;
                max[0] = (a*b)/b;
            }
        
    }
    
}
