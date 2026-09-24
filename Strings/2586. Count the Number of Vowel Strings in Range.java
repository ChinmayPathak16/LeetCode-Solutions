class Solution {
    private boolean checkVowelString(String s){
        String set = "aeiou";
        if(set.contains("" + s.charAt(0)) && set.contains("" + s.charAt(s.length() - 1)))
            return true;

        return false;
    }
    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        for(int i=left; i<=right; i++){
            if(checkVowelString(words[i])){
                count++;
            }
        }
        return count;
    }
}
