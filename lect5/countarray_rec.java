public class countarray_rec {
    static int countarrayofkey(int[] arr, int i, int key){

        if(i==arr.length) return 0;
        int count = (arr[i] == key) ? 1: 0;
        return count + countarrayofkey(arr, i+1, key);
    }
    public static void main(String[] args) {
        int[] arr ={1,2,2,4,2,6,7};
        int key = 2;
        int i = 0;
        System.out.println(countarrayofkey(arr, i, key));
    }
    
}