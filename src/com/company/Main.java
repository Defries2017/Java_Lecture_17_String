package com.company;

import java.awt.*;
import java.awt.image.BufferedImageFilter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Класс String.
        // Объектный (ссылочный тип данных).
        // Представляет собой массив символов (char)
        // Строковый пул в Java. Представляет собой
        // специальный механизм для хранения строк в Java
        // Работает следующим образом -
        // При создании новой строки, она записываетс в
        // в строковой пул. При след. создании объекта
        // типа String с таким же строковым значением,
        // которое уже хранится в пуле -
        // не происходил создание нового объекта,
        // а новой переменной типа String указывается
        // ссылка на предыдущий объект.

        String string1 = "Hello world";
        // При изменении объекта типа String,
        // объект удаляется и создается заново
        string1 += "!"; // происходит пересоздание объекта типа String


        // Одинаковое всё. Один и тот же объект
        String str0_1 = "Hello world";
        String str0_2 = "Hello world";

      /*  String str1_1;
        String str1_2;

        Scanner scanner = new Scanner(System.in);

        System.out.print("str1_1 : ");
        str1_1 = scanner.next();
        System.out.print("str1_2 : ");
        str1_2 = scanner.next();

        System.out.println(
                "Сравнение ссылок str0_1 и str0_2 = "
                        + (str0_1 == str0_2));

        System.out.println(
                "Сравнение ссылок str1_1 и str1_2 = "
                        + (str1_1 == str1_2));

        // Базовые методы работы со строками
        // toString();
*/
        Cat cat1 = new Cat("Cat1", 10);
        System.out.println("Информация о cat1 : ");
        System.out.println(cat1.toString());

        Dog dog1 = new Dog("Dog1", 3);
        System.out.println("Информация о dog1 : ");
        System.out.println(dog1.toString());

        Fish fish1 = new Fish("Fish1", 3);
        System.out.println("Информация о fish1 : ");
        System.out.println(fish1.toString());

        // contains() - проверяется содержится-ли
        // последовательный набор символов в строке
        String example1Str = "Hello world!";
        System.out.println("Hello world! содержит world = " +
                example1Str.contains("world"));

        // indexOf() - возвращает индекс первого вхождения символа в строку
        System.out.println("Индекс первого вхождения символа a в строку " +
                "Hello world = " + example1Str.indexOf("a"));
        System.out.println("Индекс первого вхождения символа w в строку " +
                "Hello world = " + example1Str.indexOf("w"));

        // lastIndexOf() - возвращает индекс последнего вхождения символа в строку
        System.out.println("Индекс последнего вхождения символа a в строку " +
                "Hello world = " + example1Str.lastIndexOf("a"));
        System.out.println("Индекс последнего вхождения символа o в строку " +
                "Hello world = " + example1Str.lastIndexOf("o"));

        // toLowerCase() - создает новую строку, с символами возведенными в нижний регистр
        String example2Str = "Hello, I am Java!";
        System.out.println(example2Str.toLowerCase());

        // toUpperCase() - создает новую строку, с символами возведенными в верхний
        System.out.println(example2Str.toUpperCase());

        // lenght() - возвращает длину строки
        System.out.println("Длина строки example2Str = " + example2Str.length());

        // isEmpty() - возвращает true, если строка пуста. false, eсли содержит хотя бы один символ
        System.out.println(example2Str.isEmpty());

        // toByteArray() - переводит строку в массив байтов. Используется при АБСОЛЮТНО всех операцииях
        //                ввода/вывода

        // equals(String str2) - сравнивает строки, по строковому значению
        System.out.println("example1Str.equals(example2Str) = " +
                example1Str.equals(example2Str));

        // Пример 1
        String adminLogin = "Admin";
        String inputLogin = "ADMIN";

        boolean isCorrectLogin = (adminLogin.toLowerCase()).
                equals(inputLogin.toLowerCase());
        System.out.println("Логины совпадают - " + isCorrectLogin);

        // Символ char
        // char - индекс который указывает на символ в кодировочной таблице.
        //        по-умолчанию, это UTF-16

        // Получение индекса элемента Unicode UTF-16
        char a = 'а';
        int b = a;
        System.out.println(b);

        // Домашнее задание.
        // Реализовать программу реализ. шифр Цезаря.
        // Ключ вводится с клавиатуры.
        // Программа должна уметь шифровать и дешифровать текст.

        int k = 10;
        // Результат операции - 10
        int cd = (++k > k++) ? 10 : 11;

        int A = 10;
        int B = 20;
        int C = 30;
        int D = 40;

        int G = ((A * 2) > B) ?
                ((C < D / 2) ? A : B) :
                (D + 3 > A ? C : D);
        // Чему равна G = C = 30?
    }
}
