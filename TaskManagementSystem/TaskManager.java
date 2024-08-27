package TaskManagementSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskManager {
    private List<Task> tasks;
    private Map<String, Employee> employees;
    private Map<String, List<Task>> employeeTasks;
    private List<String> taskHistory;

    public TaskManager() {
        tasks = new ArrayList<>();
        employees = new HashMap<>();
        employeeTasks = new HashMap<>();
        taskHistory = new ArrayList<>();
    }

    public void addTask(String description, String deadline, int priority) {
        Task task = new Task(description, deadline, priority);
        tasks.add(task);
        taskHistory.add("Added task: " + description);
    }

    public void registerEmployee(String name, String id) {
        Employee employee = new Employee(name, id);
        employees.put(id, employee);
        employeeTasks.put(id, new ArrayList<>());
        taskHistory.add("Registered employee: " + name);
    }

    public void assignTask(String employeeId, Task task) {
        if (employees.containsKey(employeeId)) {
            employeeTasks.get(employeeId).add(task);
            taskHistory.add("Assigned task: " + task.getDescription() + " to " + employees.get(employeeId).getName());
        }
    }

    public void markTaskInProgress(Task task) {
        task.setStatus("In Progress");
        taskHistory.add("Marked task as in progress: " + task.getDescription());
    }

    public void markTaskCompleted(Task task) {
        task.setStatus("Completed");
        taskHistory.add("Marked task as completed: " + task.getDescription());
    }

    public List<Task> viewTasksByEmployee(String employeeId) {
        return employeeTasks.getOrDefault(employeeId, new ArrayList<>());
    }

    public List<String> viewTaskHistory() {
        return taskHistory;
    }

    public Task findTaskByDescription(String description) {
        for (Task task : tasks) {
            if (task.getDescription().equalsIgnoreCase(description)) {
                return task;
            }
        }
        return null;
    }
}
