import org.junit.Assert;
import org.junit.Test;

public class PersonTest {
    @Test
    public void testPersonConstructor(){
        Person p = new Person();
        Assert.assertNotNull(p);
    }
}
