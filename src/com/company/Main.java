package com.company;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.*;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.print("Введите число...:");
        int num = in.nextInt();
        System.out.println("Задание № 1:  " + lastNumber(num));

        System.out.println("Задание № 2:  " + sum(num));

        System.out.println("Задание № 3:  " + check(num));

        System.out.println("Задание № 4:  " + fourthTask(num));

        System.out.println("Задание № 5:  " +fifthTask());



        System.out.println("Задание № 6:  ");
        SignDetermination(num);
        ParityDetermination(num);

        System.out.println("Введите код города:  ");
        int cityCode = in.nextInt();
        System.out.println("Задание № 7:  ");
        telephone(cityCode);

        System.out.println("Задание № 8:  ");
        eightTask();

        System.out.println("Задание № 9");
        nineTask();

        System.out.println("Задание № 10");
        tenTask();
    }

    static int lastNumber(int num) {
        int lastCharacter = num % 10;
        return abs(lastCharacter);
    }

    static int sum(int num) {
        String number = String.valueOf(abs(num));
        String arrayNum[] = number.split("");
        int numArr[] = new int[arrayNum.length];
        int b = 0;
        for (int i = 0; i < arrayNum.length; i++) {
            numArr[i] = Integer.parseInt(arrayNum[i]);
            b += numArr[i];
        }
        return b;
    }

    static int check(int num) {
        if (num > 0) {
            num++;
            return num;
        }
        return num;
    }

    static int fourthTask(int num) {
        if (num > 0) {
            num++;
            return num;
        } else if (num < 0) {
            num = num - 2;
            return num;
        } else {
            num = 10;
            return num;
        }

    }

    static int[] arrayCreator() {

      int[]array=new int[3];
      for(int i=0;i<3;i++) {
          System.out.println("Введите число...");
          int num=in.nextInt();
          array[i]=num;
      }
      return array;

    }

    static int minElement(int[] array) {

     /*  int temp;
        int j;
        for (int i = 0; i < array.length; i++)
        {
            for (j = i + 1; j < array.length; j++)
            {
                if (array[i] > array[j] )
                {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            if (j == array.length) {
                break;
            }
        }
        return array[0];
    }*/


        int min = 0;
        for (int i = 0; i < array.length - 1; i++) {
            int x = array[i];
            int y = array[i + 1];

            if (x < y) {
                if (i == 0) {
                    min = x;
                } else {
                    if (min > x) {
                        min = x;
                    }
                }
            }
            else {
                if (i == 0) {
                    min = y;
                } else {
                    if (min > y) {
                        min = y;
                    }
                }
            }
        }
        return min;
    }

    static int fifthTask() {
        int []array=arrayCreator();
        return minElement(array);
    }

    static void SignDetermination(int num) {

        if (num>0){
            System.out.print("Положительное ");
        }
        else if(num==0){
            System.out.println("Нулевое число");
        }
        else {
            System.out.print("Отрицательное ");
        }
    }
    static void ParityDetermination(int num) {
        if(num%2==0 & num!=0){
            System.out.println("четное число");
        }
        else if(num%2!=0 & num!=0) {
            System.out.println("нечетное число");
        }

    }

    static void telephone(int cityCode) {
        int direction = 10;
        double price;
        switch (cityCode) {
            case 905:
                price = direction * 4.15;
                System.out.println("Москва.Стоимость разговора  " + price);
                break;
            case 194:
                price = direction * 1.98;
                System.out.println("Ростов.Стоимость разговора  " + price);
                break;
            case 491:
                price = direction * 2.69;
                System.out.println("Краснодар.Стоимость разговора  " + price);
                break;
            case 800:
                price = direction * 5.00;
                System.out.println("Киров.Стоимость разговора  " + price);
                break;
            default:
                System.out.println("Код не задан в системе");
                break;
        }
    }

    static void eightTask() {
        int[] mass = {1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};
        Arrays.sort(mass);
        int max = mass[mass.length - 1];
        System.out.println("Максимальный элемент массива:  " + max);

        int sumPositiveNumbers = 0;
        int sumNegativeNumbers = 0;
        int countPositiveNumbers = 0;
        double arithmeticMean = 0;
        double sumNegativeNumbersInterm = 0;
        double countNegativeNumbers = 0;

        for (int element : mass) {
            if (element > 0) {
                sumPositiveNumbers += element;
                countPositiveNumbers++;
            } else if (element < 0) {
                sumNegativeNumbersInterm += element;
                countPositiveNumbers++;
                arithmeticMean = sumNegativeNumbersInterm / countNegativeNumbers;

                if (element % 2 == 0) {
                    sumNegativeNumbers += element;
                }
            }

        }
        System.out.println("Сумма положительных элементов массива  " + sumPositiveNumbers);
        System.out.println("Сумма отрицательных четных  элементов массива  " + sumNegativeNumbers);
        System.out.println("Количество положительных элементов массива  " + countPositiveNumbers);
        System.out.println("Среднее арифмитическое отрицательных элементов  " + arithmeticMean);

    }

    static void nineTask() {
        int[] array = {15, 10, 51, -6, -5, 3, -10, -34, 0, 32, 56, -12, 24, -52};
        int[] newArray = new int[array.length];
        int index = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            newArray[index] = array[i];
            index++;
        }
        System.out.println(Arrays.toString(newArray));
    }

    static void tenTask() {
        int[] arr = {15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, -52};
        int[] newArray = new int[arr.length];
        int index = 0;
        for (int elem : arr) {
            if (elem != 0) {
                newArray[index] = elem;
                index++;
            }
        }
        System.out.println(Arrays.toString(newArray));
    }

}

