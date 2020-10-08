package com.rakovets.course.javabasics.practice.conditionalstatements;

import java.util.Scanner;

/**
 * Разработать программу для сайта посвященного астрологии:
 * Которая выводит знак зодиака и названия года по китайскому календарю, если известно:
 *
 * @param day   - число дня рождения
 * @param month - месяц дня рождения
 * @param year  - год дня рождения (больше 0 г. н.э. и нет никаких циклических смещений)
 *
 * 21.3-20.4 - `Ram`
 * 21.4-20.5 - `Bull`
 * 21.5-21.6 - `Twins`
 * 22.6-22.7 - `Crab`
 * 23.7-22.8 - `Lion`
 * 23.8-21.9 - `Maiden`
 * 22.9-22.10 - `Scales`
 * 23.10-22.11 - `Scorpion`
 * 23.11-21.12 - `Archer`
 * 22.12-20.1 - `Goat`
 * 21.1-19.2 - `Water-bearer`
 * 20.2-20.3 - `Fish`
 *
 * 2001 - `Snake`
 * 2002 - `Horse`
 * 2003 - `Ram`
 * 2004 - `Monkey`
 * 2005 - `Rooster`
 * 2006 - `Dog`
 * 2007 - `Pig`
 * 2008 - `Rat`
 * 2009 - `Ox`
 * 2010 - `Tiger`
 * 2011 - `Rabbit`
 * 2012 - `Dragon`
 *
 * @return 'Zodiac Sign: {0}. Chinese Zodiac: {1}', где {0} - знак зодиака, {1} - год зодиака
 */
public class Task12 {
    public static void main(String[] args) {
        //FIXME
        // Ввод данных осуществляется в Console, для проверки различных вариантов входных параметров

        // Код необходимый для тестирования, не изменять
        Scanner scanner = new Scanner(System.in);
        int day = (args.length != 3) ? scanner.nextInt() : Integer.parseInt(args[0]);
        int month = (args.length != 3) ? scanner.nextInt() : Integer.parseInt(args[1]);
        int year = (args.length != 3) ? scanner.nextInt() : Integer.parseInt(args[2]);
        double inf =Double.POSITIVE_INFINITY;
        if ((month == 3 && day >= 21 && day <= 31) | (month == 4 && day >= 1 && day <=20)) {
            System.out.print("Zodiac Sign: Ram. ");
        } else if ((month == 4 && day >= 21 && day <= 30) | (month == 5 && day >= 1 && day <=20)) {
            System.out.print("Zodiac Sign: Bull. ");
        } else if ((month == 5 && day >= 21 && day <= 31) | (month == 6 && day >= 1 && day <=21)) {
            System.out.print("Zodiac Sign: Twins. ");
        } else if ((month == 6 && day >= 22 && day <= 30) | (month == 7 && day >= 1 && day <=22)) {
            System.out.print("Zodiac Sign: Crab. ");
        } else if ((month == 7 && day >= 23 && day <= 31) | (month == 8 && day >= 1 && day <=22)) {
            System.out.print("Zodiac Sign: Lion. ");
        } else if ((month == 8 && day >= 23 && day <= 31) | (month == 9 && day >= 1 && day <=21)) {
            System.out.print("Zodiac Sign: Maiden. ");
        } else if ((month == 9 && day >= 22 && day <= 30) | (month == 10 && day >= 1 && day <=22)) {
            System.out.print("Zodiac Sign: Scales. ");
        } else if ((month == 10 && day >= 23 && day <= 31) | (month == 11 && day >= 1 && day <=22)) {
            System.out.print("Zodiac Sign: Scorpion. ");
        } else if ((month == 11 && day >= 23 && day <= 30) | (month == 12 && day >= 1 && day <=21)) {
            System.out.print("Zodiac Sign: Archer. ");
        } else if ((month == 12 && day >= 22 && day <= 31) | (month == 1 && day >= 1 && day <=20)) {
            System.out.print("Zodiac Sign: Goat. ");
        } else if ((month == 1 && day >= 21 && day <= 31) | (month == 2 && day >= 1 && day <=19)) {
            System.out.print("Zodiac Sign: Water-bearer. ");
        } else if ((month == 2 && day >= 20 && day <= 31) | (month == 3 && day >= 1 && day <=20)) {
            System.out.print("Zodiac Sign: Fish. ");
        }
        int n = year % 12;
        if (n == 9) {
            System.out.print("Chinese Zodiac: Snake");
        } else if (n == 10) {
            System.out.print("Chinese Zodiac: Horse");
        } else if (n == 11) {
            System.out.print("Chinese Zodiac: Ram");
        } else if (n == 0) {
            System.out.print("Chinese Zodiac: Monkey");
        } else if (n == 1) {
            System.out.print("Chinese Zodiac: Rooster");
        } else if (n == 2) {
            System.out.print("Chinese Zodiac: Dog");
        } else if (n == 3) {
            System.out.print("Chinese Zodiac: Pig");
        } else if (n == 4) {
            System.out.print("Chinese Zodiac: Rat");
        } else if (n == 5) {
            System.out.print("Chinese Zodiac: Ox");
        } else if (n == 6) {
            System.out.print("Chinese Zodiac: Tiger");
        } else if (n == 7) {
            System.out.print("Chinese Zodiac: Rabbit");
        } else if (n == 8) {
            System.out.print("Chinese Zodiac: Dragon");
        }
        //TODO
        // Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
    }
}