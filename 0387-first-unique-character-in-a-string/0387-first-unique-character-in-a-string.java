class Solution {
    public int firstUniqChar(String s) {

        int n = s.length();

        // Firstly created the HashMap.
        Map <Character, Integer> map = new HashMap<>();
       
        // Count the frequency of each characters in the string.
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Find the first character with the frequency 1.
        for(int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (map.get(ch) == 1) {
                return i;
            }
        }

        return -1;
    }
}