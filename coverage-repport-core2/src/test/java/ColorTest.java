import com.poc.color.Color;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ColorTest {

    @Test
    public void blue() {
        Color color = new Color();
        assertEquals("blue",color.blue());
    }
}