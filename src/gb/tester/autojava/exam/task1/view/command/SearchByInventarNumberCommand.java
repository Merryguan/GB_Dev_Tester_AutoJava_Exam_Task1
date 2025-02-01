package gb.tester.autojava.exam.task1.view.command;

import gb.tester.autojava.exam.task1.view.ConsoleUI;

public class SearchByInventarNumberCommand extends Command {
    public SearchByInventarNumberCommand(ConsoleUI consoleUI) {
        super("Найти по инвентарному номеру.", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().searchByInventarNumber();
    }
}
