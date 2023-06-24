package org.example.lesson3.HomeWork.HomeWork3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HomeWork3 homeWork1 = new HomeWork3("Цветок", "Багиров", 150, 2012, 34);
        HomeWork3 homeWork2 = new HomeWork3("Рассвет", "Баранов", 130, 2017, 41);
        HomeWork3 homeWork3 = new HomeWork3("Каскад", "Дмитров", 200, 2009, 123);
        HomeWork3 homeWork4 = new HomeWork3("Сингулярность", "Протопетов", 1500, 2030, 4000);
        List<HomeWork3> homeWork3List = new ArrayList<>();
        homeWork3List.add(homeWork1);
        homeWork3List.add(homeWork2);
        homeWork3List.add(homeWork3);
        homeWork3List.add(homeWork4);
        String namebook = "";
        for (int i = 0; i < homeWork3List.size(); i++) {
            if (homeWork3List.get(i).getSurname().contains("а")
                    & homeWork3List.get(i).num_pag % 2 == 1
                    & homeWork3List.get(i).year_pub >= 2010) {
                namebook = homeWork3List.get(i).getName();
                System.out.println(namebook + " ");
            }
        }
    }
}
