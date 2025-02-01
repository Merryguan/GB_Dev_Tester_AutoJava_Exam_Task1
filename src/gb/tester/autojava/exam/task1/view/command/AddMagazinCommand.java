package gb.tester.autojava.exam.task1.view.command;

import gb.tester.autojava.exam.task1.view.ConsoleUI;

public class AddMagazinCommand extends Command {
    public AddMagazinCommand(ConsoleUI consoleUI) {
        super("Добавить новы журнал.", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().addMagazine();
    }
}
