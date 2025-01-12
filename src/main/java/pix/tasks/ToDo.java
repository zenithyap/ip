package pix.tasks;

/**
 * To Do class which contains the description of the task.
 */
public class ToDo extends Task {
    /** Constructs a new To Do object.*/
    public ToDo(String description) {
        super(description);
    }

    @Override
    public String toString() {
        return "[T]" + super.toString();
    }

    @Override
    public String toSave() {
        return "T /" + super.toSave();
    }
}
