public class CheckSortedArray {
    public static boolean isSorted(int[] arr, int index){
        //base case
        if(index==arr.length-1){
            return true;
        }
        //small problem
        if(arr[index]>=arr[index+1]){
            return false;
        }else{
            return isSorted(arr, index+1);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,3,6};
        System.out.println(isSorted(arr, 0));
    }
}
