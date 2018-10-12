package task2_1.view;

import task2_1.model.entity.Book;

public class BooksView {
    public static final String MAIN_MENU=" 1. Show all books" +
            "\n 2. Find by author" +
            "\n 3. Find by publisher" +
            "\n 4. Find books published after specified year" +
            "\n 5. Sort books by publisher " +
            "\n 6. Exit ";
    public static final String ALL_BOOKS="All books :";
    public static final String INPUT_INT_DATA="Choise operation :";
    public static final String INPUT_STRING_DATA="Enter string :";
    public static final String WRONG_INPUT_INT_DATA ="Incorrect input:";
    public static final String SORRTED_BOOKS ="Sorted books by publisher: ";

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
