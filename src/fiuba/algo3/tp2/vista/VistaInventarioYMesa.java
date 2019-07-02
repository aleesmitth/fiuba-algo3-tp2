package fiuba.algo3.tp2.vista;

import javafx.geometry.Pos;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class VistaInventarioYMesa {

    private static GridPane MesaDeCrafteo = new GridPane();

    public static void Inventario(){
        Stage InventarioYMesa = new Stage();
        InventarioYMesa.initModality(Modality.APPLICATION_MODAL);
        InventarioYMesa.setMinHeight(600);
        InventarioYMesa.setMinWidth(800);
        MesaDeCrafteo.setAlignment(Pos.TOP_RIGHT);
        MesaDeCrafteo.setPrefSize(100,100);
        InventarioYMesa.setTitle("Inventario");
        ColumnConstraints columna1 = new ColumnConstraints();
        columna1.setPercentWidth(33);
        ColumnConstraints columna2 = new ColumnConstraints();
        columna2.setPercentWidth(33);
        ColumnConstraints columna3 = new ColumnConstraints();
        columna3.setPercentWidth(33);
        MesaDeCrafteo.getColumnConstraints().addAll(columna1,columna2,columna3);
        InventarioYMesa.showAndWait();
    }

    private void SetearTamanoGridPane(){

    }
}
