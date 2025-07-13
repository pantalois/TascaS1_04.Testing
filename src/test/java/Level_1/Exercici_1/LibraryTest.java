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
        library.addBook(new Book("Don Quixote", "Cervantes"));
        library.addBook(new Book("1984", "George Orwell"));
        library.addBook(new Book("One Hundred Years of Solitude", "García Márquez"));

        assertEquals(3, library.getSize());
    }

    @Test
    public void testBookInCorrectPosition() {
        library.addBook(new Book("Don Quixote", "Cervantes"));
        library.addBook(new Book("1984", "George Orwell"));
        library.addBook(new Book("One Hundred Years of Solitude", "García Márquez"));

        assertEquals("1984", library.getTitleByPosition(0));
        assertEquals("Don Quixote", library.getTitleByPosition(1));
        assertEquals("One Hundred Years of Solitude", library.getTitleByPosition(2));
    }

    @Test
    public void testNoDuplicates() {
        library.addBook(new Book("Don Quixote", "Cervantes"));

        assertThrows(IllegalArgumentException.class, () -> {
            library.addBook(new Book("Don Quixote", "Other Author"));
        });

        assertEquals(1, library.getSize());
    }

    @Test
    public void testRetrieveTitleByPosition() {
        library.addBook(new Book("Harry Potter", "J.K. Rowling"));
        library.addBook(new Book("The Hobbit", "Tolkien"));

        assertEquals("Harry Potter", library.getTitleByPosition(0));
        assertEquals("The Hobbit", library.getTitleByPosition(1));

        assertThrows(IndexOutOfBoundsException.class, () -> {
            library.getTitleByPosition(2);
        });
    }

    @Test
    public void testAddingBookModifiesList() {
        int initialSize = library.getSize();
        library.addBook(new Book("New Book", "New Author"));

        assertEquals(initialSize + 1, library.getSize());
        assertTrue(library.getBooks().stream()
                .anyMatch(book -> book.getTitle().equals("New Book")));
    }

    @Test
    public void testRemovingBookDecreasesSize() {
        library.addBook(new Book("Book 1", "Author 1"));
        library.addBook(new Book("Book 2", "Author 2"));

        int initialSize = library.getSize();
        boolean removed = library.removeBookByTitle("Book 1");

        assertTrue(removed);
        assertEquals(initialSize - 1, library.getSize());
    }

    @Test
    public void testListRemainsAlphabeticallySorted() {
        library.addBook(new Book("Zebra", "Author Z"));
        library.addBook(new Book("Alpha", "Author A"));
        library.addBook(new Book("Middle", "Author M"));

        List<Book> list = library.getBooks();
        assertEquals("Alpha", list.get(0).getTitle());
        assertEquals("Middle", list.get(1).getTitle());
        assertEquals("Zebra", list.get(2).getTitle());

        library.removeBookByTitle("Middle");
        list = library.getBooks();
        assertEquals("Alpha", list.get(0).getTitle());
        assertEquals("Zebra", list.get(1).getTitle());

        // Add a new book and verify order
        library.addBook(new Book("Beta", "Author B"));
        list = library.getBooks();
        assertEquals("Alpha", list.get(0).getTitle());
        assertEquals("Beta", list.get(1).getTitle());
        assertEquals("Zebra", list.get(2).getTitle());
    }

    @Test
    public void testAddBookAtSpecificPosition() {
        library.addBook(new Book("A", "Author A"));
        library.addBook(new Book("C", "Author C"));

        library.addBookAtPosition(new Book("B", "Author B"), 1);

        assertEquals("A", library.getTitleByPosition(0));
        assertEquals("B", library.getTitleByPosition(1));
        assertEquals("C", library.getTitleByPosition(2));
    }
}
