package todo;
import java.io.*;
public class Main {

	  public static void main(String[] args) {
	    CommandAnalyzer ca = new CommandAnalyzer();
	    ActionProvider ap = new ActionProvider();
	    TaskModel model = new TaskModel();

	    while (true) {
	      System.out.print(">");
	      String input = null;
	      try {
	        BufferedReader inputuser = new BufferedReader(
	          new InputStreamReader(System.in)
	        );
	        input = inputuser.readLine();
	      } catch (IOException e) {
	        System.out.println("不正な入力です。");
	        continue;
	      }

	      Command command = ca.analyze(input);
	      Action action = ap.createAction(model, command);
	      if (action == null) {
	        System.out.println("不正な入力です。");
	        continue;
	      }
	      action.execute();
	    }
	  }
	}
