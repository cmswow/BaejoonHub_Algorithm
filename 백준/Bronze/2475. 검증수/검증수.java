import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] unique = new int[5];

        for (int i = 0; i < 5; i++) {
            int n = in.nextInt();
            unique[i] = n*n;
        }
        int answer =0;
        for (int i = 0; i < 5; i++) {
            answer += unique[i];
        }
       
        System.out.println(answer%10);



    }
}