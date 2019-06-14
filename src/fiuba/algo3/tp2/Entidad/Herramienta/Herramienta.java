package fiuba.algo3.tp2.Entidad.Herramienta;

import fiuba.algo3.tp2.Entidad.Materiales.Material;

public abstract class Herramienta {

    protected AtributosHerramienta atributos;

    public int fuerza(){ return this.atributos.fuerza();}

    public int durabilidad(){
        return this.atributos.durabilidad();
    }

    public abstract void usarContra(Material material);

    public Material hechoDe(){ return this.atributos.hechoDe(); }

    protected void usarLaHerramienta(){};

}