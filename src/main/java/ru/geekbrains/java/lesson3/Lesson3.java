package ru.geekbrains.java.lesson3;

public class Lesson3 {
    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        massTake(5,7);





    }

    public static void invertArray() {
        int[] arr = {1, 0, 1, 0, 0, 1};

        for (int i = 0; i < arr.length; i++)
            if (arr[i] == 1) {
                arr[i] = 0;
            } else arr[i] = 1;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.print("\n");
    }

    public static void fillArray() {
        int[] arr = new int[100];
        int a = 0;
        for (int i = 0; i < arr.length; ++i, a = a+1) {
            System.out.print((arr[i] + 1) + a + " ");

        }
        System.out.print("\n");
    }

    public static void changeArray() {
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.printf(arr[i] + " ");

        }
        System.out.print("\n");
    }

    public static void fillDiagonal() {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                } else if (j == i + 3) {
                    arr[i][j] = 1;
//                } else if (j + 1 == i + 2) {
//                    arr[i][j] = 1;
//                } else if (j == i + 1) {
//                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }



    }
    public static void massTake(int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }
    }




}