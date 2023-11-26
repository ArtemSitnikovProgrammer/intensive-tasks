package com.walking.intensive.chapter1.task1;

/**
 * �������: <a href="https://geometry-math.ru/homework/Java-age.html">������</a>
 */
public class Task1 {
    public static void main(String[] args) {
//        ��� ����������� �������� ������ ������ ����� ��������� � ���� ������
        int age = 21;

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {

        int oneLastDigit, twoLastDigits;

        twoLastDigits = age % 100;
        if (twoLastDigits == 11 || twoLastDigits == 12 || twoLastDigits == 13 || twoLastDigits == 14){
            return "��� " + age + " ���";
        }

        oneLastDigit = age % 10;
        if (oneLastDigit == 1) {
            return "��� " + age + " ���";
        }
        if (oneLastDigit == 2 || oneLastDigit == 3 || oneLastDigit == 4) {
            return "��� " + age + " ����";
        }

        return "��� " + age + " ���";
    }
}