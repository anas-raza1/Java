public class PrintStarRec {
    static void printStar(int line){
         if(line==0){
            return;
        }
        printStar(line-1);
        System.out.print("*");
    }
    
    static void printLine(int line){
        if(line==0){
            return;
        }
        printLine(line-1);
        printStar(line);
        System.out.println();

    }
    public static void main(String[] args) {
        printLine(6);
    }
}