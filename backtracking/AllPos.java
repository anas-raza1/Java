public class AllPos {

    static void allAtoZ(int len, String result){
        if(result.length()==len){
            System.out.print(result+" ");
            return;
        }
        for(char alpha = 'A';alpha<='Z';alpha++){
            if(alpha=='A' || alpha=='E' || alpha=='I' || alpha=='O' || alpha=='U'){
                allAtoZ(len, result+alpha);
            }
        }
    }

    public static void main(String[] args) {
        allAtoZ(2, "");
    }
    
}