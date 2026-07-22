public class CheckArraySorted{
    static boolean sorted(int arr[], int index){
        if(index==arr.length-1){
            return true;
        }
        if(arr[index]>arr[index+1]){
            return false;
        }
        return sorted(arr, index+1);
    }
    public static void main(String[] args) {
        int arr[] = {12,23,34,45,65};
        System.out.println(sorted(arr, 0)?"sorted":"not sorted");
    }
}