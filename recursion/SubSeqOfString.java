public class SubSeqOfString {

    static void subSeqOfString(String str, String result){
        if(str.length()==0){
            System.out.print(result+" ,");
            return;
        }
        //not take it
        subSeqOfString(str.substring(1), result);
        //take it
        subSeqOfString(str.substring(1), result+str.charAt(0));
    }
    // Alternate method
    public static void printSubseq(String str, int indx, String newStr){
        if(str.length()==indx){
            System.out.print(newStr+", ");
            return;
        }
        char currChar = str.charAt(indx);
        // not to be
        printSubseq(str, indx+1, newStr);
         //to be
        printSubseq(str, indx+1, newStr+currChar);
    }
    public static void main(String[] args) {
        String str = "abc";
        subSeqOfString(str, " ");
        System.out.println();
        System.out.println("alternate method");
        printSubseq(str, 0, "");
    }
}