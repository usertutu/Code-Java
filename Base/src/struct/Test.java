package struct;

public class Test {
    public static void main(String[] args) {
        for (int n=1; n <= 5; n++) {
            for (int j = 5; j >= n; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            for (int j = 1; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
