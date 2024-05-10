package school.lesson1;

import java.util.Arrays;

public class Tasks {
    /*1. Создайте метод printThreeWords(), который при вызове должен
    отпечатать в столбец три слова: Orange, Banana, Apple.*/
    public static void printThreeWords() {
        System.out.println("Orange,");
        System.out.println("Banana,");
        System.out.println("Apple");
    }
    /*2. Создайте метод checkSumSign(), в теле которого объявите две int
    переменные a и b, и инициализируйте их любыми значениями, которыми захотите.
    Далее метод должен просуммировать эти переменные, и если их сумма больше
    или равна 0, то вывести в консоль сообщение “Сумма положительная”,
    в противном случае - “Сумма отрицательная”; */
    public static void checkSumSign() {
        int a = 0;
        int b = 10;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    /*3. Создайте метод printColor() в теле которого задайте int переменную value
    и инициализируйте ее любым значением. Если value меньше 0 (0 включительно),
    то в консоль метод должен вывести сообщение “Красный”, если лежит в пределах
    от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”, если больше 100
    (100 исключительно) - “Зеленый”;*/
    public static void printColor() {
        int value = 10;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value >= 1 && value <=100) {
            System.out.println("Желтый");
        } else if (value >= 101) {
            System.out.println("Зеленый");
        }
    }
    /*4. Создайте метод compareNumbers(), в теле которого объявите две int
    переменные a и b, и инициализируйте их любыми значениями, которыми захотите.
    Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”,
    в противном случае “a < b”;*/
    public static void compareNumbers() {
        int a = 10;
        int b = 20;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
    /*5. Напишите метод, принимающий на вход два целых числа и проверяющий, что их
    сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
    в противном случае – false.*/
    public static void compareTwoNumbers() {
        int a = 10;
        int b = 20;
        int c = a + b;
        if (c >= 10 && c <=20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
    /*6. Напишите метод, которому в качестве параметра передается целое число,
    метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    Замечание: ноль считаем положительным числом.*/
    public static void numberInfo() {
        int a = 10;
        if (a >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }
    /*7. Напишите метод, которому в качестве параметра передается целое число. Метод
    должен вернуть true, если число отрицательное, и вернуть false если положительное.*/
    public static void numberCheck() {
        int a = 10;
        if (a >= 0) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }
    /*8. Напишите метод, которому в качестве аргументов передается строка и число,
    метод должен отпечатать в консоль указанную строку, указанное количество раз;*/
    public static void printText() {
        String s = "Hello";
        for (int a = 0; a < 5; a++)
            System.out.println(s);
    }
    /*9. Напишите метод, который определяет, является ли год високосным, и возвращает
    boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным,
    кроме каждого 100-го, при этом каждый 400-й – високосный.*/
    public static void defineYear() {
        int y = 100;
        if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
    /*10. Задать целочисленный массив, состоящий из элементов 0 и 1. Например:
    [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;*/
    public static void arrayNew() {
        int[] arr = {1, 1, 1, 0, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i]++;
            } else {
                arr[i]--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    /*11. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить
    его значениями 1 2 3 4 5 6 7 8 ... 100;*/
    public static void emptyArray() {
        int[] arr1 = new int[100];
        int value = 1;
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = value;
            value++;
        }
        System.out.println(Arrays.toString(arr1));
    }
    /*12. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
    и числа меньшие 6 умножить на 2;*/
    public static void arrayNew1() {
        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < 6) {
                arr2[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
    /*13. Создать квадратный двумерный целочисленный массив (количество строк и столбцов
    одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами
    (можно только одну из диагоналей, если обе сложно). Определить элементы одной из
    диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0],
    [1][1], [2][2], ..., [n][n];*/
    public static void arrayTable() {
        int[][] arr3 = new int[4][4];
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3.length; j++) {
                if (i == j) {
                    arr3[i][j] = 1;
                }
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
    /*14. Написать метод, принимающий на вход два аргумента: len и initialValue, и
    возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue.*/
    public static void ArrayLength() {
        int len = 5;
        int initialValue = 2;
        int[] arr4 = new int[len];
        for (int i = 0; i < arr4.length; i++) {
            arr4[i] = initialValue;
        }
        System.out.println(Arrays.toString(arr4));
    }
}
