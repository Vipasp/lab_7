package lab7;

public class Supplier implements iLibrarian{
    private String book;
    public Supplier(String book) {
        this.book = book;

    }
    @Override
    public void orderBook(){
        System.out.println(book + " Поставляет книгу");
    };
}


