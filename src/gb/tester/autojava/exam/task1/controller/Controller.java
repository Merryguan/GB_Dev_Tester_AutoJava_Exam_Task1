package gb.tester.autojava.exam.task1.controller;

import gb.tester.autojava.exam.task1.model.*;
import gb.tester.autojava.exam.task1.view.View;

public class Controller {

    private View view;
    private final LibraryService service;

    public Controller(LibraryService model) {
        this.service = model;
    }

    public void addBook(String inventarNumber,
                        String title,
                        String authorName,
                        String authorSurname,
                        String publisher) {
        service.addBook(inventarNumber, title, authorName, authorSurname, publisher);
    }

    public void addMagazine(String inventarNumber,
                            String title,
                            String publisher) {
        service.addMagazine(inventarNumber, title, publisher);
    }

    public void addMail(String inventarNumber,
                        String authorName,
                        String authorSurname,
                        String receiverName,
                        String reivererSurname) {
        service.addMail(inventarNumber, authorName, authorSurname, receiverName, reivererSurname);
    }

    public void addMicrofilm(String inventarNumber,
                             String title,
                             String authorName,
                             String authorSurname,
                             int length) {
        service.addMicrofilm(inventarNumber, title, authorName, authorSurname, length);
    }

    public String searchByInventarNumber(String inventarNumber) {
        return service.searchByInventarNumber(inventarNumber);
    }

    public String searchByAuthor(String authorName, String authorSurname) {
        return service.searchByAuthor(authorName, authorSurname);
    }

    public String showAllReestr() {
        return service.showAllReestr();
    }

    public void create() {
        service.addBook("1010101", "Собачье сердце", "Михаил", "Булгаков", "Литрес");
        service.addBook("1010102", "Академия. Начало", "Айзек", "Азимов", "Литрес");
        service.addMagazine("1010103", "Аргументы и Факты", "АиФ");
        service.addMagazine("1010104", "Вечерняя Москва", "Вечерняя Москва");
        service.addMail("10101005", "Иван", "Грозный", "Михаил", "Крупский");
        service.addMail("1010106", "Фридрих", "Энгельс", "Карл", "Каутский");
        service.addMicrofilm("1010107", "Привет", "Михаил", "Дермантов", 10);
        service.addMicrofilm("1010108", "Пока", "Петр", "Сидоров", 40);
    }
}
