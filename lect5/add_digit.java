// public class add_digit {

   
//     public static  int sum(int n){
//         if(n==0) return 0;

       
//         return n%10 +sum(n/10);

//     }
//     public static void main(String[] args) {
//         int n=123;

//         System.out.println(sum(n));
//     }
    
// }

//count digit

public class add_digit{

    public static int count(int n){
        if(n==0) return 0;
        return 1+ count(n/10);


    }
    public static void main(String[] args) {
        int n =6541;
        System.out.println(count(n));
    }
}
