package unwsp.eat4j;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import unwsp.eat4j.api.EatAtUNWSP;

public class ApplicationTests {

    @Test
    public void test() {
        EatAtUNWSP api = new EatAtUNWSP();
        Assertions.assertNotNull(api.getMenuText());
    }
}
