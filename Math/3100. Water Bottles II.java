class Solution {
    public int maxBottlesDrunk(int numB, int numEx) {
        int count = 0;
        int empty = 0;
        while(numB > 0){
            count = count + numB;
            empty += numB;
            numB = 0;
            while(empty >= numEx){
                empty -= numEx;
                numB = numB + 1;
                numEx++;
            }

        }
        count = count + numB;
        return count ;

    }
}
