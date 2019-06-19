package fiuba.algo3.tp2.vista;

import fiuba.algo3.tp2.modelo.AlgoCraft.AlgoCraft;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ContenedorPrincipal extends BorderPane {

    BarraDeMenu menuBar;

    public ContenedorPrincipal(Stage stage, AlgoCraft algocraft) {
        this.setMenu(stage);

    }

    private void setMenu(Stage stage) {
        this.menuBar = new BarraDeMenu(stage);
        this.setTop(menuBar);
    }


}
