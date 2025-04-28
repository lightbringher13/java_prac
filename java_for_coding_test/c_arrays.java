package java_for_coding_test;
import java.util.Arrays;
class ArraysPrac {
    public static void main(String args[]){
        int[] nums = new int[4];
        for (int i = 0;i<4;i++) {
            nums[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(nums);

        String[] names = {"Tom", "Jane", "Alice"};
        System.out.println(Arrays.toString(names));   // [Tom, Jane, Alice]

        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        System.out.println(Arrays.equals(a, b));     // true

        int[] original = {1, 2, 3};
        int[] copy = Arrays.copyOf(original, 5);     // [1, 2, 3, 0, 0] ← 길이 5로 복사, 부족한 부분은 0으로 채움
        System.out.println(Arrays.toString(copy));

        int[] arr = new int[5];
        Arrays.fill(arr, 7);                         // [7, 7, 7, 7, 7]
        System.out.println(Arrays.toString(arr));

        int[] nums1 = {1, 3, 5, 7, 9};
        int index = Arrays.binarySearch(nums1, 5);    // 5의 위치 → 2 (인덱스)
        System.out.println(index);
    }
}