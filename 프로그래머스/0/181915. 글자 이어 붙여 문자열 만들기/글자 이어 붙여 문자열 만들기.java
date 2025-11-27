class Solution {
    public String solution(String my_string, int[] index_list) {
        StringBuilder sb = new StringBuilder();
        for(int x=0;x<index_list.length;x++){
             sb.append(my_string.charAt(index_list[x]));
        }
            
        return  sb.toString();
    }
}