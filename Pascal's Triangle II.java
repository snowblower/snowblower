public class Solution {
    public ArrayList<Integer> getRow(int rowIndex) {
        ArrayList<Integer> start = new ArrayList<Integer>();
        if(rowIndex<0){return start;}
        start.add(1);
        for(int i=1;i<rowIndex+1;i++){
            ArrayList<Integer> curr = new ArrayList<Integer>();
            for(int j=0;j<i+1;j++){
                if(j==0||j==i){curr.add(1);}
                else{
                    curr.add(start.get(j-1)+start.get(j));
                }
            }
            start =curr;
        }
        return start;
    }
}