import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 알파벳 소문자로만 이루어진 단어 S를 입력 받음
        String S = scanner.nextLine();

        // 각 알파벳의 등장 위치를 저장할 배열
        int[] positions = new int[26];

        // 배열 positions의 각 요소를 -1로 초기화
        for (int i = 0; i < positions.length; i++) {
            positions[i] = -1;
        }

        // 단어 S를 순회하며 각 알파벳의 등장 위치를 저장
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            // 알파벳의 아스키 코드에서 'a'의 아스키 코드를 빼서 해당 알파벳의 인덱스를 구함
            int index = ch - 'a';
            // 해당 알파벳이 처음 등장한 위치를 저장 (만약 이미 등장한 알파벳이면 건너뜀)
            if (positions[index] == -1) {
                positions[index] = i;
            }
        }

        // 결과 출력
        for (int i = 0; i < positions.length; i++) {
            System.out.print(positions[i] + " ");
        }
        System.out.println();
    }
}