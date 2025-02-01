package gb.tester.autojava.exam.task1.view.command;

import gb.tester.autojava.exam.task1.view.ConsoleUI;

public class AddBookCommand extends Command {
    public AddBookCommand(ConsoleUI consoleUI) {
        super("Добавить книгу.", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().addBook();
    }
}
