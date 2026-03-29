class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        for (String s : path.split("/")) {
            if (s.equals("") || s.equals(".")) continue;
            if (s.equals("..")) {
                if (!st.isEmpty()) st.pop();
            } else {
                st.push(s);
            }
        }
        StringBuilder res = new StringBuilder();
        for (String dir : st) {
            res.append("/").append(dir);
        }
        return res.length() == 0 ? "/" : res.toString();
    }
}
