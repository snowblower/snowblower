public class Solution {
    public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
        if(triangle.size()==0){
            return 0;
        }
        for(int i=triangle.size()-2;i>=0;i--){
            ArrayList<Integer> list =triangle.get(i);
            for(int j=0;j<triangle.get(i).size();j++){
                list.set(j,list.get(j)+Math.min(triangle.get(i+1).get(j),
                triangle.get(i+1).get(j+1)));
            }
        }
        return triangle.get(0).get(0);
    }
}