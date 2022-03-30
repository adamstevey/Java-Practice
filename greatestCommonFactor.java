class ExerciseMethods {
    public static int gcd(int a, int b) {
        int x = a;
        int y = b;
        int temp = 0;
        while (x != 0) {
            y = x%y;
            temp = x;
            x = y;
            y = temp;
            System.out.println(x + " | " + y);
        }
        return x;
    }
    public static void main(String[] args) {
        gcd(24, 84);
    }
}
