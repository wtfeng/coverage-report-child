import com.poc.color.Color;
import org.junit.Test;

import static org.junit.Assert.*;

public class ColorTest {

    @Test
    public void red() {
        Color color = new Color();
        assertEquals("red",color.red());
    }
}