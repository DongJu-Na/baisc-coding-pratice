class Solution {
    public int solution(String number) {
        int answer = 0;
        
        for(int x=0;x<number.length();x++){
             answer += Integer.parseInt(number.charAt(x) + "");
        }
        
        answer = answer % 9;
        
        return answer;
    }
}