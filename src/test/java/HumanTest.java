import static org.junit.Assert.*;

public class HumanTest {

    public void isMammal(){
        Human h = new Human();
        assertEquals(true, h instanceof Mammal);
    }
}