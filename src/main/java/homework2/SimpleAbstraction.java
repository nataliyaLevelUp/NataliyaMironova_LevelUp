package homework2;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class SimpleAbstraction {
    public static void main(String args[]) throws Exception {

        // Вывод 2 символов после запятой
        DecimalFormatSymbols s = new DecimalFormatSymbols();
        s.setDecimalSeparator('.');
        DecimalFormat f = new DecimalFormat("#,##0.00", s);

        Ball ball = new Ball(4.5);
        Cylinder cylyinder = new Cylinder(2, 2);
        Konus konus = new Konus(50,10);
        Pyramid pyramid = new Pyramid(100, 100);
        System.out.println("Объем шара: "+f.format(ball.getVolume()));
        System.out.println("Объем цилиндра: "+f.format(cylyinder.getVolume()));
        System.out.println("Объем конуса: "+f.format(konus.getVolume()));
        System.out.println("Объем пирамиды:" +f.format(pyramid.getVolume()));
    }
}
