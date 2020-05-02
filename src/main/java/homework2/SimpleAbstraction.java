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
        Cube cube = new Cube(6.0);
        Prism prism = new Prism(3.4,12);
        Parallelepiped pal = new Parallelepiped(4.6, 12);
        System.out.println("Объем шара: "+f.format(ball.getVolume()));
        System.out.println("Объем цилиндра: "+f.format(cylyinder.getVolume()));
        System.out.println("Объем конуса: "+f.format(konus.getVolume()));
        System.out.println("Объем пирамиды:" +f.format(pyramid.getVolume()));
        System.out.println("Объем призмы:" +f.format(prism.getVolume()));
        System.out.println("Объем куба:" +f.format(cube.getVolume()));
        System.out.println("Объем параллелепипеда:" +f.format(pal.getVolume()));
    }

}

