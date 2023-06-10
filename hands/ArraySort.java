import java.util.Arrays;
import java.util.Collections;

public class ArraySort {
    public static void main(String[] args) {
        int[] nums = {5, 2, 8, 3, 1, 6};
        Arrays.sort(nums);
        Arrays.stream(nums).forEach(num -> System.out.println("오름차순 : " + num));

        // int 그대로 내림차순
        for (int i = 0; i < nums.length / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }

        Arrays.stream(nums).forEach(num -> System.out.println("내림차순 : " + num));

        // Wrapper 변환후 collections.reverseOrder() 사용하기
        Integer[] nums2 = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(nums2, Collections.reverseOrder());
        Arrays.stream(nums2).forEach(num -> System.out.println("Integer 내림차순 : " + num));

        //이차원 배열
        int[][] arr = new int[][]{{5,40},{3,50},{1,30},{4,20},{2,10}};

        Arrays.sort(arr, (o1, o2) -> {
            return o1[0]-o2[0]; // 첫번째 숫자 기준 오름차순 {1,30}{2,10}{3,50}{4,20}{5,40}
        });
    }
}
