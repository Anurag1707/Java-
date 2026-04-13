
public class x_n_recursion {

    static int power(int x,int n){
        if(n==0) return 1;

        return x*power(x, n-1);

    } 
    public static void main(String[] args) {
        int x=5;
        int n=2;
        int result= power(x, n);
        System.out.println(result);
    }
    
}
