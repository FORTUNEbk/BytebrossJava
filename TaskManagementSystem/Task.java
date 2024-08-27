package TaskManagementSystem;

public class Task {
    private String description;
    private String deadline;
    private int priority;
    private String status;

    public Task(String description, String deadline, int priority) {
        this.description = description;
        this.deadline = deadline;
        this.priority = priority;
        this.status = "Not Started";
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Description: " + description + "\nDeadline: " + deadline + "\nPriority: " + priority + "\nStatus: " + status;
    }
}
