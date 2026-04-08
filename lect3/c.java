public class comp {
    public static void main(String[] args) {
        String str1 = "aabbccde";
        String result="";
        int count=1;


        
        for(int i=0; i<str1.length();i++){
            if(i<str1.length()-1 && str1.charAt(i)==str1.charAt(i+1)){
                count++;
            }
            else{
                result = result + str1.charAt(i)+ count;
                count=1;
            }
        }

        if(count==1){
            System.out.println();
        }
        System.out.println(result);
        

    }
    
}

