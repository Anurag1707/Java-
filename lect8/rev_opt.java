public class rev_opt{
    static String rev(String str, String[] dp) {
        if(str.length()==0) return "";
        int len= str.length();
        if(dp[len]!= null) return dp[len];
        dp[len]= rev(str.substring(1), dp) + str.charAt(0);
        return dp[len];
        
    }
    public static void main(String[] args) {
        String str = "hello";
        String[] dp =new String[str.length()+1];
        System.out.println(rev(str, dp));
        
    }
    
}
