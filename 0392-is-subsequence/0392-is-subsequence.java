class Solution {
    public boolean isSubsequence(String s, String t) {
        int a=s.length();
        int b=t.length();
        int count=0;
        if(a==0){
            return true;
        }
        if(b==0){
            return false;
        }
        int i=0;int j=0;
while(i<s.length() && j<t.length()){
    
        if(s.charAt(i)==t.charAt(j)){
            count=count+1;
    j++;
        i++;
        }
        else{
j++;
        }
   
}

if(count==s.length()){
    return true;
}
return false;
    }
}