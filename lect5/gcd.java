public class gcd {

    static int gcdd(int a,int b){
        if(b==0) return a;
        return gcdd(b,a%b);
    }
    public static void main(String[] args) {
        int a=12 ,b =18;
        System.out.println(gcdd(a, b));
    }
    
}
