import static org.junit.Assert.*;

public class ScientificCalculatorTest {
    private ScientificCalculator myMain = new ScientificCalculator();

    @org.junit.Test
    public void trigMethodsSine(){

        double delta = 10;
        double actualResult = myMain.trigMethods(1,90);
        assertEquals(1.0,actualResult,delta);
    }
    @org.junit.Test
    public void trigMethodsCos(){

        double delta = 10;
        double actualResult = myMain.trigMethods(1,90);
        assertEquals(1.0,actualResult,delta);
    }
    @org.junit.Test
    public void trigMethodsTan(){

        double delta = 10;
        double actualResult = myMain.trigMethods(1,90);
        assertEquals(1.0,actualResult,delta);
    }
    @org.junit.Test
    public void trigMethodsAsin(){

        double delta = 10;
        double actualResult = myMain.trigMethods(1,90);
        assertEquals(1.0,actualResult,delta);
    }
    @org.junit.Test
    public void trigMethodsAcos(){

        double delta = 10;
        double actualResult = myMain.trigMethods(1,90);
        assertEquals(1.0,actualResult,delta);
    }
    @org.junit.Test
    public void trigMethodsAtan(){

        double delta = 10;
        double actualResult = myMain.trigMethods(1,90);
        assertEquals(1.0,actualResult,delta);
    }


}
