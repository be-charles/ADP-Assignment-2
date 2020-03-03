import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class DogTest {

    //Polymorphism
    @Test
    public void isMammal(){
        Dog d = new Dog();
        assertEquals(true, d instanceof Mammal);
    }
}