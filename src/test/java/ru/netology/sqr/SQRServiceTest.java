package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void sqaNum() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.sqaNum(200, 300);
        assertEquals(expected, actual);
    }

    @Test
    void sqrtCeilMinRangeStart() {
        SQRService service = new SQRService();
        int expected = 11;
        int actual = service.sqaNum(100, 400);
        assertEquals(expected, actual);
    }

    @Test
    void sqrtCeilMoreRangeStart() {
        SQRService service = new SQRService();
        int expected = 14;
        int actual = service.sqaNum(500, 1330);
        assertEquals(expected, actual);
    }
    // вне диапазон
    @Test
    void sqrtNotRange() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.sqaNum(16, 99);
        assertEquals(expected, actual);
    }
    @Test
    void sqrtMaxRange() {
        SQRService service = new SQRService();
        int expected = 90;
        int actual = service.sqaNum(100, 10_000);
        assertEquals(expected, actual);
    }
}