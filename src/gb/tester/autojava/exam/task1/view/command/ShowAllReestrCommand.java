package gb.tester.autojava.exam.task1.view.command;

import gb.tester.autojava.exam.task1.view.ConsoleUI;

public class ShowAllReestrCommand extends Command {
    public ShowAllReestrCommand(ConsoleUI consoleUI) {
        super("Вывести весь реестр.", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().showAllReestr();
    }
}
