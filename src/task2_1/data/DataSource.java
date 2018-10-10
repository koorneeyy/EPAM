package task2_1.data;

import task2_1.model.entity.Book;

public class DataSource {
    public static Book [] getBooks(){
        return new Book[]{
                new Book("Book 1","Shevchenko","ABABAGALAMAGA",2010,100,150.0),
                new Book("Java","Lenin","Kharkiv",2008,150,40.0),
                new Book("HTML","WWW consortium","Kyiv",2001,130,225.0),
                new Book("CSS","WWW consortium","Odessa",2018,333,26.0),
                new Book("JavaScript","WWW consortium","Lviv",2011,726,86.0),
                new Book("Python","Herbert Shild","Lviv",2011,376,86.0),
        };
    };
}
