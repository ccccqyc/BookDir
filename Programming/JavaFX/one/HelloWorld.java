import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * the first JavaFX class.
 * Created by q on 17-9-25.
 */
public class HelloWorld extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button button = new Button();
        button.setText("Say 'Hello World'");
        button.setOnAction(event -> System.out.println("Hello World!")
        );

        StackPane root = new StackPane();
        root.getChildren().addAll(button);
        Scene scene = new Scene(root,300,250);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
