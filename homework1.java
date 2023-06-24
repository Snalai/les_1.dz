package org.example.lesson3.HomeWork.HomeWork1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HomeWork1 homeWork1 = new HomeWork1("Мясо курица высший", 5, 1);
        HomeWork1 homeWork2 = new HomeWork1("Мясо говядина высший", 10, 2);
        HomeWork1 homeWork3 = new HomeWork1("низший слон", 15, 2);
        List<HomeWork1> homeWork1List = new ArrayList<>();
        homeWork1List.add(homeWork1);
        homeWork1List.add(homeWork2);
        homeWork1List.add(homeWork3);
        int h_price = homeWork1List.get(0).getPrice();
        for (int i = 0; i < homeWork1List.size(); i++) {
            if (homeWork1List.get(i).getName().contains("высший")
                    & (homeWork1List.get(i).getGrade() == 1
                    | homeWork1List.get(i).getGrade() == 2)) {
                if (h_price < homeWork1List.get(i).getPrice()) {
                    h_price = homeWork1List.get(i).getPrice();
                }
            }

        }
        System.out.println(h_price);
    }
}
