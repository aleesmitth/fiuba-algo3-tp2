package fiuba.algo3.tp2.modelo.Entidad.Herramienta;

import fiuba.algo3.tp2.modelo.Entidad.Jugador.Inventario;
import fiuba.algo3.tp2.modelo.Entidad.Materiales.Material;

public class Pico extends Herramienta{

    /**
     * pico de metal no cuenta los usos correctamente, guarda una cantidad de usos por cada tipo de material que golpea
     * ej 9 golpes madera + 9 golpes metal = no se rompe
     * 10 golpes a madera = se rompe
     * ------------------------------------
     * pico fino no esta funcionando, no mire bien que es lo que funciona mal pero creo que lo esta tomando como un pico normal
     * 
     */

    public Pico(Material material) { this.atributos = material.crear(this); }

    public Pico(Material materialPrimario,Material materialSecundario) { this.atributos = materialPrimario.crear(this, materialSecundario); }

    @Override
    public void usarLaHerramienta(Inventario inventario){ this.atributos.usar(inventario); }

    @Override
    public void usarContra(Material material, Inventario inventario) {
        material.golpeadoPor(this,this.atributos.hechoDe(), inventario);
    }

    public void usarContra(Material material, boolean esPicoFino, Inventario inventario) {
        material.golpeadoPor(this,this.atributos.hechoDe(),this.atributos.materialSecundario, inventario);
    }

}
