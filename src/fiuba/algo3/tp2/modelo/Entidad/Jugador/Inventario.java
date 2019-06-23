package fiuba.algo3.tp2.modelo.Entidad.Jugador;

import fiuba.algo3.tp2.modelo.Entidad.Herramienta.Herramienta;
import fiuba.algo3.tp2.modelo.Entidad.Materiales.Material;
import fiuba.algo3.tp2.modelo.Entidad.MesaDeCrafteo.Casillero;

import static fiuba.algo3.tp2.modelo.Juego.Juego.TOTAL_DE_MATERIALES;

/**
 * Index de Casillero[]: 0 = Madera
 *                       1 = Piedra
 *                       2 = Metal
 *                       3 = Diamante
 */


public class Inventario {
    private Casillero[] casilleroConMateriales = new Casillero[TOTAL_DE_MATERIALES];
    private Herramienta herramienta;

    public Inventario(){ inicializarArrayCasillerosVacios(); }
    private void inicializarArrayCasillerosVacios(){
        for (int i = 0; i < TOTAL_DE_MATERIALES; i++) {
            casilleroConMateriales[i] = new Casillero();
        }
    }
    public void agregarMaterial(Material material){ material.agregarAlInventario(this.casilleroConMateriales); }
    public void sacarMaterial(Material material){ material.sacarDelInventario(this.casilleroConMateriales); }
    public void equiparHerramienta(Herramienta herramienta){ this.herramienta = herramienta; }
    public void romperHerramienta(){ this.herramienta = null; }
    public Herramienta getHerramienta() { return this.herramienta; }
}
