package sample;

public class Alert {
    public Alert(){}

    public void showProgramNoDownloadAlert() {
        javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.INFORMATION);
        alert.setTitle ("Error");
        alert.setHeaderText(null);
        alert.setContentText("Не удалось скачать программу!");
        alert.showAndWait();
    }

    public void showProgramWinInstallAlert() {
        javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.INFORMATION);
        alert.setTitle ("Happy:)");
        alert.setHeaderText(null);
        alert.setContentText("Успешно установлено");
        alert.showAndWait();
    }

    public void showProgramNoInstallAlert() {
        javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.INFORMATION);
        alert.setTitle ("Error");
        alert.setHeaderText(null);
        alert.setContentText("Error!! Выберете программу для установки");
        alert.showAndWait();
    }

    public void showFilmNoDownloadAlert() {
        javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.INFORMATION);
        alert.setTitle ("Error");
        alert.setHeaderText(null);
        alert.setContentText("Не удалось скачать фильм!");
        alert.showAndWait();
    }

    public void showFilmNoFormat() {
        javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.INFORMATION);
        alert.setTitle ("Error");
        alert.setHeaderText(null);
        alert.setContentText("Данный формат не поддерживается");
        alert.showAndWait();
    }

    public void showProgramNoDeleteAlert() {
        javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.INFORMATION);
        alert.setTitle ("Error");
        alert.setHeaderText(null);
        alert.setContentText("Нечего удалять!");
        alert.showAndWait();
    }

    public void showProgramWinRemoveAlert() {
        javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.INFORMATION);
        alert.setTitle ("Happy:)");
        alert.setHeaderText(null);
        alert.setContentText("Удаление завершено");
        alert.showAndWait();
    }
}