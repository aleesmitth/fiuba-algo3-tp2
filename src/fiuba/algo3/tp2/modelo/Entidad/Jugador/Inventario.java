package fiuba.algo3.tp2.modelo.Entidad.Jugador;

import fiuba.algo3.tp2.modelo.Entidad.Herramienta.Herramienta;
import fiuba.algo3.tp2.modelo.Entidad.Materiales.Material;
import fiuba.algo3.tp2.modelo.Entidad.MesaDeCrafteo.Casillero;

import java.util.HashMap;
import java.util.Map;

import static fiuba.algo3.tp2.modelo.Juego.Juego.TOTAL_DE_MATERIALES;

/**
 * Index de Casillero[]: 0 = Madera
 *                       1 = Piedra
 *                       2 = Metal
 *                       3 = Diamante
 */


public class Inventario {

    private Map<String, Integer> inventario;
    private Herramienta herramienta;

    public Inventario(){
        inicializarHashmap();
    }

    public void inicializarHashmap(){
        this.inventario = new HashMap<String, Integer>();

        /**
         * madera:M piedra:P metal:A diamante:D
         */

        this.inventario.put("M", 0);
        this.inventario.put("P", 0);
        this.inventario.put("A", 0);
        this.inventario.put("D", 0);

    }

    public void agregarMaterial(Material material){
        int cantidadVieja = inventario.get(material.obtenerCodigoMaterial());

        inventario.replace(material.obtenerCodigoMaterial(),cantidadVieja++);
    }

    public void sacarMaterial(Material material){
        int cantidadVieja = inventario.get(material.obtenerCodigoMaterial());

        inventario.replace(material.obtenerCodigoMaterial(),cantidadVieja--);
    }

    public void equiparHerramienta(Herramienta herramienta){
        this.herramienta = herramienta;
    }

    public void romperHerramienta(){
        this.herramienta = null;
    }

    public Herramienta getHerramienta() {
        return this.herramienta;
    }



    public String getCantidadDeMaterial(Material material){
        return this.inventario.get(material.obtenerCodigoMaterial()).toString();
    }
}
