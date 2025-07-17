package Level_1.Exercici_1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {
    private Library library;

    @BeforeEach
    public void setUp() {
        library = new Library();
    }

    @Test
    public void testListIsNotNull() {
        assertNotNull(library.getBooks());
    }

    @Test
    public void testSizeAfterInsertingBooks() {
        library.addBook(new Book("Don Quixote"));
        library.addBook(new Book("1984"));
        library.addBook(new Book("One Hundred Years of Solitude"));

        assertEquals(3, library.getSize());
    }

    @Test
    public void testBookInCorrectPosition() {
        library.addBook(new Book("Don Quixote"));
        library.addBook(new Book("1984"));
        library.addBook(new Book("One Hundred Years of Solitude"));

        assertEquals("1984", library.getTitleByPosition(0));
        assertEquals("Don Quixote", library.getTitleByPosition(1));
        assertEquals("One Hundred Years of Solitude", library.getTitleByPosition(2));
    }

    @Test
    public void testNoDuplicates() {
        library.addBook(new Book("Don Quixote"));

        assertThrows(IllegalArgumentException.class, () -> {
            library.addBook(new Book("Don Quixote"));
        });

        assertEquals(1, library.getSize());
    }

    @Test
    public void testRetrieveTitleByPosition() {
        library.addBook(new Book("Harry Potter"));
        library.addBook(new Book("The Hobbit"));

        assertEquals("Harry Potter", library.getTitleByPosition(0));
        assertEquals("The Hobbit", library.getTitleByPosition(1));


    }

    @Test
    public void testAddingBookModifiesList() {
        int initialSize = library.getSize();
        library.addBook(new Book("New Book"));

        assertEquals(initialSize + 1, library.getSize());
    }

    @Test
    public void testRemovingBookDecreasesSize() {
        library.addBook(new Book("Book 1"));
        library.addBook(new Book("Book 2"));

        int initialSize = library.getSize();
        boolean removed = library.removeBookByTitle("Book 2");

        assertTrue(removed);
        assertEquals(initialSize - 1, library.getSize());
    }

    @Test
    public void testListRemainsAlphabeticallySorted() {
        library.addBook(new Book("Zebra"));
        library.addBook(new Book("Alpha"));
        library.addBook(new Book("Middle"));

        List<Book> list = library.getBooks();
        assertEquals("Alpha", list.get(0).getTitle());
        assertEquals("Middle", list.get(1).getTitle());
        assertEquals("Zebra", list.get(2).getTitle());

        library.removeBookByTitle("Middle");
        list = library.getBooks();
        assertEquals("Alpha", list.get(0).getTitle());
        assertEquals("Zebra", list.get(1).getTitle());
        
        library.addBook(new Book("Beta"));
        list = library.getBooks();
        assertEquals("Alpha", list.get(0).getTitle());
        assertEquals("Beta", list.get(1).getTitle());
        assertEquals("Zebra", list.get(2).getTitle());
    }

    @Test
    public void testAddBookAtSpecificPosition() {
        library.addBook(new Book("A"));
        library.addBook(new Book("C"));

        library.addBookAtPosition(new Book("B"), 1);

        assertEquals("A", library.getTitleByPosition(0));
        assertEquals("B", library.getTitleByPosition(1));
        assertEquals("C", library.getTitleByPosition(2));
    }
}
