package main.java.hillel.homework.lesson2;

import java.util.Scanner;

import static java.lang.Math.pow;

public class ParallelepipedVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ВВедіть сторону А : ");
        double sideA = scanner.nextDouble();
        System.out.println("ВВедіть сторону В : ");
        double sideB = scanner.nextDouble();
        System.out.println("ВВедіть сторону С : ");
        double sideC = scanner.nextDouble();
        double volume = sideA * sideB * sideC;
        System.out.println("Об'єм паралелепіпеда = " + volume);
        double degree = 2.0;
        double lenght = pow(sideA, degree) + pow(sideB, degree) + pow(sideC, degree);
        System.out.println("Довжина всіх сторін паралелепіпеда = " + lenght);
        scanner.close();
    }
}
