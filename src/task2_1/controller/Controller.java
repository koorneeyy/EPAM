package task2_1.controller;

import task2_1.data.DataSource;
import task2_1.model.Books;
import task2_1.model.entity.Book;
import task2_1.view.BooksView;
import task2_1.view.InputUtility;

import java.util.Arrays;

public class Controller {
    private Books model=new Books();
    private BooksView view=new BooksView();
    public void run(){

        model.setBooks(DataSource.getBooks());
        while (true){
            view.printMessage(BooksView.MAIN_MENU);
            int command =InputUtility.inputInt(view);
            switch (command) {
                case 1:
                    view.printBooks(BooksView.ALL_BOOKS,model.getBooks());
                    break;
                case 2:  searchBookByAuthor(InputUtility.inputString(view));
                    break;
                case 3:  searchBookByPublisher(InputUtility.inputString(view));
                    break;
                case 4: booksAfterYear(InputUtility.inputInt(view));
                    break;
                case 5:
                    Arrays.sort(model.getBooks());
                    view.printBooks(view.SORRTED_BOOKS, model.getBooks());
                    break;
                case 6:  System.exit(0);
                    break;

            }

        }

    }

    private void searchBookByAuthor(String author ){
        Book [] result=model.getByAuthor(author);
        if(result.length==0){view.printMessage("No books for author: "+author);}else {
            view.printBooks("Books with author "+author, result);
        }
    }
    private void searchBookByPublisher(String publisher ){
        Book [] result=model.getByPublisher(publisher);
        if(result.length==0){view.printMessage("No books for publisher: "+publisher);}else {
            view.printBooks("Books with publisher "+publisher, result);
        }
    }
    private void booksAfterYear(int year){
        Book [] result=model.getAfterYear(year);
        if(result.length==0){view.printMessage("No books after "+year+" year");}else {
            view.printBooks("Books after "+year+" year", result);
        }
    }

}
