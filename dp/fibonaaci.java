import java.util.Scanner;

class fibonaaci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+1];

        dp[0] = 0;
        dp[1] = 1;

        for(int i  = 2; i<=n; i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        for(int i= 0; i<dp.length; i++)
        System.out.print(dp[i]+" ");

        
    }

    
}