package gb.tester.autojava.exam.task1.view;

import gb.tester.autojava.exam.task1.controller.Controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;

public class ConsoleUI implements View {

    private final Controller controller;
    private final Scanner scanner;
    private final MainMenu mainMenu;
    private boolean work;

    public ConsoleUI(Controller controller) {
        this.controller = controller;
        scanner = new Scanner(System.in);
        mainMenu = new MainMenu(this);
        work = true;
    }

    @Override
    public void start() {
        int menuPoint;
        while (work) {
            System.out.println(mainMenu.menu());
            menuPoint = scanner.nextInt();
            scanner.nextLine();
            mainMenu.execute(menuPoint);
        }
    }

    @Override
    public void printResult(String result) {
        System.out.println(result);
    }

    public void addBook() {
        System.out.println("Введите серийный номер: ");
        String inventarNumber = scanner.nextLine();
        System.out.println("Введите название книги: ");
        String title = scanner.nextLine();
        System.out.println("Введите имя автора: ");
        String authorName = scanner.nextLine();
        System.out.println("Введите фамилию автора: ");
        String authorSurname = scanner.nextLine();
        System.out.println("Введите название издательства: ");
        String publisher = scanner.nextLine();
        controller.addBook(inventarNumber, title, authorName, authorSurname, publisher);
    }

    public void addMagazine() {
        System.out.println("Введите серийный номер: ");
        String inventarNumber = scanner.nextLine();
        System.out.println("Введите название журнала: ");
        String title = scanner.nextLine();
        System.out.println("Введите название издательства: ");
        String publisher = scanner.nextLine();
        controller.addMagazine(inventarNumber, title, publisher);
    }

    public void addMail() {
        System.out.println("Введите серийный номер: ");
        String inventarNumber = scanner.nextLine();
        System.out.println("Введите имя автора: ");
        String authorName = scanner.nextLine();
        System.out.println("Введите фамилию автора: ");
        String authorSurname = scanner.nextLine();
        System.out.println("Введите имя получателя: ");
        String receiverName = scanner.nextLine();
        System.out.println("Введите фамилию получателя: ");
        String reivererSurname = scanner.nextLine();
        controller.addMail(inventarNumber, authorName, authorSurname, receiverName, reivererSurname);
    }

    public void addMicrofilm() {
        System.out.println("Введите серийный номер: ");
        String inventarNumber = scanner.nextLine();
        System.out.println("Введите название микрофильма: ");
        String title = scanner.nextLine();
        System.out.println("Введите имя автора: ");
        String authorName = scanner.nextLine();
        System.out.println("Введите фамилию автора: ");
        String authorSurname = scanner.nextLine();
        System.out.println("Введите продолжительность микрофильма: ");
        int length = scanner.nextInt();
        controller.addMicrofilm(inventarNumber, title, authorName, authorSurname, length);
    }

    public void searchByInventarNumber() {
        System.out.println("Введите серийный номер: ");
        String inventarNumber = scanner.nextLine();
        printResult(controller.searchByInventarNumber(inventarNumber));
    }

    public void searchByAuthor() {
        System.out.println("Введите имя автора: ");
        String authorName = scanner.nextLine();
        System.out.println("Введите фамилию автора: ");
        String authorSurname = scanner.nextLine();
        printResult(controller.searchByAuthor(authorName, authorSurname));
    }

    public void showAllReestr() {
       printResult(controller.showAllReestr());
    }

    public void create() {
        controller.create();
    }

    public void stop() {
        work = false;
    }
}
