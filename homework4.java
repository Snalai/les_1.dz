package org.example.lesson3.HomeWork;

import java.util.ArrayList;
import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько желаете ввести чисел?");
        double len = scanner.nextDouble();
        double min = 0;
        double max = 0;
        double aver = 0;
        for (int i = 0; i < len; i++) {
            integerArrayList.add((int) scanner.nextDouble());
            if (min == 0){
                min = integerArrayList.get(i);
            }
            if (min > integerArrayList.get(i)){
                min = integerArrayList.get(i);
            }
            if (max < integerArrayList.get(i)){
                max = integerArrayList.get(i);
            }
        }
        aver = (max + min) / 2;

        System.out.println("Большее: " + max +  " , " + "Меньшее: " + min +  " , " + "Среднее: " + aver);

    }
}
