package Level_1.Exercici_2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CalculoDni {
    int dniNumber;

    public CalculoDni(int dniNumber) {
        this.dniNumber = dniNumber;

    }
    public char getDniLetter() {
        ArrayList<Character> letters = new ArrayList<>(List.of('T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'));
        int module = this.dniNumber % 23;
        return letters.get(module);
    }
}
