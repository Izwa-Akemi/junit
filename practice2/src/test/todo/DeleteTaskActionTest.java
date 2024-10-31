package test.todo;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

import todo.Command;
import todo.DeleteTaskAction;
import todo.TaskModel;
import todo.Action;

class DeleteTaskActionTest {

  TaskModel model = new TaskModel();

  @Test
  void testExecuteValidId() {
      model.add("task to delete");
      Command command = new Command("delete", "1");
      Action action = new DeleteTaskAction(model, command);
      action.execute();
      assertEquals(0, model.getAll().size());
  }

  @Test
  void testExecuteInvalidId() {
      Command command = new Command("delete", "invalid_id");
      Action action = new DeleteTaskAction(model, command);
      ByteArrayOutputStream out = new ByteArrayOutputStream();
      System.setOut(new PrintStream(out));
      action.execute();
   // 期待する出力を修正
		    assertEquals("不正な入力です。", out.toString().trim()); // .trim()を使用して末尾の改行を削除
  }

}
