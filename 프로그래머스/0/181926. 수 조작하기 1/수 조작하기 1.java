class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        
        for(int x=0;x<control.length();x++){
            char ch = control.charAt(x);
            if(ch == 'w'){
                n += 1;
            }else if(ch == 's'){
                n -= 1;
            }else if(ch == 'd'){
                n += 10;
            }else{
                n -= 10;
            }
        }
        
        answer = n;
        return answer;
    }
}