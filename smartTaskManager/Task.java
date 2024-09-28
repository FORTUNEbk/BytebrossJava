package smartTaskManager;

import java.time.LocalDate;

public class Task {
    private String title;
    private String description;
    private LocalDate deadline;
    private Priority priority;
    private Category category;
    private boolean isCompleted;
    private LocalDate createdDate;
    private LocalDate completedDate;

    public Task(String title, String description, LocalDate deadline, Priority priority, Category category) {
        this.title = title;
        this.description = description;
        this.deadline = deadline;
        this.priority = priority;
        this.category = category;
        this.isCompleted = false;
        this.createdDate = LocalDate.now();
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public LocalDate getDeadline() { return deadline; }
    public void setDeadline(LocalDate deadline) { this.deadline = deadline; }
    public Priority getPriority() { return priority; }
    public void setPriority(Priority priority) { this.priority = priority; }
    public Category getCategory() { return category; }
    public void setCategory(Category category) { this.category = category; }
    public boolean isCompleted() { return isCompleted; }
    public void markCompleted() {
        this.isCompleted = true;
        this.completedDate = LocalDate.now();
    }
}
