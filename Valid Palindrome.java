public class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        if(len==0){return true;}
        s=s.toLowerCase();
        for(int i=0;i<len;i++){
            if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
                sb.append(s.charAt(i));
            }
            if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
                sb.append(s.charAt(i));
            }
        }
        return check(sb.toString());
    }
    
    public boolean check(String s){
        int len=s.length();
        int begin = 0;
        int end = len-1;
        while(begin<end){
            if(s.charAt(begin++)!=s.charAt(end--)) return false;
        }
        return true;
    }
}