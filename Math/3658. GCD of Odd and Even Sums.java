class Solution {
    private int gcd(int a, int b) {
        while(b != 0) {
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }

    public int gcdOfOddEvenSums(int n) {
        int even = 0;
        int ele = 0;
        for(int i=0; i<n; i++) {
            ele += 2;
            even += ele;
        }

        int odd = 0;
        ele = -1;
        for (int i=0; i<n; i++) {
            ele += 2;
            odd += ele;
        }

        return gcd(even,odd);
    }
}
