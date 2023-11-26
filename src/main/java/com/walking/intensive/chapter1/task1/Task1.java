package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Task1 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        int age = 21;

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {

        int oneLastDigit, twoLastDigits;

        twoLastDigits = age % 100;
        if (twoLastDigits == 11 || twoLastDigits == 12 || twoLastDigits == 13 || twoLastDigits == 14){
            return "Вам " + age + " лет";
        }

        oneLastDigit = age % 10;
        if (oneLastDigit == 1) {
            return "Вам " + age + " год";
        }
        if (oneLastDigit == 2 || oneLastDigit == 3 || oneLastDigit == 4) {
            return "Вам " + age + " года";
        }

        return "Вам " + age + " лет";
    }
}