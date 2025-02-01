package gb.tester.autojava.exam.task1.view.command;

import gb.tester.autojava.exam.task1.view.ConsoleUI;

public class CreateCommand extends Command {
    public CreateCommand(ConsoleUI consoleUI) {
        super("Заполнить библиотечный реестр.", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().create();
    }
}
