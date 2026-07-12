public class SwitchCase {

    static int getPrice() {
        String f3 = "momo";
        int price = switch (f3) {
            case "burger", "roll" -> {
                System.out.println("burger");
                yield 60;
            }
            case "pizza" -> {
                System.out.println("pizza");
                System.out.println("veg pizza");
                System.out.println("non-veg pizza");
                yield 69;
            }
            case "momo" -> {
                System.out.println("momo");
                yield 80;
            }
            default -> {
                System.out.println("nothing");
                yield 0;
            }
        };
        return price;
    }

    public static void main(String[] args) {
        // by call
        int e = getPrice();
        System.out.println(e);
        // int switch case
        int item = 3;
        switch (item) {
            case 1:
                System.out.println("burger");
                break;
            case 2:
                System.out.println("pizza");
                break;
            case 3:
                System.out.println("momo");
                break;
            default:
                System.out.println("nothing");
                break;
        }
        // final name burger used
        final int burger = 1;
        final int pizza = 2;
        final int momo = 3;
        switch (item) {
            case burger:
                System.out.println("burger price 30");
                break;
            case pizza:
                System.out.println("pizza price 69");
                break;
            case momo:
                System.out.println("momo price 80");
                break;
            default:
                System.out.println("nothing");
                break;
        }
        // string swtich case
        String food = "burger";
        switch (food) {
            case "burger":
                System.out.println("burger");
                break;
            case "pizza":
                System.out.println("pizza");
                break;
            case "momo":
                System.out.println("momo");
                break;
            default:
                System.out.println("nothing");
                break;
        }
        // Arrow switch case
        String itemf = "pizza";
        switch (itemf) {
            case "burger", "roll" ->
                System.out.println("burger");
            case "pizza" -> {
                System.out.println("pizza");
                System.out.println("veg pizza");
                System.out.println("non-veg pizza");
            }
            case "momo" ->
                System.out.println("momo");
            default ->
                System.out.println("nothing");
        }
        // printing swtichcase return
        String f2 = "roll";
        int result = switch (f2) {
            case "roll" -> 60;
            case "pizza" -> 69;
            case "momo" -> 80;
            default -> 0;
        };
        System.out.println(result);

    }
}
