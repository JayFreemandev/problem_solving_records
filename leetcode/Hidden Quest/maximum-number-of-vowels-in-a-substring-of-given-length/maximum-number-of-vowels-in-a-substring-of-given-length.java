class Solution {
    public int maxVowels(String s, int k) {
        int max = 0;
        int left = 0;
        int vowelCount = 0;

        for(int i = 0; i < k; i++){
            if(isVowel(s.charAt(i))){
                vowelCount++;
            }
        }

        max = vowelCount; // 초기값

        for(int i=k; i<s.length(); i++){
            if(isVowel(s.charAt(i-k))){
                vowelCount--;
            }

            if(isVowel(s.charAt(i))){
                vowelCount++;
            }

            max = Math.max(max, vowelCount);
        }

        return max;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}