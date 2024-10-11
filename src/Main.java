import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = arr[1]; i < arr.length; i++)
            arr[i] = i + 1;

        System.out.println(Arrays.toString(arr));
    }
}