import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


/**
 * JavaFX 使用GridPane 创建表单
 * Created by q on 17-9-25.
 */
public class Login extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("JavaFX Welcome to form");
        //创建一个GridPane Layout
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(30, 30, 30, 30));

        //Text
        final Text actionTarget = new Text();
        grid.add(actionTarget, 1, 6);

        //增加Text,Label,Text Field
        Text sceneTitle = new Text("Form");
        sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(sceneTitle, 0, 0, 2, 1);

        //创建Label对象,1行0列
        Label userName = new Label("User Name");
        grid.add(userName, 0, 1);
        //创建文本输入框,放在1行1列
        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        Label pw = new Label("Password");
        grid.add(pw, 0, 2);

        PasswordField passwordField = new PasswordField();
        grid.add(passwordField, 1, 2);

        //调试网格线
//        grid.setGridLinesVisible(true);


        //增加Button和Text
        Button button = new Button("Sign in");
        HBox hBox = new HBox(10);
        hBox.setAlignment(Pos.BOTTOM_RIGHT);
        //将按钮控件作为子节点
        hBox.getChildren().add(button);
        //将HBox pane 放在grid 0,4
        grid.add(hBox, 1, 4);

        button.setOnAction(event -> {
            //Color turn to firebrick red
            actionTarget.setFill(Color.FIREBRICK);
            actionTarget.setText("Sign in button pressed!");
        });


        Scene scene = new Scene(grid, 300, 275);
//        Scene scene = new Scene(grid);
        primaryStage.setScene(scene);

        primaryStage.show();

    }
}
