

public class check_string {
    public static void main(String[] args) {
        String str ="123 ";
        int result=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)<'0' || str.charAt(i)>'9'){
                result= result +1;
            }
           
        }
        if(result==1){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

    }
    

}
