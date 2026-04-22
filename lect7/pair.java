

public class pair {
    static void set(String p, String up,int k) {
        if(p.length()==k){
            System.out.println(p);
            return;
        }
        if(up.isEmpty()) return;
        char ch = up.charAt(0);
        set(p+ch, up.substring(1),k);
        set(p, up.substring(1),k);
    }
    public static void main(String[] args) {
        String up ="abcd";
        String p ="";
        int k=2;
        set(p, up, k);
    }
    
}
