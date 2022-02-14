package ru.netology.sqr;

public class SQRService {

    public int sqaNum(int minLim, int highLim) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= minLim && i * i <= highLim) {
                counter = counter + 1;
            }
        }
        System.out.println("Количество квадратов чисел, попавших в диапазон: " + counter);
        return counter;
    }
}