package duke.logic;

import java.util.ArrayList;

import duke.task.Task;

public class TaskList {
    private ArrayList<Task> tasks;

    /**
     * Constructor for Tasklist for those without a saved tasklist.
     */
    public TaskList() {
        this.tasks = new ArrayList<>();
    }

    /**
     * Constructor for Tasklist for those with saved tasklist.
     *
     * @param tasks tasks in the saved task list.
     */
    public TaskList(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    /**
     * Add specified task to tasklist.
     *
     * @param t task to be added to task list.
     */
    public void addTask(Task t) {
        tasks.add(t);
    }

    /**
     * Retrieved task with specified index.
     *
     * @param index index of task to be retrieved.
     * @return Task of specified index.
     */
    public Task get(int index) {
        return tasks.get(index);
    }

    /**
     * Delete specified task from tasklist.
     *
     * @param index index of task to be deleted.
     * @return Task of specified index.
     */
    public Task deleteTask(int index) {
        return tasks.remove(index);
    }

    /**
     * Returns current size of task list.
     *
     * @return Task list size.
     */
    public int size() {
        return this.tasks.size();
    }

    /**
     * Find tasks with specified keyword from tasklist.
     *
     * @param keyword keyword of tasks to search for.
     * @return TaskList of tasks with specified keyword.
     */
    public TaskList findTasks(String keyword) {
        TaskList tl = new TaskList();
        for (Task t : tasks) {
            if (t.toString().contains(keyword)) {
                tl.addTask(t);
            }
        }
        return tl;
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
