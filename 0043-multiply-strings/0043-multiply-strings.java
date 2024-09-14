class Solution {
    public String multiply(String num1, String num2) {

        if (num1.equals("0") || num2.equals("0")) {
            return "0"; // Early exit if any number is zero
        }

        int len1 = num1.length();
        int len2 = num2.length();
        int[] result = new int[len1 + len2]; // Maximum possible length of the result
        
        // Multiply each digit from the two numbers
        for (int i = len1 - 1; i >= 0; i--) {
            int digit1 = num1.charAt(i) - '0';
            for (int j = len2 - 1; j >= 0; j--) {
                int digit2 = num2.charAt(j) - '0';
                int mul = digit1 * digit2;
                int sum = mul + result[i + j + 1]; // Add the product to the current position
                
                result[i + j + 1] = sum % 10; // Store the unit digit
                result[i + j] += sum / 10;     // Carry over the tens digit
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            if (!(sb.length() == 0 && num == 0)) { // Skip leading zeros
                sb.append(num);
            }
        }

        return sb.toString();
        
    }
}