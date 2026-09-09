class Solution {
    public int maxNumberOfBalloons(String text) {
        Map <Character, Integer> map = new HashMap<>();

        // Count the frequency of each character in text.
        for(int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // l and o are needed twice for every ballon.
        int b = map.getOrDefault('b', 0);
        int a = map.getOrDefault('a', 0);
        int l = map.getOrDefault('l', 0) / 2;
        int o = map.getOrDefault('o', 0) / 2;
        int n = map.getOrDefault('n', 0);

        // The character with the smallest available count limits the answer
        return Math.min(
            Math.min(b, a),
            Math.min(Math.min(l,o), n)
        );
    }
}