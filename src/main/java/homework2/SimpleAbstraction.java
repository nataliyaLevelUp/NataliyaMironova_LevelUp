package homework2;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

import static homework1.SimpleCalculator.getDouble;

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

        // Создаем набор фигур
        ArrayList<Figure> suite = new ArrayList<>();
        suite.add(ball);
        suite.add(cylyinder);
        suite.add(konus);
        suite.add(pyramid);
        suite.add(cube);
        suite.add(prism);
        suite.add(pal);
        Collections.sort(suite);
        System.out.println("Объем шара: "+f.format(ball.getVolume()));
        System.out.println("Объем цилиндра: "+f.format(cylyinder.getVolume()));
        System.out.println("Объем конуса: "+f.format(konus.getVolume()));
        System.out.println("Объем пирамиды:" +f.format(pyramid.getVolume()));
        System.out.println("Объем призмы:" +f.format(prism.getVolume()));
        System.out.println("Объем куба:" +f.format(cube.getVolume()));
        System.out.println("Объем параллелепипеда:" +f.format(pal.getVolume()));

        //Сортировка фигур по объёму по возрастанию
        System.out.println("Сортировка фигур по объёму:");
        for(Figure fig: suite){
            System.out.println(f.format(fig.getVolume()));
        }

        // Сумма объёмов всех фигур
        double sum = 0;
        for (Figure fig : suite) {
            sum=sum+fig.getVolume();
        }
        System.out.println("Сумма объёмов всех фигур: "+f.format(sum));

        // Поиск элемента по заданным параметрам
        // Ищем объект ball
        Ball compareBall = new Ball(4.5);
        if (suite.contains(compareBall)) {
            System.out.println("Фигура с заданными параметрами присутствует в наборе"+compareBall);
        } else {
            System.out.println("Фигуры с таким параметром в наборе нет"+compareBall);
        }

        if(suite.contains(ball)) {
            System.out.println("Фигура с заданными параметрами присутствует в наборе" + ball);
        } else {
            System.out.println("Фигуры с таким параметром в наборе нет"+ball);
        }

    }
}

