public class HiReplaceWithHello{
    static String hiHello(String str){
        if(str.length()<=1){
            return str;
        }
        if(str.charAt(0)=='h' && str.charAt(1)=='i'){
            String smallString = str.substring(2);
            String result = hiHello(smallString);
            return "hello"+ result;
        }
        else{
            String smalString = str.substring(1);
            String result = hiHello(smalString);
            char firstChar = str.charAt(0);
            return firstChar+result;
        }
    }
    public static void main(String[] args) {
        String str = "hi anas hi raza";
        System.out.println(hiHello(str));
    }
}