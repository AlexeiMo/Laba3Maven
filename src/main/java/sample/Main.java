package sample;


import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class Main extends Application{

    @Override
    public void start(Stage primaryStage)
    {
        Browser.Browser(primaryStage);

        HBox root = new HBox();
        VBox setElementLayout = new VBox(15);
        VBox Computer = new VBox(15);

        Button downloadProgram = new Button("Скачать программу");
        Button installProgram = new Button("Установить программу");
        Button deleteProgram = new Button("Удалить программу");
        Button play = new Button ("Воспроизвести фильм");
        Button installFilm = new Button ("Скачать фильм");
        downloadProgram.setMinWidth(150);
        installProgram.setMinWidth(150);
        deleteProgram .setMinWidth(150);
        play.setMinWidth(150);
        installFilm.setMinWidth(150);

        Computer computer=new Computer();
        Player player=new Player();
        User user=new User();
        Alert alert=new Alert();

        TextField programName = new TextField();
        programName.setPromptText("input name program");
        programName.setPrefSize(150, 15);

        TextField filmName = new TextField();
        filmName.setPromptText("input film name");
        filmName.setPrefSize(150, 15);

        ObservableList<String> list = FXCollections.observableArrayList("Acrobat Reader DC","Skype");
        ListView<String> listProgram = new ListView<>();//окошко,в котором будем хранить программки
        listProgram.setMaxSize(150,170);

        ObservableList<String> list2 = FXCollections.observableArrayList();
        ObservableList<String> list3 = FXCollections.observableArrayList("Властелин колец.avi","Звёздные войны.mkv","Впритык.avi","Остров проклятых.mkv");

        ListView<String> listProgram2 = new ListView<>(list3);//окошко,в котором будем хранить фильмы
        listProgram2.setMaxSize(150,170);

        ChoiceBox<String> choiceBox = new ChoiceBox<>(list);//создаём выпадающий список
        choiceBox.setPrefSize(150,20);

        setElementLayout.getChildren().addAll (choiceBox, programName, downloadProgram, installProgram,deleteProgram,listProgram);
        setElementLayout.setPadding(new Insets(0, 25, 25, 25));
        Computer.getChildren().addAll(play,installFilm,filmName,listProgram2);

        root.setPadding(new Insets(15, 15, 15, 15));
        root.getChildren().addAll(setElementLayout,Computer);

        //кнопка скачивания
        user.downloadProgram(downloadProgram,programName,list,choiceBox);

        //кнопка установки
        user.installProgram(installProgram,choiceBox,list2,listProgram);

        //кнопка удаления
        deleteProgram.setOnAction(event -> {
            boolean remove=listProgram.getSelectionModel().isEmpty();
            String noRemove=listProgram.getSelectionModel().getSelectedItem();
            if (!remove) {
                listProgram.getItems().remove(noRemove);
                alert.showProgramWinRemoveAlert();
            }
            else {
                alert.showProgramNoDeleteAlert();
            }
        });

        //кнопка скачать фильм
        player.installFilm(installFilm,filmName,list3,computer);

        player.filmShow(primaryStage,play,listProgram2);

        root.setStyle("-fx-background-color: #9198e5;");
        Scene scene = new Scene (root, 400, 450);
        primaryStage.setTitle("Google Chrome 2.0");
        primaryStage.setScene(scene);
        primaryStage.centerOnScreen();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}