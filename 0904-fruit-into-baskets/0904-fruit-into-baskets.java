class Solution {
    public int totalFruit(int[] fruits) {
        // Basically the quesiton is, in simple terms, 
        // Find the longest subarray containing at most 2 distinct values.
        int n = fruits.length;

        int low = 0;
        int ans = 0;

        Map <Integer, Integer> freq = new HashMap<>();

        for(int high = 0; high < n; high++) {

            // Add the current fruit to the frequency map.
            int currentFruit = fruits[high];
            freq.put(currentFruit, freq.getOrDefault(currentFruit, 0) + 1);

            while (freq.size() > 2) {
                int leftFruit = fruits[low];

                // decrease frequency
                freq.put(leftFruit, freq.get(leftFruit) - 1);

                // remove completely if frequency becomes 0
                if (freq.get(leftFruit) == 0) {
                    freq.remove(leftFruit);
                }

                low++; // move the low pointer.
            }

            ans = Math.max(ans, high - low + 1);

        }

        return ans;
    }
}