package TascaS1_04.Level_1.Exercici_1;

public class Main {
    public static void main(String[] args){

        Library library = new Library();

        library.setBookByPosition(89, "La sombra del viento");


        System.out.println(library.getBookByPosition(89));
        library.setBookByPosition(56, "Días de verano");
        System.out.println(library.getBookByPosition(56));
        library.setBookByPosition(89, "Tots el mestres");


        System.out.println(library.getBookByPosition(89));

        library.setBook("Tots el ");

    }
}