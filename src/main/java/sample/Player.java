package sample;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Player extends Program {

    public Alert alert = new Alert();

    Format formatMkv=Format.MKV;
    Format formatAvi = Format.AVI;
    Format formatCam = Format.CAM;
    Format formatScr = Format.SCR;

    public Player() {
    }

    public void filmShow(Stage player, Button play, ListView<String> listProgram2) {
        play.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                Label secondLabel = new Label();
                secondLabel.setText(listProgram2.getFocusModel().getFocusedItem());
                StackPane secondaryLayout = new StackPane();
                secondaryLayout.getChildren().add(secondLabel);
                Scene secondScene = new Scene(secondaryLayout, 250, 150);

                // New window (Stage)
                Stage newWindow = new Stage();
                newWindow.setTitle("Ваш фильм");
                newWindow.setScene(secondScene);

                // Set position of second window, related to primary window.
                newWindow.setX(player.getX() + 200);
                newWindow.setY(player.getY() + 100);

                newWindow.show();
            }
        });
    }

    public void installFilm(Button installFilm, TextField filmName, ObservableList<String> list3, Computer computer) {
        installFilm.setOnAction(actionEvent -> {
            if (filmName.getText().equals("")) {
                alert.showFilmNoDownloadAlert();
            } else {
                supportedFormat(filmName, list3, computer);
            }
        });
    }

    private void supportedFormat(TextField filmName, ObservableList<String> list3, Computer computer) {
        if (filmName.getText().equals(removeLastChar(filmName.getText()) + formatMkv.toString()) ||
                (filmName.getText().equals(removeLastChar(filmName.getText()) + formatAvi.toString())) ||
                filmName.getText().equals(removeLastChar(filmName.getText()) + formatCam.toString()) ||
                filmName.getText().equals(removeLastChar(filmName.getText()) + formatScr.toString())) {
            computer.input(filmName.getText());
            list3.add(filmName.getText());
            filmName.setText("");
        } else {
            alert.showFilmNoFormat();
        }
    }

    private static String removeLastChar(String str) {
        try {
            String string = str.substring(0, str.length() - 4);
            return string;
        } catch (Exception p) {
        }
        return str;
    }
}
