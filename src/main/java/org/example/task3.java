package org.example;

import java.util.ArrayList;

//Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа.
//        Пройти по списку, найти и удалить целые числа.
public class task3 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList();
        arr.add("hi");
        arr.add("1");
        arr.add("10");
        arr.add("my");
        arr.add("8");
        System.out.println("первоначальный массив " +arr);

        ArrayList withoutNumber = new ArrayList();
        for (int i = 0; i < arr.size(); i++) {
            int n = 0;
            try {
                n =  Integer.parseInt(arr.get(i));
                System.out.println("убираем число " + arr.get(i));
            } catch (NumberFormatException e) {
                withoutNumber.add(arr.get(i));
            }


        }
        System.out.println("остается " + withoutNumber);
    }
}
