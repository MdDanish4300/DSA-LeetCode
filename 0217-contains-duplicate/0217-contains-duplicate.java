class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Store the elements we have already encountered.
        // HashSet automatically maintains unique elements 
        HashSet <Integer> set = new HashSet<>();
       
        // Traversing the array one elementt at a time
        for(int num : nums) {

            // If the current element is already in the set,
            // we have encounterd this element before.
            if (set.contains(num)) {
                return true; // A duplicate exists
            }
            
            // If the element is appearing for the first time.
            // Store it so we can detect if it appears again.
            set.add(num);
        }

        // We traversed the entire array without finding the duplicates.
        return false;
    }
}