class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        int len = Math.min(str1.length(), str2.length());
        StringBuilder sb = new StringBuilder(str1.length() + str2.length());

        for (int i = 0; i < len; i++) {
            sb.append(str1.charAt(i))
              .append(str2.charAt(i));
        }
        answer = sb.toString();
        
        return answer;
    }
}