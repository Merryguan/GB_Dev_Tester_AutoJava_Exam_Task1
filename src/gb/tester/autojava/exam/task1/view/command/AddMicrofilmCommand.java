package gb.tester.autojava.exam.task1.view.command;

import gb.tester.autojava.exam.task1.view.ConsoleUI;

public class AddMicrofilmCommand extends Command {
    public AddMicrofilmCommand(ConsoleUI consoleUI) {
        super("Добавить новый микрофильм.", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().addMicrofilm();
    }
}
