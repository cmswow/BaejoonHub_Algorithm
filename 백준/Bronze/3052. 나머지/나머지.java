import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int[] A = new int[10];

        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }

        Set<Integer> answer = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
             answer.add(A[i]%42);
        }

        System.out.println(answer.size());






        



    }
}