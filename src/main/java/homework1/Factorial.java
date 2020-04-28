package homework1;

import java.math.BigInteger;

class Factorial {

    // вычисление факториала числа
    public static int factorial(int n)
    {
        int ret = 1;
        for (int i = 1; i <= n; ++i) ret *= i;
        return ret;
    }
}


