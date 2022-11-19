import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        System.out.println("Сумма всех продаж = " + service.findSumSales(sales));
        System.out.println("Средняя сумма продаж в месяц = " + service.findAverageSales(sales));
        System.out.println("Последний месяц продаж на минимальную сумму - " + service.minSales(sales));
        System.out.println("Последний месяц продаж на максимальную сумму - " + service.maxSales(sales));
        System.out.println("Количество месяцев, когда продажи были ниже среднего - " + service.belowAverageSales(sales));
        System.out.println("Количество месяцев, когда продажи были выше среднего - " + service.aboveAverageSales(sales));


    }


}
