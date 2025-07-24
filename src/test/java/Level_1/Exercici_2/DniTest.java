package Level_1.Exercici_2;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class DniTest {

    @ParameterizedTest
    @CsvSource({
            "11111111, H",
            "22222222, J",
            "33333333, P",
            "44444444, A",
            "55555555, K",
            "66666666, Q",
            "77777777, B",
            "88888888, Y",
            "99999999, R",
            "12345678, Z"
    })
    void calculateDniLetter(int dniNumber, char expectedLetter) {
        CalculoDni calculoDni = new CalculoDni(dniNumber);

        assertEquals(expectedLetter, calculoDni.getDniLetter(), "The letter for the DNI " + dniNumber + " is not the one that we expected.");
    }
}
