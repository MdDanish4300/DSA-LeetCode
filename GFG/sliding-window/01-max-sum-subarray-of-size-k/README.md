# Maximum Sum Subarray of Size K

- **Platform:** GeeksforGeeks
- **Difficulty:** Easy
- **Pattern:** Sliding Window
- **Type:** Fixed Size Sliding Window

## Problem

Given an array of integers `arr[]` and an integer `k`, find the maximum sum of a subarray of size `k`.

A subarray is a contiguous part of an array.

## Approach

1. Calculate the sum of the first `k` elements.
2. Store it as the initial maximum sum.
3. Slide the window one element at a time.
4. Remove the element leaving the window.
5. Add the new element entering the window.
6. Update the maximum sum.

The key Sliding Window operation is:

`windowSum = windowSum + arr[i] - arr[i - k]`

**Time Complexity:** O(n)

**Space Complexity:** O(1)
