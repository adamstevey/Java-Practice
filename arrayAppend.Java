public class ExerciseMethods {
    public static int[] append(int[] a1, int[] a2) {
        int[] return_arr = new int[a1.length+a2.length];
        int index = 0;
        for (int i = 0; i < a1.length; i++) {
            return_arr[index] = a1[i];
            index ++;
        }
        for (int j = 0; j < a2.length; j++) {
            return_arr[index] = a2[j];
            index ++;
        }
        return return_arr;
    }
}