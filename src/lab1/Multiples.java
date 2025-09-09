package lab1;

public class Multiples {
    public static void main(String[] args) {
        int count = multiples();
        System.out.println(count);
    }

    public static int multiples(int n, int a, int b) {
        int total = 0;
        for (int i = 1; i < n; i++) {
            if (i % a == 0 || i % b == 0) {
                total++;
            }
        }
        return total;
    }

    public static int multiples() {
        int total = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                total++;
            }
        }
        return total;
    }
}