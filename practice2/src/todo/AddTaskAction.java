package todo;

public class AddTaskAction implements Action {
    private TaskModel model;
    private Command command;

    public AddTaskAction(TaskModel model, Command command) {
        this.model = model;
        this.command = command;
    }

    public void execute() {
        String argText = this.command.getArg();
        if(argText.length() > 20) {
            System.out.println("不正な入力です。");
            return;
        }

        model.add(argText);
    }
}
