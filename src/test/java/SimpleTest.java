import org.junit.Assert;
import org.testng.annotations.Test;

/**
 * Created by Denis on 28.08.2017.
 */
public class SimpleTest {

    @Test
    public void test() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(false);
    }
}
