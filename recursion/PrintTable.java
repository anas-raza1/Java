import java.util.Scanner;

public class PrintTable{
    static void printTable(int num, int val){
        //base case
        if(val == 0){
            return;
        }
        //small problem
        printTable(num, val-1);
        //stack fall
        System.out.println(num+"*"+val+"="+(num*val));
    }

    static String printTable2(int num, int val){
        if(val == 0){
            return "";
        }
        String result = printTable2(num, val-1);
        String expression = num+"*"+val+"="+(num*val)+"\n";
        return result +expression;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the table you want to print");
        int num = scan.nextInt();
        printTable(num, 10);
        String table = printTable2(num, 10);
        System.out.println(table);
    }
}