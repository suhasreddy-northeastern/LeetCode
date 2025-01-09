class Solution {
    public int mySqrt(int x) {
        // Handle the edge case where x is 0 or 1
        if (x < 2) {
            return x; // The square root of 0 is 0 and of 1 is 1
        }

        // Initialize the search range
        int left = 2; // Start searching from 2, since we already handled 0 and 1
        int right = x / 2; // The square root of x cannot be more than x/2 for x >= 2

        // Perform binary search
        while (left <= right) {
            int mid = left + (right - left) / 2; // Calculate mid to avoid overflow

            // Calculate mid squared
            long midSquared = (long) mid * mid; // Use long to prevent overflow

            if (midSquared == x) {
                return mid; // Found the exact square root
            } else if (midSquared < x) {
                left = mid + 1; // Move the left boundary up
            } else {
                right = mid - 1; // Move the right boundary down
            }
        }

        // When the loop ends, right is the largest integer whose square is less than x
        return right; // Return the integer square root
    }
}
