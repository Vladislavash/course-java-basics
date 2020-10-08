package com.rakovets.course.javabasics.practice.conditionalstatements;

import java.util.Scanner;

/**
 * Разработать программу для почты:
 * Определить номер подъезда дома и этаж для данной квартиры, если известно:
 *
 * @param numberFloors             - количество этажей
 * @param numberApartmentsPerFloor - количество квартир на этаже
 * @param apartmentNumber          - номер квартиры
 * @return 'Porch: {0}. Floor: {1}', где {0} - номер подъезда, {1} - номер этажа
 */
public class Task09 {
    public static void main(String[] args) {
        //FIXME
        // Ввод данных осуществляется в Console, для проверки различных вариантов входных параметров
        // Код необходимый для тестирования, не изменять
        Scanner scanner = new Scanner(System.in);
        double numberFloors = (args.length != 3) ? scanner.nextInt() : Integer.parseInt(args[0]);
        double numberApartmentsPerFloor = (args.length != 3) ? scanner.nextInt() : Integer.parseInt(args[1]);
        double apartmentNumber = (args.length != 3) ? scanner.nextInt() : Integer.parseInt(args[2]);
        double x = apartmentNumber / numberApartmentsPerFloor / numberFloors;
        double l = apartmentNumber / numberApartmentsPerFloor;
        int y;
        int z;
        int k;
        y = (int)x;
        z = (int)l;
        double p = z % numberFloors;
        k = (int)p + 1;
        if (y <= 1) {
            if (apartmentNumber % numberApartmentsPerFloor == 0) {
                System.out.println("Porch: 1. Floor: " + z);
            } else {
                System.out.println("Porch: 1. Floor: " + (z + 1));
            }
        } else {
            if (numberFloors > z) {
                System.out.println("Porch: " + (y + 1) + ". Floor: " + z);
            } else {
                System.out.println("Porch: " + (y + 1) + ". Floor: " + k);
            }
        }
        //TODO
        // Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
    }
}