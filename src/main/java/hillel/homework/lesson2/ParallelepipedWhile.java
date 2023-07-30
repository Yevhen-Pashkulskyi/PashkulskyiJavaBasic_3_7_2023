package main.java.hillel.homework.lesson2;

import java.util.Scanner;

import static java.lang.Math.pow;

public class ParallelepipedWhile {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        System.out.println("Введіть сторону А : ");
        double height = scaner.nextDouble();

        System.out.println("Введіть сторону B : ");
        double longitude = scaner.nextDouble();

        System.out.println("Введіть сторону С : ");
        double width = scaner.nextDouble();


        while (height == longitude & width == longitude & width == height) {
            System.out.println("Данні не можуть бути схожими, введіть інші данні !");

            System.out.println("Введіть сторону А : ");
            height = scaner.nextDouble();

            System.out.println("Введіть сторону B : ");
            longitude = scaner.nextDouble();

            System.out.println("Введіть сторону С : ");
            width = scaner.nextDouble();
        }

        double volume = height * longitude * width;
        System.out.println("Об'єм паралелепіпеда = " + volume);

        double degree = 2;
        double lenght = pow(height, degree) + pow(longitude, degree) + pow(width, degree);
        System.out.println("Довжина всіх сторін паралелепіпеда = " + lenght);

        scaner.close();
    }
}
