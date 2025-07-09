package TascaS1_04.Level_1.Exercici_1;

import java.util.List;

public class Library {
    List<String> booksCollection;

    public Library() {
    }


    public void setBook(String bookName) {
        this.booksCollection.add(bookName);
    }
    public void setBookByPosition(int position, String name){
        this.booksCollection.add(position, name);
    }

    public String getBookByPosition(int position){
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