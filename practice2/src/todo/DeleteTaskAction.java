package todo;

public class DeleteTaskAction implements Action {
    private TaskModel model;
    private Command command;

    public DeleteTaskAction(TaskModel model, Command command) {
        this.model = model;
        this.command = command;
    }

    public void execute() {
        try {
            int argId = Integer.parseInt(this.command.getArg());
            model.delete(argId);
        } catch(NumberFormatException e) {
            System.out.println("不正な入力です。");
        }
    }
}

