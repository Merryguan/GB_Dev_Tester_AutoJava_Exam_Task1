package gb.tester.autojava.exam.task1.view;

import gb.tester.autojava.exam.task1.view.command.*;

import java.util.ArrayList;
import java.util.List;

public class MainMenu {
    private final List<Command> commands;

    public MainMenu(ConsoleUI consoleUI) {
        commands = new ArrayList<>();
        commands.add(new AddBookCommand(consoleUI));
        commands.add(new AddMagazinCommand(consoleUI));
        commands.add(new AddMailCommand(consoleUI));
        commands.add(new AddMicrofilmCommand(consoleUI));
        commands.add(new SearchByInventarNumberCommand(consoleUI));
        commands.add(new SearchByAuthorCommand(consoleUI));
        commands.add(new ShowAllReestrCommand(consoleUI));
        commands.add(new CreateCommand(consoleUI));
        commands.add(new StopCommand(consoleUI));
    }

    public String menu() {
        StringBuilder result = new StringBuilder();
        result.append("Меню:\n");
        for (int i = 0; i < commands.size(); i++) {
                result.append(i + 1)
                        .append(". ");
            result.append(commands.get(i).getDescription())
                    .append("\n");
        }
        result.append("\n").append("Выберите пункт меню: ");
        return result.toString();
    }

    public void execute(int choice) {
        Command command = commands.get(choice - 1);
        command.execute();
    }

    public int size() {
        return commands.size();
    }

}
