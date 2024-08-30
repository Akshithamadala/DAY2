public class MathsIsFun {
    public static int Calculate(int m, int n) {
        int sum = 0;
        for (int i = m; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) { // Check divisibility by both 3 and 5
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int m1 = 12, n1 = 50;
        System.out.println("Output: " + Calculate(m1, n1)); // Output: 90

        int m2 = 100, n2 = 160;
        System.out.println("Output: " + Calculate(m2, n2)); // Output: 510
    }
}

    
}
