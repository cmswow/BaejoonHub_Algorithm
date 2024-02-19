import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); // 문자열 입력 받기
        
        // 입력 받은 문자열을 각 문자마다 한 줄에 하나씩 출력
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        
        sc.close();
    }
}