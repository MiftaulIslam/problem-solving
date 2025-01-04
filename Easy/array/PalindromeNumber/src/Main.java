class Solution {
    public boolean isPalindrome(int x) {
        int revNumber = 0;
        int originalNumber = x;
        while (x>0){
            revNumber = (revNumber * 10)+(x%10);
            x = x/10;
        }
        return originalNumber == revNumber;
    }
}