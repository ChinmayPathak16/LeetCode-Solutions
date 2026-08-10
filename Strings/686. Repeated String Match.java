class Solution {
    public int repeatedStringMatch(String a, String b) {
        String res = "";
        int i = 0;
        while (res.length() < b.length()) {
            res += a;
            i++;
        }
        if (res.contains(b)) {
            return i;
        }
        res += a;
        if (res.contains(b)) {
            return i + 1;
        }
        return -1;
    }
}
