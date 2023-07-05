package lesson_1;
import java.util.Arrays;

public class lesson_1_hw_2_Array {
    public static void main(String[] args) {
        int[] arr1 = {5, 6, 4, 3, 9};
        int[] arr2 = {1, 1, 2, 3, 3};

        division(arr1, arr2);
        System.out.println(Arrays.toString(division(arr1, arr2)));
    }

    public static int[] division(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null) {
            throw new RuntimeException("Массив не должен быть равен null!");
        }
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Длины массивов должны быть одинаковыми!");
        }

        int[] arr3 = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            if (arr2[i] == 0) {
                throw new RuntimeException("Делитель не должен быть равен 0!");
            }
            arr3[i] = arr1[i] / arr2[i];
        }
        return arr3;
    }
}