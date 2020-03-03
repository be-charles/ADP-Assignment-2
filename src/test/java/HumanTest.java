import org.junit.Test;

import static org.junit.Assert.*;

public class HumanTest {

    @Test
    public void isMammal(){
        Human h = new Human();
        assertEquals(true, h instanceof Mammal);
    }
}