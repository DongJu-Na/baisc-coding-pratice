import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int len = num_list.length;

        int last = num_list[len - 1];    
        int prev = num_list[len - 2];    

        int add = (last > prev) ? (last - prev) : (last * 2);

        int[] answer = Arrays.copyOf(num_list, len + 1); 
        answer[len] = add;  

        return answer;
    }
}