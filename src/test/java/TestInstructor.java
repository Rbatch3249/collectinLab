import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    @Test
    public void testImplementation(){
        Instructor instructor = new Instructor();
        boolean expected = true;
        boolean actual = instructor instanceof Teacher;
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testInheritance(){
        Instructor instructor = new Instructor();
        boolean expected = true;
        boolean actual = instructor instanceof Person;
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testEach(){
        Instructor instructor = new Instructor();

    }
    @Test
    public void testLecture(){

    }
}
