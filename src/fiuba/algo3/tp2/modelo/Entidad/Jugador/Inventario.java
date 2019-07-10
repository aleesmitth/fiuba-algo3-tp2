package fiuba.algo3.tp2.modelo.Entidad.Jugador;

import fiuba.algo3.tp2.modelo.Entidad.Herramienta.Hacha;
import fiuba.algo3.tp2.modelo.Entidad.Herramienta.Herramienta;
import fiuba.algo3.tp2.modelo.Entidad.Materiales.Madera;
import fiuba.algo3.tp2.modelo.Entidad.Materiales.Material;
import fiuba.algo3.tp2.modelo.Excepciones.UsarHerramientaRotaException;

import java.util.HashMap;
import java.util.Map;


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

        this.inventarioMateriales.put("M", 10);
        this.inventarioMateriales.put("P", 10);
        this.inventarioMateriales.put("A", 10);
        this.inventarioMateriales.put("D", 10);

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

    public void equiparHerramienta(Herramienta herramientaNueva){
        this.herramienta = herramientaNueva;
    }

    public void romperHerramienta(){
        this.herramienta = null;
    }

    public Herramienta getHerramienta() {
        try {
            if(this.herramienta == null) throw new UsarHerramientaRotaException("Se intento realizar una accion con una herramienta rota.");
        }catch(UsarHerramientaRotaException exception){
            System.out.println(exception.getMessage());
            System.exit(1);
        }
        return this.herramienta;
    }

    public String getCantidadDeMaterial(Material material){
        return this.inventarioMateriales.get(material.obtenerCodigoMaterial()).toString();
    }

    public boolean cambiarHerramientaEquipada(int posicionDeHerramientaEnInventario){
        if (this.inventarioHerramientas.get(posicionDeHerramientaEnInventario) != null) {
            this.equiparHerramienta(this.inventarioHerramientas.get(posicionDeHerramientaEnInventario));
            return true;
        }
        return false;
    }

    public void agregarHerramientaAlInventario(Herramienta herramienta) {
        Material materialDeLaHerramienta = herramienta.hechoDe();
        if (herramienta.esHacha()) {
            switch (materialDeLaHerramienta.obtenerCodigoMaterial()) {
                case "M":
                    this.inventarioHerramientas.replace(1, herramienta);
                    break;
                case "P":
                    this.inventarioHerramientas.put(2, herramienta);
                    break;
                case "A":
                    this.inventarioHerramientas.put(3, herramienta);
                    break;
            }
        }else if (herramienta.esPicoFino()) {
            this.inventarioHerramientas.put(7, herramienta);
        }else {
            switch (materialDeLaHerramienta.obtenerCodigoMaterial()) {
                case "M":
                    this.inventarioHerramientas.put(4,herramienta);
                    break;
                case "P":
                    this.inventarioHerramientas.put(5, herramienta);
                    break;
                case "A":
                    this.inventarioHerramientas.put(6, herramienta);
                    break;
            }



        }
    }

}
