class Solution {
    public boolean isPalindrome(int x) {
        long ans=0;
        int val=x;
        while(val>0){
            int last= val%10;
            val= val/10;
            ans=ans*10+last;
        }
        return ans==x;
    }
}