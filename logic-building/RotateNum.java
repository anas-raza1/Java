public class RotateNum {
    public static void main(String[] args) {
        int num = 12345;
        int rotation = -1;
        int count = 0;
        int cpy = num;
        while (cpy != 0) {
            count++;
            cpy /= 10;
        }
        rotation = rotation % count;
        if (rotation < 0) {
            rotation = rotation + count;
        }
        int pow = (int) Math.pow(10, rotation);
        int lhs = num / pow;
        int rhs = num % pow;
        int pow2 = (int) Math.pow(10, count - rotation);
        int result = rhs * pow2 + lhs;
        System.out.println(num);
        System.out.println(result);

    }
}
