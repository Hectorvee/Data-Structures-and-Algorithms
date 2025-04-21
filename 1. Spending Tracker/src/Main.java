import gui.MainUI;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        MainUI mainUI = new MainUI();

        Scene scene = new Scene(mainUI, 1200, 800);
        primaryStage.setTitle("Spending Tracker");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}