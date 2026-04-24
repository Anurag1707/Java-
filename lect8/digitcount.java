import java.util.*;
public class digitcount {
    static int dcount(int n , int[] dp) {
        if(n==0) return 0;

        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n] = n%10 + dcount(n/10, dp);
        return dp[n];
        // n%10 likhne se sum ho jayegaa
        // 1 likhne se count hogaa

    }
    public static void main(String[] args) {
        int n= 839;
        int[] dp = new int[n+1];
        Arrays.fill(dp , -1);
        System.out.println(dcount(n, dp));
    }
    
}
