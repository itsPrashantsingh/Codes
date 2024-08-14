import java.util.Scanner;

public class countdisways {
    static int count ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nStairs = sc.nextInt();
        long[] dp = new long[n+1];
		if(n==0){
			System.out.println(1);
			break;
		}
		
		if(n<=2){
			return n ;
		}

        dp[0] = 1;
        dp[1] = 1;
		dp[2] = 2;

        for(int i  = 3; i<=n; i++){
            dp[i] = (dp[i-1]+dp[i-2])%1000000007;
        }
		System.out.println(dp[n]);

   
    
	}}
