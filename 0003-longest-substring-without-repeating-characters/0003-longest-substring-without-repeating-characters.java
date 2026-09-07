class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();

        int low = 0;
        int ans = 0;

        Set <Character> set = new HashSet<>();

        for (int high = 0; high < n; high++) {

            char currentChar = s.charAt(high);     

            // If duplicate, shrink the window
            while(set.contains(currentChar)) {
                char leftChar = s.charAt(low);

                set.remove(leftChar);

                low++;
            }
            
            // Add current character
            set.add(currentChar);

            // Update maximum length
            ans = Math.max(ans, high - low + 1);
        }

        return ans;
    }
}