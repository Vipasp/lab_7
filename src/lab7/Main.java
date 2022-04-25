//Пользователи библиотеки
package lab7;
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Капитал", "Карл Маркс");
        Book book2 = new Book("Java", "Герберт Шилдт");
        Book book3 = new Book("Пикник на обочине", "Стругацкие");
        Book[] books = {book1, book2, book3};
        Reader reader1 = new Reader("Иванов И.И.", 1 );
        Reader reader2 = new Reader("Петров П.П.", 2 );
        Reader reader3 = new Reader("Сидоров С.С.", 3);
        Reader[] readers = {reader1, reader2, reader3};
        Administrator admin =new Administrator("Администратор", book1);
        admin.findBook(book1);
        admin.overdueNotification(reader1, book2);
        printReaders(readers);
        printBooks(books);

    }
    private static void printBooks(Book[] books) {
        System.out.println("Список книг:");
        for (Book book : books) {
            System.out.println(book.getInfo());
        }
        System.out.println();
    }

    private static void printReaders(Reader[] readers) {
        System.out.println("Список читателей:");
        for (Reader reader : readers) {
            System.out.println( reader.getInfo());
        }
        System.out.println();
    }
}
