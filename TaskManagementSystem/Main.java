package TaskManagementSystem;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        TaskManagerUI ui = new TaskManagerUI(taskManager);
        ui.displayMenu();
    }
}
