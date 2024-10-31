package test.todo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import todo.Action;
import todo.ActionProvider;
import todo.AddTaskAction;
import todo.Command;
import todo.DeleteTaskAction;
import todo.ShowTaskAction;
import todo.TaskModel;

class ActionProviderTest {

		TaskModel model = new TaskModel();
  ActionProvider provider = new ActionProvider();

  @Test
  void testCreateShowTaskAction() {
      Command command = new Command("show", "");
      Action action = provider.createAction(model, command);
      assertTrue(action instanceof ShowTaskAction);
  }

  @Test
  void testCreateAddTaskAction() {
      Command command = new Command("add", "task");
      Action action = provider.createAction(model, command);
      assertTrue(action instanceof AddTaskAction);
  }

  @Test
  void testCreateDeleteTaskAction() {
      Command command = new Command("delete", "1");
      Action action = provider.createAction(model, command);
      assertTrue(action instanceof DeleteTaskAction);
  }

  @Test
  void testCreateInvalidAction() {
      Command command = new Command("invalid", "");
      Action action = provider.createAction(model, command);
      assertNull(action);
  }
}


