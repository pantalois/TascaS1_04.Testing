package Level_1.Exercici_2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DniTest {

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

    @BeforeEach
    public void setUp() {
         calculoDni1 = new CalculoDni(11111111);
         calculoDni2 = new CalculoDni(22222222);
         calculoDni3 = new CalculoDni(33333333);
         calculoDni4 = new CalculoDni(44444444);
         calculoDni5 = new CalculoDni(55555555);
         calculoDni6 = new CalculoDni(66666666);
         calculoDni7 = new CalculoDni(77777777);
         calculoDni8 = new CalculoDni(88888888);
         calculoDni9 = new CalculoDni(99999999);
         calculoDni10 = new CalculoDni(12345678);
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
        assertEquals('Y', calculoDni8.getDniLetter());
        assertEquals('R', calculoDni9.getDniLetter());
        assertEquals('Z', calculoDni10.getDniLetter());

    }
}


