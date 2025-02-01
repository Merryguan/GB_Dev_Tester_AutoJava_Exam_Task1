package gb.tester.autojava.exam.task1.view.command;

import gb.tester.autojava.exam.task1.view.ConsoleUI;

public class SearchByAuthorCommand extends Command {
    public SearchByAuthorCommand(ConsoleUI consoleUI) {
        super("Найти по автору", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().searchByAuthor();
    }
}
