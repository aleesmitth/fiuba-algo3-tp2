package fiuba.algo3.tp2.vista;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class VistaInventario {

    public VistaInventario(GridPane contenedorInventario) {
        this.dibujar(contenedorInventario);
    }

    private void dibujar(GridPane contenedorInventario) {

        contenedorInventario.add(new Label("Inventario:"),0,0);
        contenedorInventario.add(new Label("Madera"),0,1);
        contenedorInventario.add(new Label("1"),1,1);
        contenedorInventario.add(new Label("Piedra"),0,2);
        contenedorInventario.add(new Label("0"),1,2);

        contenedorInventario.setMinSize(400, 200);
        contenedorInventario.setPadding(new Insets(10, 10, 10, 10));
        contenedorInventario.setVgap(5);
        contenedorInventario.setHgap(5);
        contenedorInventario.setAlignment(Pos.CENTER);
    }
}
