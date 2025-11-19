class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int term = a;  
        
        for(int x=0; x<included.length;x++){
            if(included[x]){
                answer += term;
            }
            
            term += d;
        }
        
        return answer;
    }
}