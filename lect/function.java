
import java.util.Scanner;

public class function{
    public static int add(int a,int b){
        return a+b;
    }

    public static int frequency(int n,int d){
        int count =0;
        while(n>0){
            int rem=n%10;
            if(rem==d){
                count++;
            }
            n=n/10;
        }
        return count;
        
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int a= sc.nextInt();
        // int b= sc.nextInt();
        // int sum= add(a,b);
        // System.out.println(sum );.

        int n= sc.nextInt();
        int d= sc.nextInt();
        int count= frequency(n, d);
        System.out.println(count);


    }
}