package geekbrains.lesson3_1gb;

import geekbrains.lesson3_1gb.boxes.Box;
import geekbrains.lesson3_1gb.fruits.Apple;
import geekbrains.lesson3_1gb.fruits.Orange;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //1. Задача
        String[] array = new String[] {
                "Зрелый фрукт", "Гнилой фрукт", "Сойдет","Кислятина"
        };
        System.out.println("До преобразования:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        //индексы для пермешивания
        swapArrayElements(array, 1, 3);

        System.out.println("После преобразования:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        // 2. Задача:
        System.out.println();
        System.out.println(convertToArrayList(array));

        // 3. Большая задача:
        System.out.println();
        Box<Orange> orangeBox1 = new Box<>();
        Box<Orange> orangeBox2 = new Box<>();

        Box<Apple> appleBox = new Box<>();

        orangeBox1.addFruit(new Orange());
        orangeBox1.addFruit(new Orange());
        orangeBox1.addFruit(new Orange());
        orangeBox1.addFruit(new Orange());
        orangeBox1.addFruit(new Orange());

        orangeBox2.addFruit(new Orange());
        orangeBox2.addFruit(new Orange());
        orangeBox2.addFruit(new Orange());
        orangeBox2.addFruit(new Orange());


        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());



        System.out.println("Вес 1й коробки с апельсинами: " + orangeBox1.getWeight());
        System.out.println("Вес 2й коробки с апельсинами: " + orangeBox2.getWeight());
        System.out.println("Вес корбки с яблоками weight: " + appleBox.getWeight());
        System.out.println("******");
        System.out.println("Сравниваем вес коробки с яблоками и 1ой коробкой апельсинов: "+ orangeBox1.compare(appleBox));
        System.out.println("Сравниваем вес коробки с яблоками и 2ой коробкой апельсинов: "+ orangeBox2.compare(appleBox));


        System.out.println("******");
        orangeBox1.sortingFruits(orangeBox2);
        System.out.println("Вес 1й коробки с апельсинами после сортровки: " + orangeBox1.getWeight());
        System.out.println();
        System.out.println("Вес 2й коробки с апельсинами после сортровки: " + orangeBox2.getWeight());
        System.out.println("******");

    }

    // 1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа)
    static <T> T[] swapArrayElements(T[] array, int indexFirst, int indexSecond) {
        T buffer;
        buffer = array[indexFirst];
        array[indexFirst] = array[indexSecond];
        array[indexSecond] = buffer;
        return array;
    }

    // 2. Написать метод, который преобразует массив в ArrayList
    static <T> ArrayList<T> convertToArrayList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }

}