package sample;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import model.Garage;
import model.builder.*;

import java.io.IOException;
import java.util.ArrayList;

public class Controller {
    private Garage garage;
    private ArrayList<Pane> paneBank;

    @FXML
    private GridPane garageGridPane;

    @FXML
    private Button addCarButton;

    @FXML
    private Button offRoadButton, raceButton, regularCarButton;

    @FXML
    private Stage lastStage;

    @FXML
    //определение дефолтных значений элементов(если потребуется)
    public void initialize() {

    }

    public Controller() {
        garage = Garage.getInstance();
        paneBank = new ArrayList<>();
    }

    @FXML
    private void addSUV() {
        System.out.println("Был выбран джип");
        this.garage.cars.add(new SUVBuilder().getResult());
        Stage stage = (Stage) offRoadButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void addRWDSedan() {
        System.out.println("Был выбран заднеприводный седан");
        this.garage.cars.add(new RWDSedanBuilder().getResult());
        Stage stage = (Stage) raceButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void addFWDSedan() {
        System.out.println("Был выбран переднеприводный седан");
        this.garage.cars.add(new FWDSedanBuilder().getResult());
        Stage stage = (Stage) regularCarButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void addCar() {
        System.out.println("Нажат большой плюсик");
//        garageGridPane.add(new TextArea("ЛОЛ"), 1, 0);
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("FXML/carSelect.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stage selectStage = new Stage();
        selectStage.initModality(Modality.WINDOW_MODAL);
        selectStage.initOwner(Main.getPrimaryStage());
        selectStage.setTitle("Выберите машинку");
        selectStage.setScene(new Scene(root, 500, 171));
        this.lastStage = selectStage;
        selectStage.show();
    }
}
