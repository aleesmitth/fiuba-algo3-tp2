package fiuba.algo3.tp2.modelo.Entidad.Herramienta;

import fiuba.algo3.tp2.modelo.Entidad.Jugador.Inventario;
import fiuba.algo3.tp2.modelo.Entidad.Materiales.Material;

public class Pico extends Herramienta{

    public Pico(Material material) { this.atributos = material.crear(this); }

    public Pico(Material materialPrimario,Material materialSecundario) { this.atributos = materialPrimario.crear(this, materialSecundario); }

    @Override
    public void usarLaHerramienta(Inventario inventario){ this.atributos.usar(inventario); }

    @Override
    public void usarContra(Material material, Inventario inventario) {
        material.golpeadoPor(this,this.atributos.hechoDe(), inventario);
    }

    public boolean esPicoFino(){
        return this.atributos.esUsoFino();
    }

}
