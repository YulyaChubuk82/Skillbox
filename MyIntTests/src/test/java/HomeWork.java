import junit.framework.Assert;
import org.junit.Test;

public class HomeWork {
    @Test
    public void testMark2() {
        var actualResult = getMarkResult(0);
        Assert.assertEquals("2", actualResult);
    }
    @Test
    public void testMark3() {
        var actualResult = getMarkResult(56);
        Assert.assertEquals("3", actualResult);
    }
    @Test
    public void testMark4() {
        var actualResult = getMarkResult(71);
        Assert.assertEquals("4", actualResult);
    }
    @Test
    public void testMark5() {
        var actualResult = getMarkResult(100);
        Assert.assertEquals("5", actualResult);
    }

    private String getMarkResult(Integer mark)
    {
        if(mark>=0 && mark <=35) return "2";
        if(mark>35 && mark <=56) return "3";
        if(mark>56 && mark<71) return "4";
        if(mark>72 && mark<100) return "5";
        return "no mark result";
    }

}
