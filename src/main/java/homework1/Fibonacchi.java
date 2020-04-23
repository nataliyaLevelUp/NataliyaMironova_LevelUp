package homework1;

class Fibonacchi {

    // числа Фибоначчи

    public static int fibonacchi(int n) {
        int a = 1;
        int b = 1;
        for (int i = 3; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
