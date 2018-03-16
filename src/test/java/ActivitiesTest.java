import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ActivitiesTest {

    private Activities activities = new Activities();

    @Test
    void jButtonRunActionPerformed() {
        Object expectedValue = "*3+ /2";
        Object actualValue = activities.jButtonRunActionPerformed("(1+2)*3+(5-2)/2");
        assertEquals(expectedValue, actualValue);
    }
}