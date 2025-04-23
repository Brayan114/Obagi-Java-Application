
import java.util.Arrays;

public class FillExample {
    public static void main(String[] args) {
        int[] filled = new int[5];
        Arrays.fill(filled, 7);
        System.out.println("Filled array: " + Arrays.toString(filled));
    }
}
