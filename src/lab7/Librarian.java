package lab7;

public class Librarian implements iLibrarian{
   private String book;
    public Librarian(String book) {
        this.book = book;

    }
    @Override
    public void orderBook(){
        System.out.println(book + " Заказывает книгу");
    };
    }
