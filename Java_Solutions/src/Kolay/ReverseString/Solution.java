package Kolay.ReverseString;
// Soru linki : https://leetcode.com/problems/reverse-string/description/
class Solution {
    public void reverseString(char[] s) {
        char temp;
        for(int i = 0;i<=(s.length-2)/2;i++){
            temp = s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i] = temp;
        }
    }
}
