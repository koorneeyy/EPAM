package task2_1.model;

import task2_1.model.entity.Book;

import java.util.Arrays;

public class Books {
    private Book [] books;

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public Book [] getByAuthor(String author){
        Book [] temp=new Book[books.length];
        int counter=0;
        for(int i=0;i<books.length;i++){
            if(books[i].getAuthor().equals(author)){
                temp[counter++]=books[i];
            }
        }
        return Arrays.copyOf(temp,counter);
    }

}
