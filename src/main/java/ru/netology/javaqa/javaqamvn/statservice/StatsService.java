package ru.netology.javaqa.javaqamvn.statservice;

public class StatsService {
    public long sumSales(long[] sales) {
        long sumSales = 0;
        for (long sale : sales) {
            sumSales = sale + sumSales;
        }
        return sumSales;
    }

    public float avgSales(long[] sales) {
        float avgSales = (float) sumSales(sales) / sales.length;
        return avgSales;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int lowMonthSales(long[] sales) {
        int cnt = 0;
        float avgSales = avgSales(sales);
        for (long sale : sales) {
            if (avgSales > sale) {
                cnt++;
            }
        }
        return cnt;
    }

    public int highMonthSales(long[] sales) {
        int cnt = 0;
        float avgSales = avgSales(sales);
        for (long sale : sales) {
            if (avgSales < sale) {
                cnt++;
            }
        }
        return cnt;
    }
}

