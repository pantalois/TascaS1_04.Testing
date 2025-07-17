package Level_1.Exercici_3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import Level_1.Exercici_3.ErrorClass;
import static org.junit.jupiter.api.Assertions.*;

public class TestHandleArrayOutOfIndexBounds {

    @Test
    public void handleArrayOutOfIndexBounds(){
        ErrorClass errorClass = new ErrorClass(5);

        assertThrows(IndexOutOfBoundsException.class, () -> errorClass.addData(7));
    }

}

