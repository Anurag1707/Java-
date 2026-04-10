public class recursion
{
    static void printnumber(int n){
        if(n>10){
            return;
        }
        System.out.println(n);
        printnumber(n+1);
    }
    static int fact(int n){
        if(n==1) return 1;
        return n * fact(n-1);
    }

    public static void main(String[] args){
        printnumber(1);
        fact(5);
    }
}