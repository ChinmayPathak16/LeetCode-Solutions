class Solution {
    public int numberOfSpecialChars(String word) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (Character.isLowerCase(ch)) {
                map.put(ch, i); // keeps updating → last index
            } else if (Character.isUpperCase(ch)) {
                if (!map.containsKey(ch)) {
                    map.put(ch, i); // only first occurrence
                }
            }
        }
        int count = 0;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (map.containsKey(ch) && map.containsKey(Character.toUpperCase(ch))) {
                int n = map.get(ch);
                int m = map.get(Character.toUpperCase(ch));
                if (n < m)
                    count++;
            }
        }
        return count;
    }
}
