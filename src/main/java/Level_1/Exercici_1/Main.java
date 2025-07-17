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
        library.displayAllBooks();

        System.out.println("\n3. Getting book titles by position:");
        try {
            System.out.println("   Position 0: " + library.getTitleByPosition(0));
            System.out.println("   Position 1: " + library.getTitleByPosition(1));
            System.out.println("   Position 2: " + library.getTitleByPosition(2));
        } catch (IndexOutOfBoundsException e) {
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
        library.displayAllBooks();

        System.out.println("\n6. Removing a book by title:");
        boolean removed = library.removeBookByTitle("1984");
        if (removed) {
            System.out.println("   Successfully removed '1984'");
        } else {
            System.out.println("   Book not found");
        }

        System.out.println("\n   Books after removal:");
        library.displayAllBooks();

    }
}