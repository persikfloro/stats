import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    @Test
    public void findSumSales() {
        StatsService service = new StatsService();
        long expected = 180;
        long actual = service.findSumSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findAverageSales() {
        StatsService service = new StatsService();
        long expected = 15;
        long actual = service.findAverageSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxSales() {
        StatsService service = new StatsService();

        long expected = 8;
        long actual = service.maxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void belowAverageSales() {
        StatsService service = new StatsService();

        long expected = 5;
        long actual = service.belowAverageSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void aboveAverageSales() {
        StatsService service = new StatsService();

        long expected = 7;
        long actual = service.aboveAverageSales(sales);

        Assertions.assertEquals(expected, actual);
    }

}
