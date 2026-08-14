public class PrintFibbonachi {
    public static void printFib(int a,int b, int n){
        if(n==0){
            return;
        }
        int c = a+b;
        System.out.println(c);
        printFib(b, c, n-1);
    }
    public static void printFib2(int a, int b, int n){
        if(n==0){
            return;
        }
        System.out.println(a);
        int c = a+b;
        a = b;
        b = c;
        printFib2(a, b, n-1);
    }
    public static void main(String[] args) {
        int a=0, b=1;
        System.out.println(a);
        System.out.println(b);
        int n = 7;
        printFib(0, 1, n-2);
        System.out.println();
        printFib2(0, 1, n);
    }
}
