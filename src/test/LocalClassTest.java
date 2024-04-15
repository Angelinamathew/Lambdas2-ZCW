import org.junit.Assert;
import org.junit.Test;

public class LocalClassTest {
    @Test
    public void testConstructor(){
        LocalClass localClass = new LocalClass();
        Assert.assertNotNull(localClass);
    }
    @Test
    public void testLocalClassInstanceOfCheckPerson(){
        LocalClass localClass = new LocalClass();
        Assert.assertTrue(localClass instanceof CheckPerson);
    }

    @Test
    public void testLocalClassfalse() {
        LocalClass localClass = new LocalClass();
        Person p = new Person();
        p.setAge(20);
        Assert.assertFalse(localClass.test(p));
    }
    @Test
    public void testLocalClassTrue() {
        LocalClass localClass = new LocalClass();
        Person p = new Person();
        p.setAge(50);
        Assert.assertTrue(localClass.test(p));
    }

}
