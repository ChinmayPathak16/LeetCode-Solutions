class Solution {
    private void swap(char[] str, int left, int right) {
        while (left < right) {
            char t = str[left];
            str[left] = str[right];
            str[right] = t;
            left++;
            right--;
        }
    }

    public String reverseParentheses(String s) {
        char[] str = s.toCharArray();

        for (int i = 0; i < str.length; i++) {
            if (str[i] == ')') {
                int j = i - 1;

                while (str[j] != '(') {
                    j--;
                }

                swap(str, j+1, i-1);

                str[j] = '#';
                str[i] = '#';
            }
        }

        StringBuilder st = new StringBuilder();

        for (char ch : str) {
            if (ch != '#') {
                st.append(ch);
            }
        }

        return st.toString();
    }
}
