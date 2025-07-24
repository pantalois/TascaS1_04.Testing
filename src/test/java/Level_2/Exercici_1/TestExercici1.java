package Level_2.Exercici_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TestExercici1 {

    @Test
    public void valueOfTwoObjectsIsTheSame(){
        int myFirstValue = 10;
        int mySecondValue = 10;

        assertEquals(Main.getValue(myFirstValue), Main.getValue(mySecondValue), "The value of both objects should be the same");
    }
    @Test
    public void valueOfTwoObjectsIsDifferent(){
        Integer myFirstValue = 10;
        int mySecondValue = 5;

        assertNotEquals(Main.getValue(myFirstValue), Main.getValue(mySecondValue), "The value of both objects should be the different");
    }
}
