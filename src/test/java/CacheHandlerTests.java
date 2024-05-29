
import org.junit.jupiter.api.*;
import ru.inno.tasks.Fractionable;
import ru.inno.tasks.Utilty;

public class CacheHandlerTests {

    TestFraction testFraction = new TestFraction(1, 4);
    Fractionable fraction = Utilty.cache(testFraction);

    @Test
    @DisplayName("Methods without annotation")
    public void testNoAnnotation() {
        fraction.toString();
        fraction.toString();
        fraction.toString();
        Assertions.assertEquals(testFraction.count, 3);
    }

    @Test
    @DisplayName("Methods with annotation without clearing cache")
    public void testCacheNoClear() {
        fraction.doubleValue();
        fraction.doubleValue();
        fraction.toString();
        fraction.doubleValue();
        Assertions.assertEquals(testFraction.count, 2);
    }
    @Test
    @DisplayName("Methods with annotation and cache clearing")
    public void testCacheClear() {
        fraction.doubleValue();
        fraction.setDenum(5);
        fraction.toString();
        fraction.doubleValue();
        fraction.setNum(2);
        fraction.doubleValue();
        fraction.doubleValue();
        Assertions.assertEquals(testFraction.count, 4);
    }


}
