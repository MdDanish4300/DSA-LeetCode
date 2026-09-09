class Solution {
    public int longestPalindrome(String s) {

        HashMap<Character, Integer> f = new HashMap<>();

        // Count the frequency of each character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            f.put(ch, f.getOrDefault(ch, 0) + 1);
        }

        boolean odd = false;
        int res = 0;

        // Use all pairs; keep one character aside if count is odd
        for (Map.Entry<Character, Integer> entry : f.entrySet()) {

            int val = entry.getValue();

            if (val % 2 == 0) {
                res += val;
            } 
            else {
                res += val - 1;
                odd = true;
            }
        }

        // One odd character can be placed in the middle
        if (odd == false) {
            return res;
        }

        return res + 1;
    }
}