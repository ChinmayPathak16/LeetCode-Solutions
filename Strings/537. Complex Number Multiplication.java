class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        String[] a = num1.split("\\+");
        String[] b = num2.split("\\+");

        int real1 = Integer.parseInt(a[0]);
        int imag1 = Integer.parseInt(a[1].substring(0, a[1].length() - 1));

        int real2 = Integer.parseInt(b[0]);
        int imag2 = Integer.parseInt(b[1].substring(0, b[1].length() - 1));

        int real = real1 * real2 - imag1 * imag2;
        int imag = real1 * imag2 + imag1 * real2;

        return real + "+" + imag + "i";
    }
}
