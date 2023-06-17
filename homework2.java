package org.example.lesson1.HomeWork;

import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
        System.out.println("Сколько желаете ввести чисел?");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Сумма положительных чисел, после которых следует отрицательное число = " + domzadanie2(n, scanner));
    }

    /**
     * Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел, после которых следует отрицательное число.
     * Пример ввода:
     * 1 2 1 2 -1 1 3 1 3 -1 0
     * @param n длинна последовательности
     * @param scanner вспомогательный класс
     * @return сумму положительных чисел, после которых следует отрицательное число
     */
    private static int domzadanie2(int n,  Scanner scanner) {
        int sum = 0;
        int b = 0;
        for (int i = 0; i < n/2; i++) {
            int a = scanner.nextInt();
            if (a < 0 ) sum += b;
            b = scanner.nextInt();
            if (b < 0 ) sum += a;
        }
        return sum;
    }
}
