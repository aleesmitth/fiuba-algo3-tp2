package fiuba.algo3.tp2.modelo.Entidad.Herramienta;

import fiuba.algo3.tp2.modelo.Entidad.Materiales.Material;

public class Pico extends Herramienta{

    public Pico(Material material) { this.atributos = material.crear(this); }

    public Pico(Material materialPrimario,Material materialSecundario) { this.atributos = materialPrimario.crear(this, materialSecundario); }

    public void usarLaHerramienta(){ this.atributos.usar(); }

    @Override
    public void usarContra(Material material) {
        material.golpeadoPor(this,this.atributos.hechoDe());
    }

    public void usarContra(Material material,boolean esPicoFino) {
        material.golpeadoPor(this,this.atributos.hechoDe(),this.atributos.materialSecundario);
    }

}
