package controller;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

    public class CalculatorController implements Initializable {

        private int counter = 0;
        private int operation = 1;
        private int stelle = 0;
        private int stelleBeginn=0;
        @FXML
        private Label anzeige;
        @FXML
        private Button button1;
        @FXML
        private Button button2;
        @FXML
        private Button button3;
        @FXML
        private Button button4;
        @FXML
        private Button button5;
        @FXML
        private Button button6;
        @FXML
        private Button button7;
        @FXML
        private Button button8;
        @FXML
        private Button button9;
        @FXML
        private Button button0;
        @FXML
        private Button buttonPlus;
        @FXML
        private Button buttonMinus;
        @FXML
        private Button buttonMal;
        @FXML
        private Button buttonDivision;
        @FXML
        private Button buttonClear;
        @FXML
        private Button buttonEquals;
        @FXML
        private void handleButton1(ActionEvent event){

                anzeige.setText(anzeige.getText()+"1");
                stelle++;
        }
        @FXML
        private void handleButton2(ActionEvent event){

            anzeige.setText(anzeige.getText()+"2");
            stelle++;
        }
        @FXML
        private void handleButton3(ActionEvent event){

            anzeige.setText(anzeige.getText()+"3");
            stelle++;
        }
        @FXML
        private void handleButton4(ActionEvent event){

            anzeige.setText(anzeige.getText()+"4");
            stelle++;
        }
        @FXML
        private void handleButton5(ActionEvent event){

            anzeige.setText(anzeige.getText()+"5");
            stelle++;
        }
        @FXML
        private void handleButton6(ActionEvent event){

            anzeige.setText(anzeige.getText()+"6");
            stelle++;
        }
        @FXML
        private void handleButton7(ActionEvent event){

            anzeige.setText(anzeige.getText()+"7");
            stelle++;
        }
        @FXML
        private void handleButton8(ActionEvent event){

            anzeige.setText(anzeige.getText()+"8");
            stelle++;
        }
        @FXML
        private void handleButton9(ActionEvent event){

            anzeige.setText(anzeige.getText()+"9");
            stelle++;
        }
        @FXML
        private void handleButton0(ActionEvent event){

            anzeige.setText(anzeige.getText()+"0");
            stelle++;
        }
        @FXML
        private void handleButtonPlus(ActionEvent event){

            berechnung();
            operation = 1;
            anzeige.setText(anzeige.getText()+"+");
            stelle++;
            stelleBeginn = stelle;
        }
        @FXML
        private void handleButtonMinus(ActionEvent event){
            berechnung();
            operation = 2;
            anzeige.setText(anzeige.getText()+"-");
            stelle++;
            stelleBeginn = stelle;
        }
        @FXML
        private void handleButtonMal(ActionEvent event){
            berechnung();
            operation = 3;
            anzeige.setText(anzeige.getText()+"x");
            stelle++;
            stelleBeginn = stelle;
        }
        @FXML
        private void handleButtonDivision(ActionEvent event){

            berechnung();
            operation = 4;
            anzeige.setText(anzeige.getText()+"/");
            stelle++;
            stelleBeginn = stelle;
        }
        @FXML
        private void handleButtonClear(ActionEvent event){

            anzeige.setText("");
            stelle = 0;
            stelleBeginn = 0;
            operation = 1;
            counter = 0;
        }
        @FXML
        private void handleButtonErgebnis(ActionEvent event){

            berechnung();
            anzeige.setText(anzeige.getText()+"="+counter);
            stelle = 0;
            stelleBeginn = 0;
        }

        private void berechnung(){

            if(operation==1){
                counter = counter + Integer.parseInt(anzeige.getText().substring(stelleBeginn, stelle));

            }
            if(operation==2){
                counter = counter - Integer.parseInt(anzeige.getText().substring(stelleBeginn, stelle));

            }
            if(operation==3){
                counter = counter * Integer.parseInt(anzeige.getText().substring(stelleBeginn, stelle));

            }
            if(operation==4){
                counter = counter / Integer.parseInt(anzeige.getText().substring(stelleBeginn, stelle));

            }
        }
        @Override
        public void initialize(URL location, ResourceBundle resources) {
        }


    }

