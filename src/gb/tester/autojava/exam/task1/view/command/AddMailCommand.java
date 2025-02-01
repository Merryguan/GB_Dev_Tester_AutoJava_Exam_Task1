package gb.tester.autojava.exam.task1.view.command;

import gb.tester.autojava.exam.task1.view.ConsoleUI;

public class AddMailCommand extends Command {
    public AddMailCommand(ConsoleUI consoleUI) {
        super("Добавить новое письмо.", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().addMail();
    }
}
