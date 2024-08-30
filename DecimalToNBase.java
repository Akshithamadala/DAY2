public class DecimalToNBase {
    public static String DectoNBase(int n, int num) {
        String symbols = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"; // Characters for bases up to 36
        String result = ""; // To store the final result

        while (num > 0) {
            int remainder = num % n; // Find remainder
            result = symbols.charAt(remainder) + result; // Prepend corresponding symbol to the result
            num /= n; // Update the number by dividing it by base n
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 12;
        int num = 718;
        String output = DectoNBase(n, num);
        System.out.println("Output: " + output); // Output: 4BA
    }
}
