public class PowerOutput {

    static void powerOutput(int num, int power, int result) {
        if (power == 0) {
            System.out.println(result);
            return;
        }
        powerOutput(num, power - 1, num * result);
    }

    static int powerOutput(int num, int power) {
        if (power == 1) {
            return num;
        }
        int result = powerOutput(num, power - 1);
        return result * num;
    }

    static int calcPower(int num, int power) {
        if (power == 0) {
            return 1;
        }
        if (num == 0) {
            return 0;
        }
        // power is even
        if (power % 2 == 0) {
            return calcPower(num, power / 2) * calcPower(num, power / 2);
        } // power is odd
        else {
            return calcPower(num, power / 2) * calcPower(num, power / 2) * num;
        }
    }

    public static void main(String[] args) {
        powerOutput(2, 5, 1);
        int result = powerOutput(2, 4);
        System.out.println(result);
        int ans = calcPower(2, 4);
        System.out.println(ans);
    }
}