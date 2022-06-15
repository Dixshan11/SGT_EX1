

public class FindSecondMaxInArray {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 2, 6, 7, 8, 4, 3, 7, 9};
        System.out.println("Array elements after sorting:");

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int tmp = 0;
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }


        }
        System.out.println("Second large array "+arr[arr.length-2]);
    }
}