package main.java.hillel.homework.lesson2;

import java.util.Scanner;

public class Parallelepiped {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        System.out.println("Введіть сторону А : ");
        double height = scaner.nextDouble();

        System.out.println("Введіть сторону B : ");
        double longitude = scaner.nextDouble();

        System.out.println("Введіть сторону С : ");
        double width = scaner.nextDouble();

        double degree = 12.0;
        double volume = height * longitude * width;
        double lenght = height * degree + longitude * degree + width * degree;

        if (height == longitude & width == longitude & width == height) {
            System.out.println("Це в тебе куб і його результат ");
            System.out.println("Об'єм паралелепіпеда = " + volume);
            System.out.println("Довжина всіх сторін паралелепіпеда = " + lenght);
        } else {
            System.out.println("Звичайний паралелепипед і його результат");
            System.out.println("Об'єм паралелепіпеда = " + volume);
            System.out.println("Довжина всіх сторін паралелепіпеда = " + lenght);
        }

        scaner.close();
    }
}   