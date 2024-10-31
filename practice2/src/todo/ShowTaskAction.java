package todo;

import java.util.*;

public class ShowTaskAction implements Action {
    private TaskModel model;
    private Command command;

    public ShowTaskAction(TaskModel model, Command command) {
        this.model = model;
        this.command = command;
    }

    public void execute() {
        List<Task> tasks = model.getAll();

        System.out.println("id          タスク");
        for(Task task : tasks) {
            System.out.println(task.getId() + "          " + task.getText());
        }
    }
}