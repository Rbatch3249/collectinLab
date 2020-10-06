import org.junit.Assert;
import org.junit.Test;

public class TestStudent {
    @Test
    public void testImplementation(){
        Student student = new Student(3);
        boolean expected = true;
        boolean actual = student instanceof Learner;
        Assert.assertEquals(expected,actual);

    }
    @Test
    public void testInheritance(){
        Student student = new Student(4);
        boolean expected = true;
        boolean actual = student instanceof Person;
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testLearn(){
        Student student = new Student(5);
        student.learn(5);
        Object expected = 10.0;
        Object actual = student.getTotalStudyTime();
        Assert.assertEquals(expected,actual);
    }
}
