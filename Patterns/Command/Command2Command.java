package Patterns.Command;

public class Command2Command extends Command{
    @Override
    boolean execute() {
        // реализация выполнения конкретной команды
        System.out.println("Command 2");
        return true;
    }
}
