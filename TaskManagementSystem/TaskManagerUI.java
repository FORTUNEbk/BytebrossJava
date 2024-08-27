package TaskManagementSystem;

import java.util.List;
import java.util.Scanner;

public class TaskManagerUI {
    private TaskManager taskManager;
    private Scanner scanner;

    public TaskManagerUI(TaskManager taskManager) {
        this.taskManager = taskManager;
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        while (true) {
            System.out.println("1. Add Task");
            System.out.println("2. Register Employee");
            System.out.println("3. Assign Task");
            System.out.println("4. Mark Task In Progress");
            System.out.println("5. Mark Task Completed");
            System.out.println("6. View Tasks by Employee");
            System.out.println("7. View Task History");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    registerEmployee();
                    break;
                case 3:
                    assignTask();
                    break;
                case 4:
                    markTaskInProgress();
                    break;
                case 5:
                    markTaskCompleted();
                    break;
                case 6:
                    viewTasksByEmployee();
                    break;
                case 7:
                    viewTaskHistory();
                    break;
                case 8:
                    System.out.println("Exiting the system.");
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }

    private void addTask() {
        System.out.print("Description: ");
        String description = scanner.nextLine();
        System.out.print("Deadline: ");
        String deadline = scanner.nextLine();
        System.out.print("Priority: ");
        int priority = scanner.nextInt();
        scanner.nextLine(); // consume newline
        taskManager.addTask(description, deadline, priority);
        System.out.println("Task added successfully.");
    }

    private void registerEmployee() {
        System.out.print("Employee Name: ");
        String name = scanner.nextLine();
        System.out.print("Employee ID: ");
        String id = scanner.nextLine();
        taskManager.registerEmployee(name, id);
        System.out.println("Employee registered successfully.");
    }

    private void assignTask() {
        System.out.print("Employee ID: ");
        String employeeId = scanner.nextLine();
        System.out.print("Task Description: ");
        String description = scanner.nextLine();
        Task task = taskManager.findTaskByDescription(description); // Updated
        if (task != null) {
            taskManager.assignTask(employeeId, task);
            System.out.println("Task assigned successfully.");
        } else {
            System.out.println("Task not found.");
        }
    }

    private void markTaskInProgress() {
        System.out.print("Task Description: ");
        String description = scanner.nextLine();
        Task task = taskManager.findTaskByDescription(description); // Updated
        if (task != null) {
            taskManager.markTaskInProgress(task);
            System.out.println("Task marked as in progress.");
        } else {
            System.out.println("Task not found.");
        }
    }

    private void markTaskCompleted() {
        System.out.print("Task Description: ");
        String description = scanner.nextLine();
        Task task = taskManager.findTaskByDescription(description); // Updated
        if (task != null) {
            taskManager.markTaskCompleted(task);
            System.out.println("Task marked as completed.");
        } else {
            System.out.println("Task not found.");
        }
    }

    private void viewTasksByEmployee() {
        System.out.print("Employee ID: ");
        String employeeId = scanner.nextLine();
        List<Task> tasks = taskManager.viewTasksByEmployee(employeeId);
        if (tasks.isEmpty()) {
            System.out.println("No tasks found for this employee.");
        } else {
            System.out.println("Tasks assigned to " + employeeId + ":");
            for (Task task : tasks) {
                System.out.println(task);
            }
        }
    }

    private void viewTaskHistory() {
        System.out.println("Task History:");
        List<String> history = taskManager.viewTaskHistory();
        for (String record : history) {
            System.out.println(record);
        }
    }
}
