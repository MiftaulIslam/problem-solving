class Solution {
    public int reverse(int x) {
        int reverseNumber = 0;
        while (x != 0) {
            int singleDigit = x % 10;
            int newreverseNumber = reverseNumber * 10 + singleDigit;
            // Check for overflow or underflow
            if ((newreverseNumber - singleDigit) / 10 != reverseNumber) {
                return 0;
            }
            reverseNumber = newreverseNumber;
            x = x / 10;
        }
        return reverseNumber;
    }
}