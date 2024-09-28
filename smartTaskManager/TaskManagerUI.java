package smartTaskManager;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TaskManagerUI extends Application {
    private TaskService taskService;

    public TaskManagerUI(TaskService taskService) {
        this.taskService = taskService;
    }

    @Override
    public void start(Stage primaryStage) {
        VBox layout = new VBox();

        Button addButton = new Button("Add Task");
        layout.getChildren().addAll(addButton);

        Scene scene = new Scene(layout, 400, 300);
        primaryStage.setTitle("Smart Task Manager");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
