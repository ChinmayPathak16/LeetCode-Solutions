class Solution {
    public int sumFourDivisors(int[] nums) {
        int ans = 0; // final answer: sum of divisors of numbers having exactly 4 divisors
        // iterate over each number in the array
        for (int num : nums) {
            int count = 0; // count of divisors
            int sum = 0;   // sum of divisors
            // check divisors only up to sqrt(num)
            for (int d = 1; d * d <= num; d++) {
                // if d is a divisor
                if (num % d == 0) {
                    int other = num / d; // paired divisor
                    // if both divisors are same (perfect square)
                    if (d == other) {
                        count++;        // count only once
                        sum += d;       // add once
                    } else {
                        count += 2;     // count both d and other
                        sum += d + other;
                    }
                    // no need to continue if divisors exceed 4
                    if (count > 4) break;
                }
            }
            // add sum only if the number has exactly 4 divisors
            if (count == 4) ans += sum;
        }
        return ans; // return total sum
    }
}
