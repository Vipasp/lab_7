package lab7;

public interface iAdministrator {
    void findBook(Book book); // найти книгу
    void overdueNotification(Reader reader, Book book); // уведомить о времени возврата
}
