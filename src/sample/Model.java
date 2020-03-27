package sample;

import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

public class Model {
    public Paint colorear(boolean Salida){
        if (Salida){
            return Color.GREEN;
        }else{
            return Color.GRAY;
        }
    }
}
