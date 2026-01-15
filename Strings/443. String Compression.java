class Solution {
    public int compress(char[] chars) {

        // StringBuilder to build the compressed result
        StringBuilder sb = new StringBuilder();

        // Add the first character as starting point
        sb.append(chars[0]);

        // cur = current character we are counting
        char cur = chars[0];

        // count = frequency of current character
        int count = 1;

        // Traverse from 2nd character till end
        for (int i = 1; i < chars.length; i++) {

            // If same as current character, increase count
            if (cur == chars[i]) {
                count++;
            } 
            // If character changes
            else {
                // If count > 1, append count (compressed form)
                if (count > 1) sb.append(count);

                // Append the new character
                sb.append(chars[i]);

                // Update current character and reset count
                cur = chars[i];
                count = 1;
            }
        }

        // Append last character count if > 1
        if (count > 1) sb.append(count);

        // Copy compressed string back into the original char array
        for (int i = 0; i < sb.length(); i++) {
            chars[i] = sb.charAt(i);
        }

        // Return length of compressed array
        return sb.length();
    }
}
