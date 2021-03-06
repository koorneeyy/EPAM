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

    public Book [] getByPublisher(String publisher){
        Book [] temp=new Book[books.length];
        int counter=0;
        for(int i=0;i<books.length;i++){
            if(books[i].getPublisher().equals(publisher)){
                temp[counter++]=books[i];
            }
        }
        return Arrays.copyOf(temp,counter);
    }
    public Book [] getAfterYear(int year){
        Book [] temp=new Book[books.length];
        int counter=0;
        for(int i=0;i<books.length;i++){
            if(books[i].getYear()>=year){
                temp[counter++]=books[i];
            }
        }
        return Arrays.copyOf(temp,counter);
    }


}
