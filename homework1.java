package org.example.lesson1.HomeWork;

import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
        System.out.println("Введите текст: ");
        Scanner scanner = new Scanner(System.in);
        String t = scanner.nextLine();
        System.out.println("Было = " + t);
        System.out.println("Стало = " + domzadanie1(t));
    }

    /**
     * При наличии входной строки измените порядок слов на противоположный.
     *
     * @param t входная строка
     * @return изменяет порядок слов на противоположный
     */
    private static String domzadanie1(String t) {
        t.trim();
        String[] words = t.split(" ");
        int length = 0;
        String a = "";
        for (String element : words) length++;
        for (int i = length - 1; i >= 0; i--) a = a.trim() + " " + words[i];
        return a;
    }
}
