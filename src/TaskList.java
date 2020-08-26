import java.util.ArrayList;

public class TaskList {
    private ArrayList<Task> tasks;

    public TaskList() {
        this.tasks = new ArrayList<>();
    }

    protected TaskList(ArrayList<Task> tasks) {
        this.tasks = tasks;
        if (tasks.size() > 0) {
            System.out.println("\nYou have a saved list! Here: \n" + this.toString());
        }
    }

    public void addTask(Task t) {
        tasks.add(t);
    }

    public Task get(int index) {
        return tasks.get(index);
    }

    public Task deleteTask(int index) {
        return tasks.remove(index);
    }

    public int size() {
        return this.tasks.size();
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < tasks.size(); i++) {
            s += (i + 1) + ". " + tasks.get(i) + "\n";
        }
        return s;
    }


}
