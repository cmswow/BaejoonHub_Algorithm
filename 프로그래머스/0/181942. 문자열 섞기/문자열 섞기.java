class Solution {
    public String solution(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = Math.min(str1.length(), str2.length());
        
        for (int i = 0; i < length; i++) {
            sb.append(str1.charAt(i));
            sb.append(str2.charAt(i));
        }
        
        // 두 문자열의 길이가 다를 경우 나머지 문자열을 추가
        if (str1.length() > str2.length()) {
            sb.append(str1.substring(length));
        } else if (str1.length() < str2.length()) {
            sb.append(str2.substring(length));
        }
        
        return sb.toString();
    }
}
