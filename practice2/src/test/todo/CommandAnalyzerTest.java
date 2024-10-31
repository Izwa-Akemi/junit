package test.todo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import todo.Command;
import todo.CommandAnalyzer;

class CommandAnalyzerTest {

	 CommandAnalyzer analyzer = new CommandAnalyzer();

  @Test
  void testAnalyzeWithArgument() {
      Command command = analyzer.analyze("add task1");
      assertEquals("add", command.getName());
      assertEquals("task1", command.getArg());
  }

  @Test
  void testAnalyzeWithoutArgument() {
      Command command = analyzer.analyze("show");
      assertEquals("show", command.getName());
      assertEquals("", command.getArg());
  }
}
