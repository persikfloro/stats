package ru.netology.stats;

public class StatsService {
    public long findSumSales(long[] sales) { // Метод 1. Расчет суммы всех продаж
        long sumSales = 0;
        for (long value : sales) {
            sumSales += value;
        }
        return sumSales;
    }

    public long findAverageSales(long[] sales) { // Метод 2. Средняя сумма продаж в месяц
        long sumAverage = findSumSales(sales);
        return (long) sumAverage / sales.length;
    }

    public long maxSales(long[] sales) {// Метод 3. Последний месяц, в котором были продажи на максимальную сумму.
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public long minSales(long[] sales) {// Метод 4. Последний месяц, в котором были осуществлены продажи на минимальную сумму
        int minMonth = 0; // для хранения номера ячейки в массиве того месяца, в котором были минимальные продажи среди всех уже просмотренных
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale < sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public long belowAverageSales(long[] sales) { // Метод 5. Количество месяцев, когда продажи были ниже среднего
        long sumAverage = findAverageSales(sales);
        int belowMonth = 0; // для подсчета количества месяцев, когда продажи были ниже среднего
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sumAverage) {
                belowMonth = belowMonth + 1;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return belowMonth;
    }

    public long aboveAverageSales(long[] sales) { // Метод 6. Количество месяцев, когда продажи были выше среднего
        long sumAverage = findAverageSales(sales);
        int aboveMonth = 0; // для хранения количества месяцев, в котором были продажи ниже среднего
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sumAverage) {
                aboveMonth = aboveMonth + 1;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return aboveMonth;

    }
}