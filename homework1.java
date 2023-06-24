package org.example.lesson2.HomeWork;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        System.out.println("Сколько желаете ввести чисел?");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Вводите числа: ");
        System.out.println("Сумма простых чисел равна: " + domzadanie1(scanner, n));
    }

    /**
     * @apiNote Дана последовательность N целых чисел. Найти сумму простых чисел.
     * @param scanner вспомогательный класс
     * @param n длинна последовательности
     * @return сумма простых чисел sum
     */
    private static int domzadanie1(Scanner scanner, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            if (a % 2 == 1) sum += a;
        }
        return sum;
    }
}
