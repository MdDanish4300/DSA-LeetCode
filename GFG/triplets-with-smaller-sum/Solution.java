class Solution {
    int countTriplets(int sum, int arr[]) {

        Arrays.sort(arr);

        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n - 2; i++) {

            int j = i + 1;
            int k = n - 1;

            while (j < k) {

                int sum2 = arr[i] + arr[j] + arr[k];

                if (sum2 < sum) {

                    // All elements from j+1 to k also form valid triplets
                    count += (k - j);

                    // Move left pointer
                    j++;

                } else {

                    // Sum is too large, decrease it
                    k--;
                }
            }
        }

        return count;
    }
}
