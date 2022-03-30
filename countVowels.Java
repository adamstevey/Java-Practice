public class ExerciseMethods {
    public static int[] vowelCount(String str) {
        int[] vowels = new int[5];
        for (int i = 0; i<str.length(); i++) {
            if (str.substring(i, i+1).equals("a")) {
                vowels[0]++;
            } else if (str.substring(i, i+1).equals("e")) {
                vowels[1]++;
            } else if (str.substring(i, i+1).equals("i")) {
                vowels[2]++;
            } else if (str.substring(i, i+1).equals("o")) {
                vowels[3]++;
            } else if (str.substring(i, i+1).equals("u")) {
                vowels[4]++;
            }
        }
        return vowels;
    }
}