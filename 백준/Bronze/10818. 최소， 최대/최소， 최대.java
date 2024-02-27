import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            int M = in.nextInt();

            max = Math.max(max, M);
            min = Math.min(min, M);
            }

        System.out.println(min+ " " +max);


        }


    }
