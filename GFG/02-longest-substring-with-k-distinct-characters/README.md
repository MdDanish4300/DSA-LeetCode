# Longest Substring with K Distinct Characters

- Platform: GeeksforGeeks
- Difficulty: Medium
- Pattern: Sliding Window
- Type: Variable Size Sliding Window

## Problem

Given a string `s` and an integer `k`, find the length of the longest substring that contains exactly `k` distinct characters.

If there is no such substring, return `-1`.

## Approach

1. Use two pointers `low` and `high` to maintain a variable-size window.
2. Use a `HashMap` to store the frequency of each character in the current window.
3. Move `high` to expand the window and add characters to the map.
4. If the number of distinct characters becomes greater than `k`, move `low` forward to shrink the window.
5. Remove a character from the map when its frequency becomes `0`.
6. When the window contains exactly `k` distinct characters, update the maximum length.

## Complexity

- Time Complexity: O(n)
- Space Complexity: O(k)
