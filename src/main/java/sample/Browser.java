package sample;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Browser extends Program {
    public static void Browser(Stage browser) {
        Stage stage=new Stage();
        VBox root = new VBox(10);
        root.setAlignment(Pos.CENTER);
        root.setStyle("-fx-background-color:#9198e5;");
        Scene scene = new Scene(root,300,300);
        stage.close();
        Button yes=new Button("Yes");
        yes.setFont(Font.font("Georgia",FontWeight.BOLD,15));
        style(yes);
        yes.setMinWidth(100);
        Button no=new Button("No");
        no.setFont(Font.font("Georgia",FontWeight.BOLD,15));
        style(no);
        no.setMinWidth(100);

        Label question=new Label("Желаете установить браузер?");
        question.setFont(Font.font("Tahoma",FontWeight.BOLD,15));
        root.getChildren().addAll(question,yes,no);
        stage.setTitle(browser.getTitle());

        no.setOnAction(event -> {
            stage.close();
        });

        yes.setOnAction(event-> {
            browser.show();
            stage.close();
        });

        stage.setTitle("Hello");
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }

    public static void style(Button button)
    {
        button.setStyle("-fx-background-color: #aafffc;");
    }
}
