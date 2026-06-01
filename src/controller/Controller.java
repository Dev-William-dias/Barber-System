package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Pane;

public class Controller implements Initializable {

    private final Image image = new Image(getClass().getResource("/view/img/backgroundImagebarber.png").toExternalForm());

    @FXML
    private Pane anchorPane;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        loadPanel("/view/Operation.fxml");
    }

    private synchronized void loadPanel(String path) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(path));
            Pane newPanel = loader.load();

            BackgroundImage backgroundImage = new BackgroundImage(
                image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER, new BackgroundSize(100, 100, true, true, true, true)
            );
            
            anchorPane.getChildren().clear();
            anchorPane.setBackground(new Background(backgroundImage));
            anchorPane.getChildren().add(newPanel);
        } catch (IOException e) {
            System.out.println("loadPanel " + e.getMessage());
        }
    }

}
