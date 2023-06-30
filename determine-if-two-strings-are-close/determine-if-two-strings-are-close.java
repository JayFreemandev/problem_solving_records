class Solution {
    public boolean closeStrings(String word1, String word2) {
        // 두 문자열의 길이가 다르면 서로 동일하게 만들 수 없으므로 false 반환
        if (word1.length() != word2.length()) {
            return false;
        }

        // 두 문자열의 문자 빈도수를 저장하기 위한 맵 생성
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        // 첫 번째 문자열의 문자 빈도수 계산
        for (char ch : word1.toCharArray()) {
            freq1[ch - 'a']++;
        }

        // 두 번째 문자열의 문자 빈도수 계산
        for (char ch : word2.toCharArray()) {
            freq2[ch - 'a']++;
        }

        // 두 문자열의 문자 빈도수가 동일하지 않으면 false 반환
        for (int i = 0; i < 26; i++) {
            if ((freq1[i] == 0 && freq2[i] != 0) || (freq1[i] != 0 && freq2[i] == 0)) {
                return false;
            }
        }

        // 두 문자열의 중복되지 않은 문자들을 정렬하여 동일한지 확인
        Arrays.sort(freq1);
        Arrays.sort(freq2);

        return Arrays.equals(freq1, freq2);
    }
}