class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        result = {}

        for i, value in enumerate(nums):
            temp = target - nums[i]

            if temp in result:
                return [i, result[temp]]
            else:
                result[value] = i