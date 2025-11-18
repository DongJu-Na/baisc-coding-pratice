class Solution {
    public int solution(String ineq, String eq, int n, int m) {
     String op = ineq + eq;
    boolean result;
        
        switch (op) {
            case ">=":
                result = n >= m;
                break;
            case "<=":
                result = n <= m;
                break;
            case ">!":
                result = n > m;
                break;
            case "<!":
                result = n < m;
                break;
            default:
                result = false;
        }

        return result ? 1 : 0;
    }
}