import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();
        sc.nextLine(); // 개행 문자 처리

        for (int t = 0; t < testCase; t++) {
            String answer = sc.nextLine();
            int score = 0;
            int consecutive = 0;

            for (int i = 0; i < answer.length(); i++) {
                if (answer.charAt(i) == 'O') {
                    consecutive++;
                    score += consecutive;
                } else {
                    consecutive = 0;
                }
            }

            System.out.println(score);
        }
    }
}