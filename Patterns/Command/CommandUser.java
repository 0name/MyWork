package Patterns.Command;

public class CommandUser {
    void commandExecute(Command command){
        command.execute();
    }

    public static void main(String[] args) {
        CommandUser commandUser = new CommandUser();
        commandUser.commandExecute(new Command1Command());
        commandUser.commandExecute(new Command2Command());
    }
}
