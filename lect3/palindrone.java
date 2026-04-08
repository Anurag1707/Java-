// package lect3;

public class palindrone {
    public static void main(String[] args) {
        String str1 = "wow";
         String rev="";
        for(int i= str1.length()-1;i>=0;i--){
            rev=rev + str1.charAt(i);
        }
        System.out.println(rev);
        if(str1.equals(rev)){
            System.out.println("palindrone");
        }
        else{
            System.out.println("not palindrone");
        }
    }
    
}
