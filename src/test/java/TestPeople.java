import org.junit.Assert;
import org.junit.Test;

public class TestPeople {
    @Test
    public void testAdd(){
        People people = new People();
        Person person = new Person(123L,"Ryan");
        people.add(person);
        Assert.assertEquals(true,people.contains(person));
    }
    @Test
    public void testRemove(){
        People people = new People();
        Person person = new Person(123L,"Ryan");
        people.add(person);
        people.remove(person);
        Assert.assertEquals(false,people.contains(person));
    }
    @Test
    public void testFindById(){
        People people = new People();
        Person person = new Person(123L,"Ryan");
        people.add(person);
        Assert.assertEquals(person,people.findById(123L));
    }
}
