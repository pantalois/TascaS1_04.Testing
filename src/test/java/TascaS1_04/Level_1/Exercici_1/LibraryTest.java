package TascaS1_04.Level_1.Exercici_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test
    void bookCollectionIsNotNull() {
        var library = new Library();
        assertNotNull(library.booksCollection);
    }

    @Test
    void bookCollectionLenghtIsRight(){
        var library = new Library();
        int i = 0;
        while (i < 5){
            library.setBook("Book " + Integer.toString(i));
            i++;
        }
        assertEquals(i, library.getBookCollection().size());
    }

    @Test
    void rightBookPosition(){
        var library = new Library();
        library.setBookByPosition(1, "La sombra del viento");
        System.out.println(library.getBookByPosition(1));
        assertEquals("La sombra del viento", library.getBookByPosition(1));
    }
}