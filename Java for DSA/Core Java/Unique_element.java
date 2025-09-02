import java.io.IOException;

public class Unique_element {
	public static void main(String[] args) throws IOException {
        int[] arr = {2, 3, 3, 6, 6, 9};
        int unq = 0;
        for (int number : arr) unq ^= number;
        System.out.println(unq);
	}
}
