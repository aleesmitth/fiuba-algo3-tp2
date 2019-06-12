package fiuba.algo3.tp2.Herramienta;

import fiuba.algo3.tp2.Materiales.Material;

public abstract class Herramienta {

    protected AtributosHerramienta atributos;

    public int fuerza(){ return this.atributos.fuerza();}

    public int durabilidad(){
        return this.atributos.durabilidad();
    }

    public Material hechoDe() { return this.atributos.hechoDe(); }

    public abstract void usarContra(Material material);

    protected void usarLaHerramienta(){};

}
