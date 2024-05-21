class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> hashMap = new HashMap<>();

        for(int num : arr){
            hashMap.put(num, hashMap.getOrDefault(num, 0)+1);
        }

        Set<Integer> set = new HashSet<>(hashMap.values());

        return set.size() == hashMap.size();
    }
}