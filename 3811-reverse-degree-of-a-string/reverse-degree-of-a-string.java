class Solution {
    public int reverseDegree(String s) {
        int ans=0;
        for(int i=0; i<s.length();i++){
            int value = (int)s.charAt(i);
            ans+=((123-value)*(i+1));
        }
        return ans;
        // System.out.println(ans);
    }
}