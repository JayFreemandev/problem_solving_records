class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        String vowels = "aeiouAEIOU";
        
        while (i < j) {
            while (i < j && vowels.indexOf(chars[i]) == -1) {
                i++;
            }
            
            while (i < j && vowels.indexOf(chars[j]) == -1) {
                j--;
            }
            
            if (i < j) {
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                i++;
                j--;
            }
        }
        
        return new String(chars);
    }
}