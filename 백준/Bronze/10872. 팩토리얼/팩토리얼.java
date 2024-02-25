import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int factorial = 1;

        for (int i = 1; i <= N; i++) {
            factorial *= i;
        }

        System.out.println(factorial);
    }
}
