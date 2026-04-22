public class array_even {

    static void even(int[] arr,int i,int sum,String curr) {
        if(i==arr.length){
            if(sum%2==0){
                System.out.println(curr);
            }
            return;
        }
        even(arr,i+1,sum+arr[i],curr+arr[i]);
        even(arr,i+1,sum,curr);
    }
    

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        even(arr, 0, 0, "");
    }
    
}
