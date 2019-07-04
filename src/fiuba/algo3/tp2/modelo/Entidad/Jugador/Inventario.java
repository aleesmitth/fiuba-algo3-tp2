package fiuba.algo3.tp2.modelo.Entidad.Jugador;

import fiuba.algo3.tp2.modelo.Entidad.Herramienta.Hacha;
import fiuba.algo3.tp2.modelo.Entidad.Herramienta.Herramienta;
import fiuba.algo3.tp2.modelo.Entidad.Materiales.Madera;
import fiuba.algo3.tp2.modelo.Entidad.Materiales.Material;
import fiuba.algo3.tp2.modelo.Entidad.MesaDeCrafteo.Casillero;

import java.util.HashMap;
import java.util.Map;

import static fiuba.algo3.tp2.modelo.Juego.Juego.TOTAL_DE_MATERIALES;

public class Inventario {

    private Map<String, Integer> inventarioMateriales;
    private Map<Integer, Herramienta> inventarioHerramientas;
    private Herramienta herramienta;

    public Inventario(){
        inicializarInventarioMateriales();
        inicializarInventarioHerramientas();
    }

    private void inicializarInventarioMateriales(){
        this.inventarioMateriales = new HashMap<String, Integer>();

        /**
         * madera:M piedra:P metal:A diamante:D
         */

        this.inventarioMateriales.put("M", 0);
        this.inventarioMateriales.put("P", 0);
        this.inventarioMateriales.put("A", 0);
        this.inventarioMateriales.put("D", 0);

    }

    private void inicializarInventarioHerramientas(){
        this.inventarioHerramientas = new HashMap<Integer, Herramienta>();

        this.inventarioHerramientas.put(1, new Hacha(new Madera()));
    }

    public void agregarMaterial(Material material){
        this.inventarioMateriales.replace(material.obtenerCodigoMaterial(), this.inventarioMateriales.get(material.obtenerCodigoMaterial()) + 1);
    }

    public void sacarMaterial(Material material){
        this.inventarioMateriales.replace(material.obtenerCodigoMaterial(), this.inventarioMateriales.get(material.obtenerCodigoMaterial()) - 1);
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
        return this.inventarioMateriales.get(material.obtenerCodigoMaterial()).toString();
    }

    public void cambiarHerramientaEquipada(int posicionDeHerramientaEnInventario){
        this.equiparHerramienta(this.inventarioHerramientas.get(posicionDeHerramientaEnInventario));
    }

    public void agregarHerramientaAlInventario(Herramienta herramienta) {
        int size = this.inventarioHerramientas.size();
        if(size<7) {
            this.inventarioHerramientas.put(size + 1, herramienta);

        }
    }

}
