public class GCD {
    public static void main(String[] args) {
        int a = 24;
        int b = 36;
        int min = a > b ? b : a;
        while (min > 0) {
            if (a % min == 0 && b % min == 0) {
                System.out.println("GCD " + min);
                break;
            }
            min--;
        }
        // division method
        int c = 24;
        int d = 36;
        while (c % d != 0) {
            int rem = c % d;
            c = d;
            d = rem;
        }
        System.out.println("GCD by division method " + d);

        // subtraction method
        int e = 24;
        int f = 36;
        while (e != f) {
            if (e > f) {
                e = e - f;
            } else {
                f = f - e;
            }
        }
        System.out.println("GCD by subtraction methot e =" + e + " f = " + f);
    }
}
