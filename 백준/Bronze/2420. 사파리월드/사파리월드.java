import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Long N = scan.nextLong();
        Long M = scan.nextLong();

        System.out.println(Math.abs(N-M));

        

    }
}