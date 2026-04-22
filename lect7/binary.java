

public class binary {
    static void totalsum(String str, int n) {
        if(n==0){
            System.out.println(str);
            return;
        }
        totalsum(str+"0", n-1);
        totalsum(str+"1", n-1);
        
    }
    public static void main(String[] args) {
        int n=2;
        totalsum("", n);
    }
    
}
