package fiuba.algo3.tp2.modelo.Entidad.Jugador;

import fiuba.algo3.tp2.modelo.Entidad.Herramienta.Herramienta;
import fiuba.algo3.tp2.modelo.Entidad.Materiales.Madera;
import fiuba.algo3.tp2.modelo.Entidad.Materiales.Material;
import fiuba.algo3.tp2.modelo.Entidad.Materiales.MaterialVacio;
import fiuba.algo3.tp2.modelo.Entidad.MesaDeCrafteo.TableroConstructor;

public class Jugador {
    private TableroConstructor mesaDeCrafteo;
    private Herramienta itemEquipado;

    public Jugador(){
        this.mesaDeCrafteo = new TableroConstructor();
        Material madera = new Madera();
        Material vacio = new MaterialVacio();
        this.mesaDeCrafteo.distribuirMateriales(madera,madera,vacio,madera,madera,vacio,vacio,madera,vacio);
        this.itemEquipado = this.mesaDeCrafteo.construirHerramienta();
    }

    public Herramienta construirHerramienta(Material material1,Material material2,Material material3,Material material4,Material material5,Material material6,Material material7,Material material8,Material material9){
        this.mesaDeCrafteo.distribuirMateriales(material1,material2,material3,material4,material5,material6,material7,material8,material9);
        return this.mesaDeCrafteo.construirHerramienta();
    }

    public void equiparHerramienta(Herramienta herramienta){
        this.itemEquipado = herramienta;
    }

    public Herramienta obtenerHerramientaEquipada(){
        return this.itemEquipado;
    }

    public void usarHerramientaContra(Material material){
        this.itemEquipado.usarContra(material);
    }

}