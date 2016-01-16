package com.tutorials._gui.address.view;

import com.tutorials._gui.address.Main;
import com.tutorials._gui.address.model.Person;
import com.tutorials._gui.address.util.DateUtil;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class PersonOverviewController {
    @FXML
    private TableView<Person> personTable;
    @FXML
    private TableColumn<Person, String> firstNameColumn;
    @FXML
    private TableColumn<Person, String> lastNameColumn;

    @FXML
    private Label firstNameLabel;
    @FXML
    private Label lastNameLabel;
    @FXML
    private Label streetLabel;
    @FXML
    private Label postalCodeLabel;
    @FXML
    private Label cityLabel;
    @FXML
    private Label birthdayLabel;

    private Main main;

    public PersonOverviewController() {}

    @FXML
    private void initialize() {
        firstNameColumn.setCellValueFactory(cellData -> cellData.getValue().
                firstNameProperty());
        lastNameColumn.setCellValueFactory(cellData -> cellData.getValue().
                lastNameProperty());

        showPersonDetails(null);

        personTable.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue) ->
                        showPersonDetails(newValue));
    }

    @FXML
    private void handleDeletePerson() {
        int selectedIndex = personTable.getSelectionModel().getSelectedIndex();

        if (selectedIndex >= 0) {
            personTable.getItems().remove(selectedIndex);
        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.initOwner(main.getPrimaryStage());
            alert.setTitle("No Selection");
            alert.setHeaderText("No Person Selected");
            alert.setContentText("Please select a person in the table.");
            alert.showAndWait();
        }
    }

    @FXML
    private void handleNewPerson() {
        Person tempPerson = new Person();
        boolean okClicked = main.showPersonEditDialog(tempPerson);

        if (okClicked) {
            main.getPersonData().add(tempPerson);
        }
    }

    @FXML
    private void handleEditPerson() {
        Person selectedPerson = personTable.getSelectionModel().
                getSelectedItem();

        if (selectedPerson != null) {
            boolean okClicked = main.showPersonEditDialog(selectedPerson);

            if (okClicked) {
                showPersonDetails(selectedPerson);
            }

        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.initOwner(main.getPrimaryStage());
            alert.setTitle("No Selection");
            alert.setHeaderText("No Person Selected");
            alert.setContentText("Please select a person in the table.");

            alert.showAndWait();
        }
    }

    public void setMain(Main main) {
        this.main = main;

        personTable.setItems(main.getPersonData());
    }

    private void showPersonDetails(Person person) {
        if (person != null) {
            firstNameLabel.setText(person.getFirstName());
            lastNameLabel.setText(person.getLastName());
            streetLabel.setText(person.getStreet());
            postalCodeLabel.setText(Integer.toString(person.getPostalCode()));
            cityLabel.setText(person.getCity());
            birthdayLabel.setText(DateUtil.format(person.getBirthday()));
        } else {
            firstNameLabel.setText("");
            lastNameLabel.setText("");
            streetLabel.setText("");
            postalCodeLabel.setText("");
            cityLabel.setText("");
            birthdayLabel.setText("");
        }
    }
}
