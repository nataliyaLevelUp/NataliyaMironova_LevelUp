package homework1;

class Power {

    // возведение в степень
    public static double power(double a, int b) {
        if (b == 1)
            return a;
        else {
            return (a * power(a, b - 1));
        }
    }
}
