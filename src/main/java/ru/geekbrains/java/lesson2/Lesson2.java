package ru.geekbrains.java.lesson2;

public class Lesson2 {
    public static void main(String[] args) {

        within10and20(1,9);
        System.out.println(within10and20(1,9));
        isPositiveOrNegative(-8);
        isNegative(8);
        System.out.println(isNegative(8));
        printWordNTimes("Sergey", 3);
        whatYear(1985);
        System.out.println(whatYear(1985));
    }

    public static boolean within10and20(int a, int b) {
        int c = a + b;
        return (c >= 10 && c <= 20);
    }
    public static void isPositiveOrNegative(int a){
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }

    }
    public static boolean isNegative(int a){
        if (a > 0) {
            return false;
        } else {
            return false ;
        }
    }
    public static void printWordNTimes(String str, int a) {
        for (int i = 1; i <= a; i++) {
            System.out.println("[" + i + "]" + " " + str);
        }
    }
    public static boolean whatYear(int a) {
        if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }


}

