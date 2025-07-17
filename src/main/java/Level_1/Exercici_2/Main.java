package Level_1.Exercici_2;

public class Main {
    public static void main(String[] args) {

        CalculoDni calculoDni1 = new CalculoDni(12345678);
        CalculoDni calculoDni2 = new CalculoDni(11111111);
        CalculoDni calculoDni3 = new CalculoDni(22222222);
        CalculoDni calculoDni4 = new CalculoDni(33333333);
        CalculoDni calculoDni5 = new CalculoDni(44444444);
        CalculoDni calculoDni6 = new CalculoDni(55555555);

        System.out.println(calculoDni1.getDniLetter());
        System.out.println(calculoDni2.getDniLetter());
        System.out.println(calculoDni3.getDniLetter());
        System.out.println(calculoDni4.getDniLetter());
        System.out.println(calculoDni5.getDniLetter());
        System.out.println(calculoDni6.getDniLetter());

    }
}
