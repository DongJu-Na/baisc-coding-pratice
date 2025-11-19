class Solution {
    public String solution(String code) {
        String answer = "";
          int mode = 0;
StringBuilder ret = new StringBuilder();
        
          for (int i = 0; i < code.length(); i++) {
            char ch = code.charAt(i);

            if (ch == '1') {
                // mode 토글
                mode = 1 - mode;
            } else {
                if (mode == 0 && i % 2 == 0) {
                    ret.append(ch);
                } else if (mode == 1 && i % 2 == 1) {
                    ret.append(ch);
                }
            }
        }
        
        answer = ret.length() == 0 ? "EMPTY" : ret.toString();
        
        return answer;
    }
}