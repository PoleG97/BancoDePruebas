package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.shape.Circle;

import java.util.Timer;
import java.util.TimerTask;

public class Controller {
    Model modelo = new Model();

    boolean marca = true;
    Timer temporizador = new Timer();
    TimerTask task = new FuncionARepetir();

    @FXML public Button btn;
    @FXML public TextField box;
    @FXML public Circle led2;
    @FXML public Circle led3;
    @FXML public Circle led1 = new Circle();

    public Controller() {

    }

    @FXML void click(ActionEvent event) {
        System.out.println(led1.getRadius());
        if (marca){
            temporizador.schedule(task, 0, 1000);
            task.run();
        }else {
            TimerTask taskAux = new FuncionARepetir();
            temporizador.schedule(taskAux,0, 1000);
        }
    }
}

class FuncionARepetir extends TimerTask {

    Circle led_Reset;

    public FuncionARepetir(){
    }

    public void run() {
        System.out.println(led_Reset.getRadius());
    }
}