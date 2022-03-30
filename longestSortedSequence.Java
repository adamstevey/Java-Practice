public class ExerciseMethods {
    public static int longestSortedSequence(int[] arr) {
        if (arr.length == 0 ) {
            return 0;
        }
        int longest = 0;
        int count = 0;
        for (int i = 1; i < arr.length; i ++) {
            if (arr[i] >= arr[i-1]) {
                count ++;
            } else {
                if (count > longest) {
                    longest = count;
                }
                count = 0;
            }
        }
        if (count > longest) {
            longest = count;
        }
        return longest+1;
    }
}