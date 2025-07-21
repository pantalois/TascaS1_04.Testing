package Level_1.Exercici_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        for (Book b : books) {
            if (b.getTitle().equals(book.getTitle())) {
                throw new IllegalArgumentException("A book with this title already exists");
            }
        }
        books.add(book);
        sortBooks();
    }

    public List<Book> getBooks() {
        return new ArrayList<>(books);
    }

    public String getTitleByPosition(int position) {
        if (position < 0 || position >= books.size()) {
            throw new IndexOutOfBoundsException("Invalid position");
        }
        return books.get(position).getTitle();
    }

    public void addBookAtPosition(Book book, int position) {
        if (position < 0 || position > books.size()) {
            throw new IndexOutOfBoundsException("Invalid position");
        }
        for (Book b : books) {
            if (b.getTitle().equals(book.getTitle())) {
                throw new IllegalArgumentException("A book with this title already exists");
            }
        }

        books.add(position, book);
        sortBooks();
    }

    public boolean removeBookByTitle(String title) {
        return books.removeIf(book -> book.getTitle().equals(title));
    }

    private void sortBooks() {
        Collections.sort(books, Comparator.comparing(Book::getTitle));
    }

    public int getSize() {
        return books.size();
    }

     public void displayAllBooks() {
        int position = 0;
        for (Book book : this.books) {
            System.out.println("   [" + position + "] " + book.getTitle());
            position++;
        }
    }
}