package sample;

import javafx.collections.ObservableList;
import javafx.scene.control.*;

public class User {
    private String name;

    Computer computer=new Computer();

    public Alert alert=new Alert();

    public User(){}

    public void setName(String name)
    {
        this.name=name;
    }

    public String getName()
    {
        return name;
    }

    public void downloadProgram(Button downloadProgram, TextField programName, ObservableList<String> list, ChoiceBox<String> choiceBox) {
        downloadProgram.setOnAction(event  -> {
            if (programName.getText().equals("")) {
                alert.showProgramNoDownloadAlert();
            }
            else {
                computer.input(programName.getText());
                list.add (programName.getText());
                choiceBox.setItems(list);
                programName.setText("");
            }
        });
    }

    public void installProgram(Button installProgram, ChoiceBox<String> choiceBox, ObservableList<String> list2, ListView<String> listProgram) {
        installProgram.setOnAction(event  -> {
            boolean NoInstall=choiceBox.getSelectionModel().isEmpty();
            String Inst=choiceBox.getValue();
            if (!NoInstall) {
                alert.showProgramWinInstallAlert();
                list2.add(Inst);
                choiceBox.getItems().remove(Inst);
                listProgram.setItems(list2);
            }
            else {
                alert.showProgramNoInstallAlert();
            }
        });
    }
}
