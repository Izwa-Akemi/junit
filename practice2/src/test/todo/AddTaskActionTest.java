package test.todo;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

import todo.Command;
import todo.TaskModel;
import todo.Action;
import todo.AddTaskAction;
class AddTaskActionTest {

		TaskModel model = new TaskModel();

		@Test
		void testExecuteValidInput() {
				Command command = new Command("add", "short task");
				Action action = new AddTaskAction(model, command);
				action.execute();
				assertEquals(1, model.getAll().size());
				assertEquals("short task", model.getAll().get(0).getText());
		}

		@Test
		void testExecuteInvalidInput() {
		    Command command = new Command("add", "123456789012345678901");
		    Action action = new AddTaskAction(model, command);
		    
		    ByteArrayOutputStream out = new ByteArrayOutputStream();
		    System.setOut(new PrintStream(out));
		    
		    action.execute();
		    
		    // 期待する出力を修正
		    assertEquals("不正な入力です。", out.toString().trim()); // .trim()を使用して末尾の改行を削除
		}

}


