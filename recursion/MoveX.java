public class MoveX {
    public static void moveX(String str, String newStr, int index, int count) {
        // base case
        if (index == str.length()) {
            for (int i = 0; i < count; i++) {
                newStr += 'x';
            }
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(index);
        // recursive call
        if (currChar == 'x') {
            count++;
            moveX(str, newStr, index + 1, count);
        } else {
            newStr += currChar;
            moveX(str, newStr, index + 1, count);
        }
    }

    public static void main(String[] args) {
        String str = "acbxxcdx";
        moveX(str, "", 0, 0);
    }
}
