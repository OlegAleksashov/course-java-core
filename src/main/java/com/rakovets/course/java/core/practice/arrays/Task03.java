package com.rakovets.course.java.core.practice.arrays;

import com.rakovets.course.java.core.util.NumberUtil;

import java.util.Arrays;

/**
 * Разработать программу для электронного дневника, которая работает с отметками по каждому предмету.
 *
 * @author Dmitry Rakovets
 */
class Task03 {
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        int[][] marks = {
                {6, 4, 8},
                {9, 6, 2},
                {1, 4, 5},
                //java:test://com.rakovets.course.java.core.practice.arrays.Task03Test.getMinMarkTest(int[][], int[])[2]
        };

        double[] averageMark = getAverageMarks(marks);
        System.out.printf("Average mark: %s\n", Arrays.toString(averageMark));
        int[] minMark = getMinMarks(marks);
        System.out.printf("Min mark: %s\n", Arrays.toString(minMark));
        int[] maxMark = getMaxMarks(marks);
        System.out.printf("Max mark: %s\n", Arrays.toString(maxMark));
    }

    /**
     * Возвращает средне арифметическую отметку по предметам за весь период обучения с округлением до 2 знаков.
     *
     * @param marks отметки
     * @return средняя арифметическая отметка
     */
    static double[] getAverageMarks(int[][] marks) {
        double[] averageMark = new double[marks.length];
        int count;
        int poz = 0;

        for (int[] mark : marks) {
            count = 0;
            for (int i : mark) {
                count += i;
            }
            averageMark[poz] = NumberUtil.roundValueToTwoDigitsForMantissa((double) count / mark.length);
            poz++;
        }
        return averageMark;
    }

    /**
     * Возвращает минимальную отметку по предметам за весь период обучения.
     *
     * @param marks отметки
     * @return минимальная отметка
     */
    static int[] getMinMarks(int[][] marks) {
        int[] minMark = new int[marks.length];

        Arrays.fill(minMark, Integer.MAX_VALUE);
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                if (minMark[i] > marks[i][j]) {
                    minMark[i] = marks[i][j];
                }
            }
        }
        return minMark;
    }

    /**
     * Возвращает максимальную отметку по предметам за весь период обучения.
     *
     * @param marks отметки
     * @return максимальная отметка
     */
    static int[] getMaxMarks(int[][] marks) {
        int[] maxMark = new int[marks.length];

        Arrays.fill(maxMark, Integer.MIN_VALUE);
        for (int i = 0; i < marks.length; i++)
            for (int j = 0; j < marks[i].length; j++) {
                if (maxMark[i] < marks[i][j]) {
                    maxMark[i] = marks[i][j];
                }
            }
        return maxMark;
    }
}
