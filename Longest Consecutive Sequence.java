public class Solution {
    public int longestConsecutive(int[] num) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i : num){set.add(i);}
        int result = 0;
        for(int i:num){
            if(set.contains(i-1)) continue;
            int l =1, x =i;
            while(set.contains(x+1)){
                l++;
                x++;
            }
            result = Math.max(result,l);
        }
        return result;
    }
}