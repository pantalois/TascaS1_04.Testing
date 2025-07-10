package TascaS1_04.Level_1.Exercici_1;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<String> booksCollection;

    public Library() {
        this.booksCollection = new ArrayList<>();
    }


    public void setBook(String bookName) {
        if (!this.booksCollection.contains(bookName)){
            this.booksCollection.add(bookName);
        }
        else{
            System.out.println("Book '" + bookName + "' not added, you already have it in your collection.");
        }

    }
    public void setBookByPosition(int position, String bookName) {
        if (!this.booksCollection.contains(bookName)){
            while (this.booksCollection.size() <= position) {
                this.booksCollection.add(null); // Añade null al final para expandir la lista
                System.out.println("Rellenando con null en el índice: " + (this.booksCollection.size() - 1));
            }
            this.booksCollection.set(position, bookName);
        }
        else{
            System.out.println("Book '" + bookName + "' not added, you already have it in your collection.");
        }
    }


    public String getBookByPosition(int position){
       // System.out.println(this.booksCollection.get(position));
        return this.booksCollection.get(position);
    }

    public List<String> getBookCollection(){
        return this.booksCollection;
    }

    public void removeBookByName(String name){
        for (int i = 0; i < this.booksCollection.size(); i++){
            if (name.equalsIgnoreCase(this.booksCollection.get(i))){
                this.booksCollection.remove(i);
            }
        }
    }



}