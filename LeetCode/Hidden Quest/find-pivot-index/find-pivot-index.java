class Solution {
    public int pivotIndex(int[] nums) {
    int totalSum = 0;  // 배열의 전체 합을 저장할 변수
    int leftSum = 0;  // 왼쪽 부분 배열의 합을 저장할 변수

    // 배열의 전체 합을 계산합니다.
    for (int num : nums) {
        totalSum += num;
    }

    // 피벗 인덱스를 찾습니다.
    for (int i = 0; i < nums.length; i++) {
        // 왼쪽 부분 배열의 합과 오른쪽 부분 배열의 합이 동일한 경우, 피벗 인덱스를 반환합니다.
        if (leftSum == totalSum - leftSum - nums[i]) {
            return i;
        }
        // 왼쪽 부분 배열의 합을 업데이트합니다.
        leftSum += nums[i];
    }

    // 피벗 인덱스가 존재하지 않는 경우 -1을 반환합니다.
    return -1;
    }
}