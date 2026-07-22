public class FindAllOccurence{
    static int[] findAllHelper(int arr[] , int index, int search, int count){
        if(index==arr.length){
            int result[] = new int[count];
            return result;
        }
        if(arr[index]==search){
            count++;
        }
        int result[] = findAllHelper(arr, index+1, search, count);
        if(arr[index]==search){
            result[count-1]=index;
        }
        return result;
    }

    static int[] findall(int arr[], int index, int search){
        return findAllHelper(arr, index, search, 0);
    }
    public static void main(String[] args) {
        int arr[] = {10,20,50,40,50,60};
        int search = 50;
        int index = 0;
        int result[] =  findall(arr, index, search);
        for(int i =0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
}