package com.company;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.print("Input a number...:");
        int num=in.nextInt();
        System.out.println("Задание № 1:  "+lastNumber(num));
        System.out.println("Задание № 2:  "+sum(num));
        System.out.println("Задание № 3:  "+check(num));
        System.out.println("Задание № 4:  "+fourthTask(num));
        System.out.println("Введите положительное число 1:  ");
        int firstnum=in.nextInt();
        System.out.println("Введите положительное число 2:  ");
        int secondnum=in.nextInt();
        System.out.println("Введите положительное число 3:  ");
        int thirdnum=in.nextInt();
        System.out.println("Задание № 5:  "+fifthTask(firstnum,secondnum,thirdnum));
        System.out.println("Задание № 6:  ");
        sixTask(num);
        System.out.println("Введите код города:  ");
        int cityCode=in.nextInt();
        System.out.println("Задание № 7:  ");
        telephone(cityCode);
        System.out.println("Задание № 8:  ");
        yyy();
        //System.out.println(arrayNum[arrayNum.length-1]);

    }

    static int lastNumber(int num)
    {

        int lastCharacter=num%10;
        return abs(lastCharacter);
    }

    static int sum(int num)
    {
        String number=String.valueOf(abs(num));
        String arrayNum[]=number.split(""); //другой вариант
        int numArr[] = new int[arrayNum.length];
        int b=0;
        for(int i=0;i<arrayNum.length;i++) {
            numArr[i] = Integer.parseInt(arrayNum[i]);
            b+=numArr[i];
        }
        return b;
    }

    static int check(int num)
    {
        if (num>0)
        {
            num++;
            return num;
        }
       return num;
    }

    static int fourthTask(int num)
    {
        if (num>0)
        {
            num++;
            return num;
        }
       else if (num<0)
        {
            num=num-2;
            return num;
        }
       else
        {
            num=10;
            return num;
        }

    }

    static int fifthTask(int fistnum,int secondnum, int thirdnum)
    {
        int h;
        int y;
        int m;
        h=min(fistnum,secondnum);
        y=min(h,thirdnum);
        return y;

    }

    static void  sixTask(int num)
    {

        if (num>0 & num%2==0)
        {
            System.out.print("Положительное четное число");

        }
        else if (num>0 & num%2!=0)
        {
            System.out.print("Положительное нечетное число");
        }
        else if (num<0 & num%2!=0)
        {
            System.out.print("Отрицательное нечетное число");
        }
        else if (num<0 & num%2==0)
        {
            System.out.print("Отрицательное четное число");
        }
        else
        {
            System.out.print("Нулевое число");
        }

    }

    static void telephone(int cityCode)
    {
        int direction=10;
        double price;
        switch (cityCode)
        {
            case 905:
                price=direction*4.15;
                System.out.println("Москва.Стоимость разговора  "+price);
                break;

            case 194:
                price=direction*1.98;
                System.out.println("Ростов.Стоимость разговора  "+price);
                break;
            case 491:
                price=direction*2.69;
                System.out.println("Краснодар.Стоимость разговора  "+price);
                break;
            case 800:
                price=direction*5.00;
                System.out.println("Киров.Стоимость разговора  "+price);
                break;
            default:
                System.out.println("Код не задан в системе");
                break;
        }
    }

    static void yyy() {
        int[] mass = {1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};
        Arrays.sort(mass);
        int max=mass[mass.length-1];
        System.out.println("Максимальный элемент массива:  "+max);
        int sumPol=0;
        int sumOrt=0;
        int count=0;
        double srednee=0;
        int sumOrt1=0;
        int count2=0;
        for (int i=0;i<mass.length;i++)
        {
            if(mass[i]>0)
            {
                sumPol+=mass[i];
                count++;
            }

            else if (mass[i]<0 & mass[i]%2==0)
            {
                sumOrt+=mass[i];
                continue;
            }
            else if (mass[i]<0 )
            {
                sumOrt1+=mass[i];
                count2++;
                srednee=sumOrt1/count2;
            }
        }
        System.out.println("Сумма положительных элементов массива  "+sumPol);
        System.out.println("Сумма отрицательных четных  элементов массива  "+sumOrt);
        System.out.println("Количество положительных элементов массива  "+count);
        System.out.println("Среднее арифмитическое отрицательных элементов  "+srednee);

    }
}
