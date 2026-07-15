public class PowerOutput{

    static void powerOutput(int num, int power, int result){
        if(power==0){
            System.out.println(result);
            return;
        }
        powerOutput(num, power-1,num*result);
    }

    static int powerOutput(int num, int power){
        if(power==1){
            return num;
        }
        int result= powerOutput(num, power-1);
        return result*num;
    }

    public static void main(String[] args) {
        powerOutput(2,5,1);
        int result = powerOutput(2, 5);
        System.out.println(result);
    }
}