import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int accumulator = 0;
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            char nextChar = (i + 1 < s.length()) ? s.charAt(i + 1) : ' ';
            if (currentChar == 'I' && nextChar == 'V') {
                accumulator += 4;
                i++; // Skip the next character 'V'
            } else if (currentChar == 'I' && nextChar == 'X') {
                accumulator += 9;
                i++; // Skip the next character 'X'
            } else if (currentChar == 'X' && nextChar == 'L') {
                accumulator += 40;
                i++; // Skip the next character 'L'
            } else if (currentChar == 'X' && nextChar == 'C') {
                accumulator += 90;
                i++; // Skip the next character 'C'
            } else if (currentChar == 'C' && nextChar == 'D') {
                accumulator += 400;
                i++; // Skip the next character 'D'
            } else if (currentChar == 'C' && nextChar == 'M') {
                accumulator += 900;
                i++; // Skip the next character 'M'
            } else {
                accumulator += map.get(currentChar);
            }
        }
        return accumulator;
    }
}