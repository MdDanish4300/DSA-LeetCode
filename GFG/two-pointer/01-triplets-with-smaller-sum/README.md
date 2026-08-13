# Triplets With Smaller Sum

- **Platform:** GeeksforGeeks
- **Difficulty:** Medium
- **Pattern:** Two Pointers

## Approach

1. Sort the array.
2. Fix one element.
3. Use two pointers for the remaining elements.
4. If the current sum is smaller than the target, count `(k - j)` valid triplets and move `j`.
5. Otherwise, move `k` to decrease the sum.

**Time Complexity:** O(n²)

**Space Complexity:** O(1)
