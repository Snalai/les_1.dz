package org.example.lesson2.HomeWork;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println("Сколько желаете ввести чисел?");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Вводите числа: ");
        System.out.println(domzadanie2(scanner, n));
    }
    /**
     * @apiNote Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
     * @param scanner вспомогательный класс
     * @param n длинна последовательности
     * @return определение является ли последовательность возрастающей true/false
     */
    private static boolean domzadanie2(Scanner scanner, int n) {
        int a = 0;
        boolean c = true;
        for (int i = 0; i < n; i++) {
            int b = scanner.nextInt();
            if (b < a) {
                c = false;
            }
            a = b;
        }
        return c;
    }
}
