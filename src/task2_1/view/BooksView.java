package task2_1.view;

import task2_1.model.entity.Book;

public class BooksView {
    public static final String ALL_BOOKS="All books :";
    public void printBooks(String message,Book [] books){
        System.out.println(message);
        for (Book book:books){
            System.out.println(book);
        }
    }

    public void printMessage(String s) {
        System.out.println(s);
    }
}
