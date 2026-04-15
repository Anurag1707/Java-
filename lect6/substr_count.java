public class substr_count {
    // static int count=0;
    public static int subset(String str) {
        if(str.isEmpty()){
            return 1;
        }
        char ch = str.charAt(0);

        return subset(str.substring(1))+subset(str.substring(1));

    }
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(subset(str));
    }

}
