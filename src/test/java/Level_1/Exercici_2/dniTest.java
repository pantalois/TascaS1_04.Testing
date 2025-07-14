package Level_1.Exercici_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class dniTest {

    private CalculoDni calculoDni1;
    private CalculoDni calculoDni2;
    private CalculoDni calculoDni3;
    private CalculoDni calculoDni4;
    private CalculoDni calculoDni5;
    private CalculoDni calculoDni6;
    private CalculoDni calculoDni7;
    private CalculoDni calculoDni8;
    private CalculoDni calculoDni9;
    private CalculoDni calculoDni10;

    static{
        CalculoDni calculoDni1 = new CalculoDni(11111111);
        CalculoDni calculoDni2 = new CalculoDni(22222222);
        CalculoDni calculoDni3 = new CalculoDni(33333333);
        CalculoDni calculoDni4 = new CalculoDni(44444444);
        CalculoDni calculoDni5 = new CalculoDni(55555555);
        CalculoDni calculoDni6 = new CalculoDni(66666666);
        CalculoDni calculoDni7 = new CalculoDni(77777777);
        CalculoDni calculoDni8 = new CalculoDni(88888888);
        CalculoDni calculoDni9 = new CalculoDni(99999999);
        CalculoDni calculoDni10 = new CalculoDni(12345678);
    }

    @Test
    public void calculateDni(){
        assertEquals('H', calculoDni1.getDniLetter());
        assertEquals('J', calculoDni2.getDniLetter());
        assertEquals('P', calculoDni3.getDniLetter());
        assertEquals('A', calculoDni4.getDniLetter());
        assertEquals('K', calculoDni5.getDniLetter());
        assertEquals('Q', calculoDni6.getDniLetter());
        assertEquals('B', calculoDni7.getDniLetter());
        assertEquals('H', calculoDni8.getDniLetter());
        assertEquals('H', calculoDni9.getDniLetter());
        assertEquals('H', calculoDni10.getDniLetter());

    }
}


