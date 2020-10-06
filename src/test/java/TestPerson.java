import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    @Test
    public void testContructor(){
        Person person = new Person(1234L,"Mike");
        Long expected = 1234L;
        String expected1 = "Mike";
        Assert.assertEquals(expected, person.getNameId());
        Assert.assertEquals(expected1,person.getName());

    }

    @Test
    public void testSeName(){
        Person person = new Person(1234L,"John");
        person.setName("Mike");
        String expected = "Mike";
        Assert.assertEquals(expected,person.getName());

    }
}
