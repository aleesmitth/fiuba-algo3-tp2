package fiuba.algo3.tp2.modelo.Entidad.MesaDeCrafteo;

import fiuba.algo3.tp2.modelo.Entidad.Herramienta.Herramienta;
import fiuba.algo3.tp2.modelo.Entidad.Materiales.Madera;
import fiuba.algo3.tp2.modelo.Entidad.Materiales.Material;
import fiuba.algo3.tp2.modelo.Entidad.Materiales.Metal;
import fiuba.algo3.tp2.modelo.Entidad.Materiales.Piedra;
import fiuba.algo3.tp2.modelo.Excepciones.RecetaIntroducidaNoExisteEnElJuegoException;

import java.util.HashMap;

import static fiuba.algo3.tp2.modelo.Juego.Juego.COLUMNAS_TABLERO_CONSTRUCTOR;
import static fiuba.algo3.tp2.modelo.Juego.Juego.FILAS_TABLERO_CONSTRUCTOR;

public class TableroConstructor {
    Casillero casilleros[][] = new Casillero[FILAS_TABLERO_CONSTRUCTOR][COLUMNAS_TABLERO_CONSTRUCTOR];
    Constructor constructor;
    HashMap<String, Herramienta> recetas = new HashMap<>();


    public TableroConstructor(){
        this.constructor = new Constructor();
        inicializarIndiceParaRecetas();
        inicializarMatrizCasillerosVacios();
    }

    private void inicializarMatrizCasillerosVacios() {
        for (int i = 0; i < FILAS_TABLERO_CONSTRUCTOR; i++) {
            for (int j = 0; j < COLUMNAS_TABLERO_CONSTRUCTOR; j++) {
                casilleros[i][j] = new Casillero();
            }

        }
    }

    private void limpiarTablero(){
        inicializarMatrizCasillerosVacios();
    }

    private void inicializarIndiceParaRecetas(){
        recetas.put("MMM-M--M-",constructor.construirPico(new Madera()));
        recetas.put("MM-MM--M-",constructor.construirHacha(new Madera()));
        recetas.put("PPP-M--M-",constructor.construirPico(new Piedra()));
        recetas.put("PP-PM--M-",constructor.construirHacha(new Piedra()));
        recetas.put("AAA-M--M-",constructor.construirPico(new Metal()));
        recetas.put("AA-AM--M-",constructor.construirHacha(new Metal()));
        recetas.put("AAAPM--M-",constructor.construirPico(new Metal(),new Piedra()));
    }

    private String obtenerCodigoHerramienta() {
        String codigo = "";
        for (int i = 0; i < FILAS_TABLERO_CONSTRUCTOR; i++){
            for(int j = 0; j< COLUMNAS_TABLERO_CONSTRUCTOR; j++) {
                codigo = codigo + this.casilleros[i][j].obtenerCodigoMaterial();
            }
        }
        return codigo;
    }


    public void agregarMaterialEnCasillero(Material material, int fila, int columna){
        casilleros[fila][columna].agregarMaterial(material);
    }

    public Herramienta construirHerramienta(){

        Herramienta herramienta = recetas.get(this.obtenerCodigoHerramienta());
        try {
            if(herramienta==null){
                throw new RecetaIntroducidaNoExisteEnElJuegoException("Ese patron no crea ningun objeto en AlgoCraft... por ahora");
            }
        }
        catch (RecetaIntroducidaNoExisteEnElJuegoException exception){
            System.out.println(exception.getMessage());
            System.exit(1);
        }
        limpiarTablero();
        return herramienta;
    }

}
