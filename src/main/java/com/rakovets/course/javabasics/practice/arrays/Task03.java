package com.rakovets.course.javabasics.practice.arrays;

import com.rakovets.course.javabasics.util.StandardInputTask;

/**
 * Разработать программу для электронного дневника:
 * которая работает с отметками по каждому предмету.
 *
 * @author Dmitry Rakovets
 * @version 1.0
 */
public class Task03 extends StandardInputTask {
    public static void main(String[] args) {
        // Ввод данных осуществляется в Standard Input, для проверки различных вариантов входных параметров
        int countDisciplines = INPUT_SCANNER.nextInt();
        int countSemesters = INPUT_SCANNER.nextInt();
        int[][] marks = nextArray(countDisciplines, countSemesters);

        // Вызов методов
        getAverageMark(marks);
        getMinMark(marks);
        getMaxMark(marks);
    }

    /**
     * Возвращает средне арифметическую отметку по предметам за весь период обучения с округлением до 2 знаков.
     *
     * @param marks отметки
     * @return средняя арифметическая отметка
     */
    static double[] getAverageMark(int[][] marks) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
        double[] markSaverage = new double[marks.length];
        int marks1 = 0;
        double marks2 = 0.00;
        for (int i = 0; i < marks.length; i++) {
            marks2 = 0.00;
            marks1 = 0;
            for (int j = 0; j < marks[i].length; j++) {
                marks2 = marks2 + marks[i][j];
                marks1++;
            } markSaverage[i] = Math.round((marks2 / marks1) * 100) / 100.00;
        } return markSaverage;
    }
    /**
     * Возвращает минимальную отметку по предметам за весь период обучения.
     *
     * @param marks отметки
     * @return минимальная отметка
     */
    static int[] getMinMark(int[][] marks) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
        int[] marksMin = new int[marks.length];
        for (int i = 0; i < marks.length; i++) {
            int resultMin = marks[i][0];
            for (int j = 0; j < marks[i].length; j++) {
                if (marks[i][j] < resultMin) {
                    resultMin = marks[i][j];
                }
            } marksMin[i] = resultMin;
        }
        return marksMin;
    }

    /**
     * Возвращает максимальну отметку по предметам за весь период обучения.
     *
     * @param marks отметки
     * @return максимальная отметка
     */
    static int[] getMaxMark(int[][] marks) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
        int[] marksMax = new int[marks.length];
        for (int i = 0; i < marks.length; i++) {
            int resultMax = marks[i][0];
            for (int j = 0; j < marks[i].length; j++) {
                if (marks[i][j] > resultMax) {
                    resultMax = marks[i][j];
                }
            } marksMax[i] = resultMax;
        }
        return marksMax;
    }

    private static int[][] nextArray(int countDisciplines, int countSemesters) {
        int[][] marks = new int[countDisciplines][countSemesters];
        for (int i = 0; i < countDisciplines; i++) {
            for (int j = 0; j < countSemesters; j++) {
                marks[i][j] = INPUT_SCANNER.nextInt();
            }
        }
        return marks;
    }
}