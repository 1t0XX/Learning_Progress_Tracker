package tracker;

public enum Command {
    EXIT("exit"),
    BACK("back"),
    LIST("list"),
    FIND("find"),
    ADD_STUDENTS("add students"),
    ADD_POINTS("add points"),
    STATISTICS("statistics"),
    NOTIFY("notify"),
    NO_SUCH_COMMAND(null);

    private final String commandName;

    Command(String commandName) {
        this.commandName = commandName;
    }

    public String getCommandName() {
        return commandName;
    }

    public static Command valueFrom(String commandName) {
        for (Command command : values()) {
            if (commandName.equals(command.getCommandName())) {
                return command;
            }
        }
        return NO_SUCH_COMMAND;
    }
}