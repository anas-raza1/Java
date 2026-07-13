public class RevHollowPyramid {
    public static void main(String[] args) {
        int range = 5;
        for(int row = 0; row <range; row++){
            for(int col= 0; col<row;col++){
                System.out.print(" ");
            }
            for(int col = 0;col<2*range-2*row-1;col++){
                if(col==0 || row == 0 || col==2*range-2*row-2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
