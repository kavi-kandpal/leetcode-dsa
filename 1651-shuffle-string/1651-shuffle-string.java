class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuffer sb= new StringBuffer(s);
        for(int i=0;i<s.length();i++){
            sb.setCharAt(indices[i],s.charAt(i));
        }
        return sb.toString();
    }
}