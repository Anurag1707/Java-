public class mul_string {
    public static void main(String[] args) {
        String s1= "12";
        String s2 ="3";
        int num1=0;
        int num2=0;
        for(int i=0; i<s1.length(); i++){
            num1= num1 * 10 +(s1.charAt(i)-'0');
        }
         for(int i=0; i<s2.length(); i++){
            num2= num2 * 10 +(s2.charAt(i)-'0');
        }

        System.out.println(num1 * num2);

        }
    
}
