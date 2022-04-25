package lab7;

public class Reader implements iReader {
    private String fio;
    private int number;

    public Reader(String fio, int number) {
        this.fio = fio;
        this.number = number;

    }

    public Reader() {
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }






    public String getInfo() {
        return "{" +
                "fio='" + fio + '\'' +
                ", number=" + number +
                '}';
    }


    @Override
    public void takeBook(Book... books) {
        System.out.println(this.fio + " взял следующие книги:");
        for (Book book : books) {
            System.out.println(book.getName() + ", автор - " + book.getAuthor());
        }
        System.out.println();
    }

    @Override
    public void returnBook(String... books) {
        System.out.println(this.fio + " вернул следующие книги:");
        for (String book : books) {
            System.out.println(book);
        }
        System.out.println();
    }
}

