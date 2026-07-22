public class PrintAdjacentStar {
    static String printStar(String str){
        if(str.length()<=1){
            return str;
        }
        if(str.charAt(0)==str.charAt(1)){
            return str.charAt(0)+ "*" +printStar(str.substring(1));
        }
        else{
        return str.charAt(0)+ printStar(str.substring(1));
        }
    }
    public static void main(String[] args) {
        System.out.println(printStar("aabb"));
    }
}