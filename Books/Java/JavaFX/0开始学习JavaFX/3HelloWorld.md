```java
public class HelloWorld extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button button = new Button();
        button.setText("Say 'Hello World'");
        button.setOnAction(new EventHandler<ActionEvent>() {
                               @Override
        public void handle(ActionEvent event) {
              System.out.println("Hello World!");
                               }
                   }
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
```



![HelloWorld](../image/HelloWorld.png)

-JavaFX应用程序的主类需要继承自application.Application类。**start()**方法是所有JavaFX应用程序的入口。

-JavaFX应用程序将UI容器定义为舞台(Stage)与场景(Scene)。Stage类是JavaFX顶级容器。Scene类是所有内容的容器。

-在JavaFX中，Scene中的内容会以由图形节点(Node)构成的分层场景图(Scene Graph)来展现。在本例中，root节点是一个StackPane对象，它是一个可以调整大小的layout节点。这就意味着在用户改变stage大小时，root节点可以随scene的大小变化而变化。

-root节点包含一个带文本的按钮子节点，按钮上添加了一个事件处理器(Event Handler)，它在点击按钮时会向控制台输出信息。

-当JavaFX应用程序是通过JavaFX Packager工具打包时，main()方法就不是必需的的了，因为JavaFX Package工具会将JavaFX Launcher嵌入到JAR文件中。但是保留main()方法还是很有用的，这样你可以运行不带有JavaFX Launcher的JAR文件，例如在使用某些没有将JavaFX工具完全集成进去的IDE时。另外嵌入了JavaFX代码的Swing应用程序仍需要main()方法。