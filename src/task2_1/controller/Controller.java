package task2_1.controller;

import task2_1.data.DataSource;
import task2_1.model.Books;
import task2_1.model.entity.Book;
import task2_1.view.BooksView;

public class Controller {
    private Books model=new Books();
    private BooksView view=new BooksView();
    public void run(){

        //  TODO  while(true)
        model.setBooks(DataSource.getBooks());
//        view.printBooks(BooksView.ALL_BOOKS,model.getBooks());
        searchBookByAuthor("dasd");

    }

    private void searchBookByAuthor(String author ){
        Book [] result=model.getByAuthor(author);
        if(result.length==0){view.printMessage("No books "+author);}else {
            view.printBooks("AUTHOR "+author, result);
        }
    }
}
