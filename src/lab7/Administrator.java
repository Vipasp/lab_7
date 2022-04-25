package lab7;

public class Administrator implements iAdministrator {
       private String fio;
    public Administrator(String fio, Book book) {
        this.fio = fio;
    }
    @Override
    public void findBook(Book book){
        System.out.println(fio + " ищет книгу " + book.getInfo());
    };
    @Override
    public void overdueNotification(Reader reader, Book book){
        System.out.println(reader.getFio() + " необходимо вернуть книгу " + book.getInfo());
    };

}
