import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
        
        long sum = Arrays.stream(num_list).asLongStream().sum(); 
        long product = Arrays.stream(num_list).asLongStream().reduce(1L, (a, b) -> a * b); 
        
        
        return product < sum * sum ? 1 : 0;
    }
}