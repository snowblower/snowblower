//back track
public class Solution {
    public ArrayList<ArrayList<Integer>> subsetsWithDup(int[] num) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        Arrays.sort(num);
        //ArrayList<Integer> curr = new ArrayList<Integer>()
        if(num.length==0) return result;
        ArrayList<Integer> path = new ArrayList<Integer>();
        helper(result,path,num,0);
        return result;
    }
    
    public void helper(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> path,int[] num,int index){
        ArrayList<Integer> curr = new ArrayList<Integer>(path);
        result.add(curr);
        //if(index== num.length) return;
        for(int i=index;i<num.length;i++){
            if(i>index && num[i]==num[i-1]) continue;
            path.add(num[i]);
            helper(result,path,num,i+1);
            path.remove(path.size()-1);
        }
    }
}