public class ExerciseMethods {
    public static void evenBeforeOdd(int[] arr) {
        int[] return_arr = new int[arr.length];
        int index = 0;
        for (int i = 0; i<arr.length; i++) {
            if (arr[i]%2 == 0) {
                return_arr[index] = arr[i];
                index ++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] % 2 != 0) {
                return_arr[index] = arr[j];
                index ++;
            }
        }
        for (int k = 0; k < arr.length; k++) {
            arr[k] = return_arr[k];
        }
    }
}