public class ExerciseMethods {
    public static int[] collapse(int[] arr) {
        int[] arr2 = new int[arr.length/2 + arr.length%2];
        int index = 0;
        for (int i = 0; i < arr.length; i+=2) {
            if (i == arr.length-1) {
                arr2[index] = arr[i];
            } else {
                arr2[index] = arr[i] + arr[i+1];
            }
            index ++;
        }
        return arr2;
    }
}