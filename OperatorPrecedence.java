public class OperatorPrecedence {
    public static void main(String[] args) {
        int x;
        
        x = 7 + 3 * 6 / 2 - 1;
        System.out.println("x = " + x); // Output: 15

        x = 2 % 2 + 2 * 2 - 2 / 2;
        System.out.println("x = " + x); // Output: 3

        x = (3 * 9 * (3 + (9 * 3 / (3))));
        System.out.println("x = " + x); // Output: 324
    }
}
