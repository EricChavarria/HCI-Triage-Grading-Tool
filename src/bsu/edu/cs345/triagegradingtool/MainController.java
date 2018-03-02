package bsu.edu.cs345.triagegradingtool;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class MainController {

    @FXML
    public AnchorPane informationPane;

    @SuppressWarnings("unused")
    @FXML
    public void showRubric(ActionEvent actionEvent) {
        try {
            informationPane.getChildren().clear();
            informationPane.getChildren().add(FXMLLoader.load(getClass().getResource("rubricPage.fxml")));
        } catch (IOException e){
            System.out.println("There was an error! Please restart and try again!");
        }
    }

    @SuppressWarnings("unused")
    @FXML
    public void showGradingScale(ActionEvent actionEvent){
        try {
            informationPane.getChildren().clear();
            informationPane.getChildren().add(FXMLLoader.load(getClass().getResource("gradingScalePage.fxml")));
        } catch (IOException e){
            System.out.println("There was an error! Please restart and try again!");
        }
    }
}
