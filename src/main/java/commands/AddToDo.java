package commands;

import data.MyData;
import tasks.ToDo;

public class AddToDo extends Commands {
    protected ToDo todo;

    public AddToDo(String description) {
        this.todo = new ToDo(description);
    }

    public void execute(MyData data) {
        data.setData(todo);
        System.out.print(getLine() +
                "     Got it. I've added this task:\n" +
                "       " + todo + "\n" +
                "     Now you have " + data.len() + " tasks in the list.\n" +
                getLine());
    }
}