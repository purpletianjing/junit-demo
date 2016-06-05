import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CaculateTest {
    @Test
    public void evaluatesExpression() {
        Caculate caculate = new Caculate();
        int sum = caculate.evaluate("1+2+3");
        assertEquals(6,sum);
    }

}
