import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Long A = sc.nextLong();
        Long B = sc.nextLong();

        if (A>B) {
            System.out.println(">");
        } else if (A<B) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }

    }
}