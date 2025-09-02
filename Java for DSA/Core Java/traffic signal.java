import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;

public class traffic signal  extends Application {

    @Override
    public void start(Stage primaryStage) {
        Circle light = new Circle(50, Color.GREY);

        Button redButton = new Button("Red");
        Button yellowButton = new Button("Yellow");
        Button greenButton = new Button("Green");

        redButton.setOnAction(e -> light.setFill(Color.RED));
        yellowButton.setOnAction(e -> light.setFill(Color.YELLOW));
        greenButton.setOnAction(e -> light.setFill(Color.GREEN));

        VBox buttons = new VBox(10, redButton, yellowButton, greenButton);
        StackPane root = new StackPane(light, buttons);
        buttons.setTranslateX(100);

        Scene scene = new Scene(root, 200, 200);

        primaryStage.setTitle("Traffic Light Simulator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
