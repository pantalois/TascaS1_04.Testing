package Level_1.Exercici_1;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== LIBRARY MANAGEMENT SYSTEM ===\n");

        Library library = new Library();

        System.out.println("1. Adding books to the library:");
        try {
            library.addBook(new Book("The Great Gatsby"));
            System.out.println("   Added: The Great Gatsby");

            library.addBook(new Book("To Kill a Mockingbird"));
            System.out.println("   Added: To Kill a Mockingbird");

            library.addBook(new Book("1984"));
            System.out.println("   Added: 1984");

            library.addBook(new Book("Pride and Prejudice"));
            System.out.println("   Added: Pride and Prejudice");

        } catch (IllegalArgumentException e) {
            System.out.println("   Error: " + e.getMessage());
        }

        System.out.println("\n2. Current books in the library (sorted alphabetically):");
        displayAllBooks(library);

        System.out.println("\n3. Getting book titles by position:");
        try {
            System.out.println("   Position 0: " + library.getTitleByPosition(0));
            System.out.println("   Position 1: " + library.getTitleByPosition(1));
            System.out.println("   Position 2: " + library.getTitleByPosition(2));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("   Error: " + e.getMessage());
        }

        System.out.println("\n4. Trying to add a duplicate book:");
        try {
            library.addBook(new Book("1984"));
            System.out.println("   Added duplicate");
        } catch (IllegalArgumentException e) {
            System.out.println("   Error: " + e.getMessage());
        }

        System.out.println("\n5. Adding a book at specific position:");
        try {
            library.addBookAtPosition(new Book("Brave New World"), 2);
            System.out.println("   Added 'Brave New World' at position 2");
            System.out.println("   Note: The list will be re-sorted automatically");
        } catch (Exception e) {
            System.out.println("   Error: " + e.getMessage());
        }

        System.out.println("\n   Books after adding:");
        displayAllBooks(library);

        System.out.println("\n6. Removing a book by title:");
        boolean removed = library.removeBookByTitle("1984");
        if (removed) {
            System.out.println("   Successfully removed '1984'");
        } else {
            System.out.println("   Book not found");
        }

        System.out.println("\n   Books after removal:");
        displayAllBooks(library);

        System.out.println("\n7. Library Statistics:");
        System.out.println("   Total number of books: " + library.getSize());

        System.out.println("\n8. Search example - Finding books by partial title:");
        String searchTerm = "Pride";
        library.getBooks().stream()
                .filter(book -> book.getTitle().contains(searchTerm))
                .forEach(book -> System.out.println("   Found: " + book));

        System.out.println("\n9. Error handling examples:");

        System.out.println("   Trying to get book at position 100:");
        try {
            library.getTitleByPosition(100);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("   Caught exception: " + e.getMessage());
        }

        System.out.println("\n   Trying to add book at negative position:");
        try {
            library.addBookAtPosition(new Book("Invalid"), -1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("   Caught exception: " + e.getMessage());
        }

        System.out.println("\n10. Final library state:");
        System.out.println("    Total books: " + library.getSize());
        displayAllBooks(library);

        System.out.println("\n11. Demonstrating safe list retrieval:");
        var booksCopy = library.getBooks();
        System.out.println("    Retrieved " + booksCopy.size() + " books (safe copy)");
    }

    private static void displayAllBooks(Library library) {
        int position = 0;
        for (Book book : library.getBooks()) {
            System.out.println("   [" + position + "] " + book.getTitle());
            position++;
        }
    }
}