package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    String text = "Your max heart rate is %d, target heart rate between %.0f and %.0f";

    @FXML
    private Label label;

    @FXML
    private TextField age;

    @FXML
    void initialize(){
        label.setText("");
    }

    @FXML
    void click(ActionEvent event) {
        int a = Integer.parseInt(age.getText());
        label.setText(
                String.format(
                        text,
                        220 - a,
                        (220 - a) * 0.5,
                        (220 - a) * 0.8)
        );
    }
}
