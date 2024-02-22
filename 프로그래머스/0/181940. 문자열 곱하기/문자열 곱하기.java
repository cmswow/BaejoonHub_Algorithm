public class Solution {
    public static String solution(String myString, int k) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < k; i++) {
            result.append(myString);
        }
        return result.toString();
    }
}
