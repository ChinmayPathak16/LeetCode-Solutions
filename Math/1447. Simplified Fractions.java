class Solution {
    public List<String> simplifiedFractions(int n) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (gcd(i, j) == 1) {
                    sb.append(i);
                    sb.append("/");
                    sb.append(j);
                    list.add(sb.toString());
                    sb.setLength(0);
                }
            }
        }
        return list;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
}
