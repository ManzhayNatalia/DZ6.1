package ru.netology.javaqa.javaqamvn.statservice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatsServiceTest {

    @Test
    void sumSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 1};
        long actual = service.sumSales(sales);
        long expected = 163;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void avgSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 1};
        float expected = 13.583333f;
        float actual = service.avgSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void maxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 1};
        int actual = service.maxSales(sales);
        int expected = 8;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void miSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 1};
        int actual = service.minSales(sales);
        int expected = 12;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void lowMonthSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 1};
        int actual = service.lowMonthSales(sales);
        int expected = 4;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void highMonthSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 1};
        int actual = service.highMonthSales(sales);
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }
}
