
public class EvenOdd {

    public static String check(int n) {
        if (n % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        int n = 10;

        if (args.length > 0) {
            n = Integer.parseInt(args[0]);
        }

        System.out.println(n + " is " + check(n));
    }
}
