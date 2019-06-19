package fiuba.algo3.tp2.Entidad.Jugador;

import fiuba.algo3.tp2.Entidad.Herramienta.Herramienta;
import fiuba.algo3.tp2.Entidad.Materiales.Madera;
import fiuba.algo3.tp2.Entidad.Materiales.Material;
import fiuba.algo3.tp2.Entidad.MesaDeCrafteo.TableroConstructor;

public class Jugador {
    private TableroConstructor mesaDeCrafteo;
    private Herramienta itemEquipado;

    public Jugador(){
        this.mesaDeCrafteo = new TableroConstructor();

        /*
         * aca no estoy seguro si convendria hacer solamente new Hacha(new Madera());
         * son menos lineas pero no se si es muy orientado a objetos.
         *
         * BORRAR ESTE COMENTARIO!!.
         */
        this.agregarMaterialEnCasillero(new Madera(),0,0);
        this.agregarMaterialEnCasillero(new Madera(), 0,1);
        this.agregarMaterialEnCasillero(new Madera(), 1,0);
        this.agregarMaterialEnCasillero(new Madera(), 1,1);
        this.agregarMaterialEnCasillero(new Madera(), 2,1);
        this.itemEquipado = this.mesaDeCrafteo.construirHerramienta();
    }

    public Herramienta construirHerramienta(){ return this.mesaDeCrafteo.construirHerramienta(); }

    public void equiparHerramienta(Herramienta herramienta){
        this.itemEquipado = herramienta;
    }

    public Herramienta obtenerHerramientaEquipada(){
        return this.itemEquipado;
    }

    public void usarHerramientaContra(Material material){
        this.itemEquipado.usarContra(material);
    }

    public void agregarMaterialEnCasillero(Material material, int fila, int columna){ this.mesaDeCrafteo.agregarMaterialEnCasillero(material,fila,columna); }

}