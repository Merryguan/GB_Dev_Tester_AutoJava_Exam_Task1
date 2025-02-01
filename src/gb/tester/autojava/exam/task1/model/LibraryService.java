package gb.tester.autojava.exam.task1.model;

public class LibraryService {

    Library<Item> library;

    public LibraryService() {
        this.library = new Library<>();
    }

    public void addBook(String inventarNumber,
                        String title,
                        String authorName,
                        String authorSurname,
                        String publisher) {
        library.addItem(new Book(inventarNumber, title, authorName, authorSurname, publisher));
    }

    public void addMagazine(String inventarNumber,
                            String title,
                            String publisher) {
        library.addItem(new Magazine(inventarNumber, title, publisher));
    }

    public void addMail(String inventarNumber,
                        String authorName,
                        String authorSurname,
                        String receiverName,
                        String reivererSurname) {
        library.addItem(new Mail(inventarNumber, authorName, authorSurname, receiverName, reivererSurname));
    }

    public void addMicrofilm(String inventarNumber,
                             String title,
                             String authorName,
                             String authorSurname,
                             int length) {
        library.addItem(new Microfilm(inventarNumber, title, authorName, authorSurname, length));
    }

    public String searchByInventarNumber(String inventarNumber) {
        return library.searchByInventarNumber(inventarNumber).toString();
    }

    public String searchByAuthor(String authorName, String authorSurname) {
        return library.searchByAuthor(authorName, authorSurname).toString();
    }

    public String showAllReestr() {
        if (library.toString() != null) {
            return library.toString();
        } else {
            return "Реестр пуста";
        }
    }

}
