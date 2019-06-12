package fiuba.algo3.tp2.Herramienta;

import fiuba.algo3.tp2.Materiales.Material;

public abstract class AtributosHerramienta {

    protected int durabilidad;
    protected int fuerza;
    protected double desgaste;
    protected Material materialPrimario;
    protected Material materialSecundario;



    public int fuerza(){ return this.fuerza;}

    public void usar(){ this.durabilidad-=this.desgaste;}

    public int durabilidad(){ return this.durabilidad; }

    public Material hechoDe(){ return this.materialPrimario; }

}
