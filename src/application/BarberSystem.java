package application;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class BarberSystem extends Application {

    private static Scene baseScene;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Home.fxml"));
            AnchorPane anchorPane = loader.load();

            baseScene = new Scene(anchorPane);
            primaryStage.setScene(baseScene);
            //primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("/imgs/icons/invoice.png")));
            primaryStage.setResizable(false);
            primaryStage.setTitle("Barber System");
            primaryStage.show();
        } catch (IOException e) {
            System.out.println("start: " + e.getMessage());
        }

    }

    public static Scene getBaseScene() {
        return baseScene;
    }

}
