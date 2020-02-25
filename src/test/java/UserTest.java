import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    //Object equality test
    @Test
    public void objectEquality(){
        User userOne = new User("Us", "Er", 18);
        User userOneCopy = userOne;
        User userTwo = new User("Us", "Er", 18);

        Assert.assertEquals(true, userOne.equals(userOne));
        Assert.assertEquals(true, userOne.equals(userOneCopy));
        Assert.assertEquals(true, userOneCopy.equals(userTwo));
        Assert.assertEquals(true, userOne.equals(userTwo));
    }

    //Object identity test
    @Test
    public void objectIdentity(){
        User userOne = new User("Us", "Er", 18);
        User userOneCopy = userOne;
        User userTwo = new User("Us", "Er", 18);

        Assert.assertEquals(true, userOne == userOne);
        Assert.assertEquals(true, userOne == userOneCopy);
        Assert.assertEquals(false, userOne == userTwo);
    }

    //Timeout test
    @Test(timeout = 100)       //Timeouts are always in milliseconds
    public void objectIdentityTimeout(){
        User userOne = new User("Us", "Er", 18);
        User userOneCopy = userOne;
        User userTwo = new User("Us", "Er", 18);

        Assert.assertEquals(true, userOne == userOne);
        Assert.assertEquals(true, userOne == userOneCopy);
        Assert.assertEquals(false, userOne == userTwo);
    }

    //Deliberate fail test
    @Test
    public void fail(){
        User userOne = new User("Us", "Er", 18);
        User userTwo = new User("Us", "Er", 18);

        Assert.assertEquals(true, userOne == userTwo);

    }

    //Diasbling test
    @Ignore
    @Test
    public void ignoredTest(){
        User userOne = new User("Us", "Er", 18);
        User userTwo = new User("Us", "Er", 18);

        Assert.assertEquals(true, userOne.equals(userTwo));
    }
}