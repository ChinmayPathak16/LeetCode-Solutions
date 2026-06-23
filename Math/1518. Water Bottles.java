class Solution {
    public int numWaterBottles(int numB, int numEx) {
        int count = 0;
        int empty = 0;

        while (numB > 0) {
            count += numB;
            empty += numB;

            numB = empty / numEx;
            empty = empty % numEx;
        }
        return count;
    }
}
