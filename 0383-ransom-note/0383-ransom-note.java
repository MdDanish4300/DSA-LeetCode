class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> have = new HashMap<>();

        // Store frequency of characters required by ransomNote
        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);

            need.put(ch, need.getOrDefault(ch, 0) + 1);
        }

        // Store frequency of characters available in magazine
        for (int i = 0; i < magazine.length(); i++) {
            char ch = magazine.charAt(i);
            
            have.put(ch, have.getOrDefault(ch, 0) + 1);
        }

        // Check whether magazine has enough of every required character
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