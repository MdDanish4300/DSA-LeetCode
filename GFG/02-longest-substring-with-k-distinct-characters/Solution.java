class Solution {
    public int longestKSubstr(String s, int k) {
        int n = s.length();
        
        int low = 0;
        int res = -1;
        
        // Created a HashMap.
        Map <Character, Integer> freq = new HashMap<>();
        
        for(int high = 0; high < n; high++) {
            
            // Add current character to the window
            char ch = s.charAt(high);
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
            
            // Shrink window if distinct characters > k
            while (freq.size() > k) {
                char leftChar = s.charAt(low);
                
                freq.put(leftChar, freq.get(leftChar) - 1 );
                
                // Remove character completely if its frequency becomes 0
                if (freq.get(leftChar) == 0) {
                    freq.remove(leftChar);
                }
                
                low++;
            }
            
            if (freq.size() == k) {
                res = Math.max(res, high - low + 1);
            }
        }
        
        return res;

    }
}
