public class PrintName {

    static void printName(int num) {
        // recuresion stop
        // termination case/base case
        if (num == 0) {
            return; // exit from the current function call
        }
        // pre-closing
        System.out.println("Anas " + num); // logic
        // num-1 (small problem)+recursion
        printName(num - 1); // recursion call end of the function
        // post-processing
        System.out.println("Raza " + num);
    } // end bracket (tail)

    public static void main(String[] args) {
        printName(5);
    }
}