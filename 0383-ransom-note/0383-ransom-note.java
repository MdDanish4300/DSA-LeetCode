class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        // Firstly, created HashMap.
        Map <Character, Integer> need = new HashMap<>();
        Map <Character, Integer> have = new HashMap<>();

        // Store the frequency of characters required by ransomNote
        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);

            need.put(ch, need.getOrDefault(ch, 0) + 1);
        }
        
        // Store the frequency of characters available in magazine
        for (int i = 0; i < magazine.length(); i++) {
            char ch = magazine.charAt(i);

            have.put(ch, have.getOrDefault(ch, 0) + 1);
        }

        // Compare each characters with available characters.
        for (Map.Entry<Character, Integer> entry : need.entrySet()) {
            char ch = entry.getKey();
            int required = entry.getValue();

            if (!have.containsKey(ch) || have.get(ch) < required) {
                return false;
            }
        }

        return true;
    }
}