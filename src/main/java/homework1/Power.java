package homework1;

class Power {

    // возведение в степень
    public static double power(double a, int b) {
        double result = 1;
        for (int i=1; i<=b; i++){
            result = result*a;
        }
        return result;
    }
}
