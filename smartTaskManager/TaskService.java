package smartTaskManager;

import java.util.ArrayList;
import java.util.List;

public class TaskService {
    private List<Task> tasks;

    public TaskService() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public List<Task> getAllTasks() {
        return tasks;
    }

    public void removeTask(String title) {
        tasks.removeIf(task -> task.getTitle().equals(title));
    }

    public void markTaskCompleted(String title) {
        for (Task task : tasks) {
            if (task.getTitle().equals(title)) {
                task.markCompleted();
                break;
            }
        }
    }
}
