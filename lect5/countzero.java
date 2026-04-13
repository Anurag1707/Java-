public class countzero {

   
    public static int zero(int n){
        if(n==0 ) return 0;
    
            int count= (n%10==0) ?1 : 0;
            return count + zero(n/10);
        

    }
    public static void main(String[] args) {
        int n= 10101010;
        System.out.println(zero(n));
    }
    
}
