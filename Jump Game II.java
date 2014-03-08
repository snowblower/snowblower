public class Solution {
    public int jump(int[] A) {
        int count = 0;
        int len = A.length;
        int i=0;
        int next = 0;
        while(i+A[i]<len-1){
            int m = 0;
            for(int j=1;j<A[i]+1;j++){
                if(A[i+j]==0){
                    continue;
                }
                if(j+A[i+j]>m){
                    next =i+j;
                    m=j+A[i+j];
                }
            }
            count += 1;
            i = next;
            
        }
        if(next==A.length-1){
          return count;
        }
        count++;
        return count;
    }
}