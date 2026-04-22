public class print_a {
    static int a(String s, int i, boolean b) {
        if(i==s.length()){
            return b?1:0;
        }
        int x = a(s, i+1, b || s.charAt(i)=='a');
        int y = a(s, i+1, b);
        return x+y;
    }
    public static void main(String[] args) {
        String s = "ab";
        System.out.println(a(s, 0, false));
    }
    
}
