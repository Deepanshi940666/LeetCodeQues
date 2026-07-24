class Solution {
    public int romanToInt(String s) {

        int ans = 0;

        int curr = value(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {

            int next = value(s.charAt(i));

            if (next > curr) {
                ans = ans - curr;
            } else {
                ans = ans + curr;
            }

            curr = next;
        }
        ans = ans + curr; 
        return ans;
    }

    public int value(char ch) {

        if (ch == 'I') return 1;
        if (ch == 'V') return 5;
        if (ch == 'X') return 10;
        if (ch == 'L') return 50;
        if (ch == 'C') return 100;
        if (ch == 'D') return 500;
        return 1000;
    }
}