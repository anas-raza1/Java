public class FindMinMax{
    static int[] minMax(int arr[], int index){
        //base case
        if(index==arr.length){
            int r[] = new int[2];
            r[0]=Integer.MAX_VALUE;
            r[1]= Integer.MIN_VALUE;
            return r;
        }
        //small problem
        int result[]= minMax(arr, index+1);
        if(result[0]>arr[index]){
            result[0]=arr[index];
        }
        else if(result[1]<arr[index]){
            result[1]=arr[index];
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[]= {10,20,30,3,40,50,22};
        int result[]= minMax(arr, 0);
        System.out.println("min "+result[0]+" max "+result[1]);
    }
}