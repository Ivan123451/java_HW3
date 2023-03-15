package org.example;

import java.util.ArrayList;
import java.util.Random;

//2. Задан целочисленный список ArrayList.
// Найти минимальное, максимальное и среднее арифметическое из этого списка.
public class task2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> arr = new ArrayList();
        for (int i = 0; i < 30; i++) {
            arr.add(rnd.nextInt(10));

        }
        System.out.println(arr);
        int max = arr.get(0);
        int min = arr.get(0);

        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > max ){
                max = arr.get(i);
            }
            if(arr.get(i) < min) {
                min = arr.get(i);
            }
            count = count + arr.get(i);


        }
        System.out.println("максимальное значение " + max);
        System.out.println("минимальное значение " + min);
        System.out.println("среденее значение " + (count/(arr.size())));
    }
}
