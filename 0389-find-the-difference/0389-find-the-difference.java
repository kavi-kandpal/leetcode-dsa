class Solution {
    public char findTheDifference(String s, String t) {
    char v[]=t.toCharArray();
    char x[]=s.toCharArray();
Arrays.sort(v);
Arrays.sort(x);
        for(int i=0;i<s.length();i++){
            if(v[i]!=x[i]){
                return v[i];
            }
        }
        return v[t.length()-1];
    }
}