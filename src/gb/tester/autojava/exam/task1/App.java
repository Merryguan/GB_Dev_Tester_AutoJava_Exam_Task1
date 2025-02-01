package gb.tester.autojava.exam.task1;

import gb.tester.autojava.exam.task1.controller.Controller;
import gb.tester.autojava.exam.task1.model.Item;
import gb.tester.autojava.exam.task1.model.LibraryService;
import gb.tester.autojava.exam.task1.view.ConsoleUI;
import gb.tester.autojava.exam.task1.view.View;

public class App {

    private final View view;
    private final Controller controller;
    private final LibraryService model;

    public App () {
        model = new LibraryService();
        controller = new Controller(model);
        view = new ConsoleUI(controller);
    }

    public View getView() {
        return view;
    }
}
