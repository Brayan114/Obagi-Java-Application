
public class VarargsExample {
    public static void main(String[] args) {
        printNumbers(1, 2, 3, 4, 5);
    }

    public static void printNumbers(int... numbers) {
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
