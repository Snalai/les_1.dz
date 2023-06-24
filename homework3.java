package org.example.lesson2.HomeWork;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        System.out.println("Сколько желаете ввести чисел?");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        int s = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        for (int p : domzadanie3(array, s)) {
            System.out.print(p + ", ");
        }
    }

    /**
     * @param array заполняемый нами массив чисел
     * @param s     счётчик для прохода по массиву
     * @return возвращает заменённые отрицательные числа в массиве на сумму индексов двузначных элементов массива
     * @apiNote Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
     */

    private static int[] domzadanie3(int[] array, int s) {
        int sum = 0;
        s = 0;
        for (int i : array) {

            if (i > 9) {
                sum += s;
            }
            s++;
        }
        s = 0;
        for (int j : array) {
            if (j < 0) {
                array[s] = sum;
            }
            s++;
        }
        return array;
    }
}
