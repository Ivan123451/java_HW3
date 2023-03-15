package org.example;
//1. Пусть дан произвольный список целых чисел,
//удалить из него четные числа (в языке уже есть что-то готовое для этого)


import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rnd = new Random();
        ArrayList<Integer> arr = new ArrayList(30);
        for (int i = 0; i < 30; i++) {
            arr.add(rnd.nextInt(10));

        }
        System.out.println(arr);

        for (int i = 0; i < arr.size(); i++) {
            arr.removeIf(isEven -> (isEven%2) ==0);

        }
        System.out.println(arr);
    }

}