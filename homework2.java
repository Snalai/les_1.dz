package org.example.lesson3.HomeWork.HomeWork2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HomeWork2 homeWork1 = new HomeWork2("яблоки", "Россия", 5, 6, 1);
        HomeWork2 homeWork2 = new HomeWork2("яблоки", "Германия", 10, 20, 1);
        HomeWork2 homeWork3 = new HomeWork2("груши", "Франция", 15, 30, 2);
        HomeWork2 homeWork4 = new HomeWork2("персики", "Китай", 20, 50, 1);
        List<HomeWork2> homeWork2List = new ArrayList<>();
        homeWork2List.add(homeWork1);
        homeWork2List.add(homeWork2);
        homeWork2List.add(homeWork3);
        homeWork2List.add(homeWork4);
        Scanner scanner = new Scanner(System.in);
        Integer s_grade = 0;
        int min_price = 0;
        String name_product = "";
        System.out.println("Выберите сорт 1 или 2");
        while (s_grade != 1 | s_grade != 2) {
            s_grade = scanner.nextInt();
            if (s_grade instanceof Integer & s_grade == 1 | s_grade == 2) {
                for (int i = 0; i < homeWork2List.size(); i++) {
                    if (s_grade == homeWork2List.get(i).getGrade()) {
                        min_price = homeWork2List.get(i).getPrice();
                        name_product = homeWork2List.get(i).getName();
                    }
                }
                for (int i = 0; i < homeWork2List.size(); i++) {
                    if (min_price > homeWork2List.get(i).getPrice() & s_grade == homeWork2List.get(i).getGrade()) {
                        min_price = homeWork2List.get(i).getPrice();
                        name_product = homeWork2List.get(i).getName();
                    }
                }
                System.out.print(name_product + " , " + min_price);
            } else System.out.println("Вы не ввели 1 или 2");
        }
    }
}
