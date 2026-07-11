public class ForLoop {
    public static void main(String[] args) {
        int arr[] = { 10, 32, 4, 35, 33, 5 };
        System.out.println("Traditional way");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("modern array travesrsal");

        for (int e : arr) {
            System.out.println(e);
        }
    }
}
