import java.util.Random;

public class DotProductArrays {
    public static void main(String[] args) {
        int n = 5;
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];

        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = rand.nextInt(10);
            b[i] = rand.nextInt(10);
        }
        for (int i = 0; i < n; i++) {
            c[i] = a[i] * b[i];
        }

        System.out.print("Array a: ");
        printArray(a);
        System.out.print("Array b: ");
        printArray(b);
        System.out.print("Array c (dot product): ");
        printArray(c);
    }

    public static void printArray(int[] arr) {
        for (int v : arr) System.out.print(v + " ");
        System.out.println();
    }
}
