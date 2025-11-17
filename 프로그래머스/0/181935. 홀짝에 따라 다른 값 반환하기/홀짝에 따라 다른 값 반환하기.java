class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean oddNumFlag = n % 2 != 0;

        for (int x = 1; x <= n; x++) {
            if (oddNumFlag) { 
                if (x % 2 != 0) { 
                    answer += x;
                }
            } else { 
                if (x % 2 == 0) { 
                    answer += x * x;
                }
            }
        }
        
        return answer;
    }
}