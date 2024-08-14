import java.util.Scanner;

class frogjump2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] heights = new int[n];
        for(int i = 0;i<n; i++){
          heights[i] = sc.nextInt();
        }
        int[] dp = new int[n];
        dp[n-1] = 0;
        dp[n-2] = Math.abs(heights[heights.length-1]-heights[heights.length-2]);
        
       

        for(int i = n-3; i>=0; i--){
            int min = Integer.MAX_VALUE;
            
            for(int j = 1; j<=k && (i+j)<n; j++){
              min = Math.min(Math.abs(heights[i]-heights[i+j])+dp[i+j], min);
            }
            
            dp[i] = min;
        }
        
        
      System.out.println(dp[0]);
        
    }

    
}