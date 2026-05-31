class Solution {
    public boolean asteroidsDestroyed(int mass, int[] ast) {
        Arrays.sort(ast);
        long Mass = mass;
        for(int i = 0; i < ast.length; i++){
            if(Mass < ast[i])   return false;
            Mass += ast[i];
        }

        return true;
    }
}
