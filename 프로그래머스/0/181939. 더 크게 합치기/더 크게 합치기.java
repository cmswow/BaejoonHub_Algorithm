class Solution {
    public int solution(int a, int b) {

       String result1 = Integer.toString(a)+Integer.toString(b);
       String result2 = Integer.toString(b)+Integer.toString(a);

       if (Integer.parseInt(result1)>Integer.parseInt(result2)){
           return Integer.parseInt(result1);
       } else if (Integer.parseInt(result2)>Integer.parseInt(result1)) {
           return Integer.parseInt(result2);
       } else return Integer.parseInt(result1);

    }
}