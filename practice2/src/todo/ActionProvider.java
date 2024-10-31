package todo;


public class ActionProvider {

    public Action createAction(TaskModel model, Command command) {
        if(command.getName().equals("show")) {
            return new ShowTaskAction(model, command);
        } else if (command.getName().equals("add")) {
            return new AddTaskAction(model, command);
        } else if (command.getName().equals("delete")) {
            return new DeleteTaskAction(model, command);
        } else {
            return null;
        }
    }
}
