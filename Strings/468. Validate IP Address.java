class Solution {

    private String checkIPv4(String s) {
        String[] arr = s.split("\\.", -1);

        if (arr.length != 4) {
            return "Neither";
        }

        for (int i = 0; i < arr.length; i++) {

            // Empty part
            if (arr[i].length() == 0) {
                return "Neither";
            }

            // Leading zero
            if (arr[i].length() > 1 && arr[i].charAt(0) == '0') {
                return "Neither";
            }

            try {
                int n = Integer.parseInt(arr[i]);

                if (n < 0 || n > 255) {
                    return "Neither";
                }

            } catch (NumberFormatException e) {
                return "Neither";
            }
        }

        return "IPv4";
    }

    private String checkIPv6(String s) {
        String[] arr = s.split(":", -1);

        if (arr.length != 8) {
            return "Neither";
        }

        for (int i = 0; i < arr.length; i++) {

            // IPv6 group must have 1 to 4 characters
            if (arr[i].length() < 1 || arr[i].length() > 4) {
                return "Neither";
            }

            try {
                Integer.parseInt(arr[i], 16);
            } catch (NumberFormatException e) {
                return "Neither";
            }
        }

        return "IPv6";
    }

    public String validIPAddress(String queryIP) {

        if (queryIP.contains(".") && queryIP.contains(":")) {
            return "Neither";
        }

        if (queryIP.contains(".")) {
            return checkIPv4(queryIP);
        }

        if (queryIP.contains(":")) {
            return checkIPv6(queryIP);
        }

        return "Neither";
    }
}
