public class FirstAndLastOccurance {
    public static int first = -1;
    public static int last = -1;

    static void findOccurance(String str, char element, int index) {
        if (index == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = str.charAt(index);
        if (currChar == element) {
            if (first == -1) {
                first = index;
            } else {
                last = index;
            }
        }
        findOccurance(str, element, index + 1);
    }

    public static void main(String[] args) {
        String str = "baaabfasha";
        findOccurance(str, 'a', 0);
    }
}
