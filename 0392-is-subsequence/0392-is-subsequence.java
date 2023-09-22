class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0){
            return true;
        }
        int j=0;
        int i=0;
        int count=0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
                count++;
                
            }
            else{
            j++;
            }
                    }
            if(i==s.length()){
                return true;
            }
            return false;
    }
}