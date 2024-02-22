class Solution {
    public int solution(int a, int b) {
        String ab = Integer.toString(a) + Integer.toString(b);
        int prod = 2 * a * b;
        
        if (Integer.parseInt(ab) >= prod) {
            return Integer.parseInt(ab);
        } else {
            return prod;
        }
    }
}